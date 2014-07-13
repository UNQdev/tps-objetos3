package tp5.dslexterno.xtext

import com.google.inject.Injector
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia
import tp5.dslexterno.xtext.planificacionMaterias.Model
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion
import tp5.dslexterno.xtext.planificacionMaterias.Profesor
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario
import tp5.dslexterno.xtext.validation.PlanificacionMateriasValidator
import tp5.dslexterno.xtext.planificacionMaterias.Dia
import java.util.List

class PlanificacionMateriasInterpreter {
	
	extension PlanificacionMateriasValidator dsl = new PlanificacionMateriasValidator

	def static void main(String[] args) {
		if (args.isEmpty) {
			throw new RuntimeException("El interprete necesita la ruta completa a un archivo .pmdsl como argumento")
		}
		val fileName = args.get(0)
		val model = parsear(fileName)
		new PlanificacionMateriasInterpreter().interpret(model)
	}
	
	def static parsear(String fileName) {
		val injector = new PlanificacionMateriasStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		val resource = resourceSet.createResource(URI.createURI(fileName))
		validate(injector, resource)
		resource.load(#{})
		resource.contents.get(0) as Model
	}
	
	def static validate(Injector injector, Resource resource) {
		val validator = injector.getInstance(IResourceValidator)
		val issues = validator.validate(resource, CheckMode.ALL, null)
		if (!issues.isEmpty) {
			issues.forEach[println(it.toString)]
			System.exit(-1)
		}
	}
	
	def interpret(Model model) {
		var planificacion = model.planificacion
		println('''
			Planificacion del año: «planificacion.anio» semestre: «planificacion.semestre»:
				«aulaMasUtilizada(planificacion)»
				
				«porcentajePorTurnoDeMateriasDictadas(planificacion)»
				
				«materiasDictadasPorCadaProfesor(planificacion, model.profesoresLibres)»
				
				Horarios Libres: 
				«horariosEnLosQueNoSeDictanMaterias(planificacion)»
		''')
	}
	
	/*
	 * AULA MAS UTILIZADA
	 */
	def aulaMasUtilizada(Planificacion planificacion){
		var asignacionesOrdenadasPorCantHoras = planificacion.asignacionesDeMaterias.sortBy[horasAsignadas]
		var aulaMasUtilizada = asignacionesOrdenadasPorCantHoras.last.aula.name
		'''Aula mas utilizada: «aulaMasUtilizada»'''
	}
	
	/*
	 * HORARIOS SIN MATERIAS ASIGNADAS
	 */
	 
	def horariosEnLosQueNoSeDictanMaterias(Planificacion planificacion){
		val horariosOcupados = planificacion.asignacionesDeMaterias.map[asignacionesDiarias].flatten.toList
		val buffer = new StringBuffer
		Dia.values.forEach[d| 
			var horariosDelDia = horariosOcupados.filter[dia == d].toList
			var horariosLibres = horariosDelDia.calcularHorariosLibres
			buffer.append('''«d»: «horariosLibres.rangosHorario»
						  ''')
		]
		buffer.toString
	}
	
	def calcularHorariosLibres(List<Asignacion_Diaria> horariosOcupados){
		val horariosLibres = new ArrayList()
		(8..21).forEach[i|
			if(!horariosOcupados.exists[rangoHorario.incluyeAlRango(i, i+1)]){
				horariosLibres.add(i)
			}
		]
		horariosLibres
	}
	
	def rangosHorario(List<Integer> horarios) {
		val buffer = new StringBuffer()
		val lista2 = horarios.tail()
		(0..(lista2.size-1)).forEach[i| 
			if(horarios.get(i)+1 == lista2.get(i)){
				buffer.append(''' de «horarios.get(i)» a «lista2.get(i)»
							  ''')
			} else {
				buffer.append(''' de «horarios.get(i)» a «horarios.get(i)+1»
							  ''')
			}
		]
		buffer.toString
	}
	
	def boolean incluyeAlRango(Rango_Horario horario, int horaInicioRango, int horaFinRango) {
		horario.horaInicio.hora <= horaInicioRango && horario.horaFinal.hora >= horaFinRango
	}
	
	/*
	 * PROCENTAJE DE MATERIAS DICTADAS POR TURNO
	 * 
	 * Turno Mañana: 08:00 a 13:00
	 * Turno Tarde: 13:00 a 18:00
	 * Turno Noche: 18:00 a 22:00
	 * 
	 */
	def String porcentajePorTurnoDeMateriasDictadas(Planificacion planificacion){
		var asignaciones = planificacion.asignacionesDeMaterias
		'''Porcentaje de materias dictadas
			a la mañana: «asignacionesPorTurno(asignaciones, 8, 13)»%,
			a la tarde: «asignacionesPorTurno(asignaciones, 13, 18)»%,
			a la noche: «asignacionesPorTurno(asignaciones, 18, 22)»%
		'''
	}
	
	def asignacionesPorTurno(EList<Asignacion_Materia> asignaciones, int inicioTurno, int finTurno) {
		var asignacionesTurno = asignaciones.filter[asignacionesDiarias.pertenecenAlTurno(inicioTurno, finTurno)]
		(asignacionesTurno.size * 100) / asignaciones.size
	}
	
	def boolean pertenecenAlTurno(EList<Asignacion_Diaria> asignacionesDiarias, int inicioTurno, int finTurno){
		asignacionesDiarias.exists[rangoHorario.esTurno(inicioTurno, finTurno) || rangoHorario.incluyeTurno(inicioTurno, finTurno)]
	}
	
	def boolean esTurno(Rango_Horario horario, int horaInicio, int horaFin){
		horaInicio <= horario.horaInicio.hora && horario.horaFinal.hora <= horaFin
	}
	
	def boolean incluyeTurno(Rango_Horario horario,  int horaInicioTurno, int horaFinTurno) {
		horario.horaInicio.hora <= horaInicioTurno && horaFinTurno <=  horario.horaFinal.hora
	}
	
	
	/*
	 * LISTADO DE PROFESORES CON LAS MATERIAS QUE ESTA DICTANDO
	 */
	
	def String materiasDictadasPorCadaProfesor(Planificacion planificacion, EList<Profesor> profesores){
		val listaResultadoDeProfesoresConSusMaterias = new StringBuilder
		val asignacionesDeMaterias = planificacion.asignacionesDeMaterias
		profesores.forEach[var materiasPorProfesor = '''El profesor «it.name» dicta: «materiasDictadasPor(asignacionesDeMaterias)»
													 '''
			listaResultadoDeProfesoresConSusMaterias.append(materiasPorProfesor)
		]
		listaResultadoDeProfesoresConSusMaterias.toString
	}
	
	def materiasDictadasPor(Profesor profesor0, EList<Asignacion_Materia> asignacionesDeMaterias) {
		var listaDeMaterias = asignacionesDeMaterias.filter[profesor == profesor0].map[materia.name].toList
		if(listaDeMaterias.empty){
			'''ninguna materia este semestre'''
		} else{
			listaDeMaterias.toString
		}
	}
}
