package tp5.dslexterno.xtext

import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import tp5.dslexterno.xtext.planificacionMaterias.Model
import com.google.inject.Injector
import javax.annotation.Resource
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.validation.CheckMode
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion
import tp5.dslexterno.xtext.planificacionMaterias.Aula
import org.eclipse.emf.common.util.EList
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario
import java.util.List
import java.util.HashMap
import tp5.dslexterno.xtext.planificacionMaterias.Dia
import tp5.dslexterno.xtext.planificacionMaterias.Horario

class PlanificacionMateriasInterpreter {

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
		
//		validate(injector, resource)
		
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
		
	}
	
	
	/*
	 * AULA MAS UTILIZADA
	 */
	def aulaMasUtilizada(Model modelo){
		val aulas = modelo.aulasDisponibles
		val planificacion = modelo.planificacion
//		val planificaciones = modelo.planificaciones
//		planificaciones.forEach[planificacion | 
			val aulasUtilizadas = planificacion.asignacionesDeMaterias.map[asignacionMateria | asignacionMateria.aula]
			
			
			
			
			
						
//			aulasMasUtilizadas.forEach[aula | println(planificacion.anio +" - "+ planificacion.semestre +" semestre: " aula.name.toUpperCase)]
//		]		
	}
	
	/*
	 * HORARIOS SIN MATERIAS ASIGNADAS
	 */
	def horariosEnLosQueNoSeDictanMaterias(Model modelo){
		val planificacion = modelo.planificacion
		val horariosCubiertos = planificacion.asignacionesDeMaterias.horariosCubiertos
//		val planificaciones = modelo.planificaciones
//		planificaciones.forEach[planificacion | 
			
			
			
			
			
//		]
	}	
	def List<Rango_Horario> horariosCubiertos(EList<Asignacion_Materia> asignaciones){
		var horarios = asignaciones.map[asignacionMateria | 
						asignacionMateria.asignacionesDiarias.map[asignacionDiaria | 
																	asignacionDiaria.rangoHorario ]
						].flatten.toList
		horarios
	}	
		
	
	
	
	/*
	 * PROCENTAJE DE MATERIAS DICTADAS POR TURNO
	 * 
	 * Turno Mañana: 08:00 a 13:00
	 * Turno Tarde: 13:00 a 18:00
	 * Turno Noche: 18:00 a 22:00
	 * 
	 */
	def void porcentajePorTurnoDeMateriasDictadas(Model modelo){
		
	}
	
	
	/*
	 * LISTADO DE PROFESORES CON LAS MATERIAS QUE ESTA DICTANDO
	 */
	def void materiasDictadasPorCadaProfesor(Model modelo){
		
	}
	
	
	
	
	
}