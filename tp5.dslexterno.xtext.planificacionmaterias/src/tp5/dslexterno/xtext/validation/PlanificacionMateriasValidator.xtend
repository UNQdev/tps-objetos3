/*
 * generated by Xtext
 */
package tp5.dslexterno.xtext.validation

import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import tp5.dslexterno.xtext.planificacionMaterias.Aula
import tp5.dslexterno.xtext.planificacionMaterias.Exclusiva
import tp5.dslexterno.xtext.planificacionMaterias.Materia
import tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage
import tp5.dslexterno.xtext.planificacionMaterias.Profesor
import tp5.dslexterno.xtext.planificacionMaterias.Semi
import tp5.dslexterno.xtext.planificacionMaterias.Simple

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PlanificacionMateriasValidator extends AbstractPlanificacionMateriasValidator {


	/*
	 * Validaciones iniciales
	 */

//	@Check
//	def validarCargaHorariaDocente(Materia materia){
//		var planificacion = ((materia.eContainer as Estructuras_Planificacion).eContainer as Model).planificacion
//		var profesor = materia.profesor
//		if(profesor.cantMateriasSegunDedicacion < planificacion.cantidadMateriasDictadasPor(profesor)){
//			error('''El profesor «profesor.name.toUpperCase» supera el limite de su dedicacion''', materia,
//				PlanificacionMateriasPackage.Literals.MATERIA__PROFESOR) //Mensaje, Objeto que no cumple la validacion, Property del objeto que falla
//		}
//	}
	
	@Check
	def validarCargaHorariaDocente(Materia materia){
		var listaMaterias = (materia.eContainer as Materias_Abiertas).materiasAbiertas
		var profesor = materia.profesor
		if(profesor.cantMateriasSegunDedicacion < listaMaterias.cantidadMateriasDictadasPor(profesor)){
			error('''El profesor «profesor.name.toUpperCase» supera el limite de su dedicacion''', materia,
				PlanificacionMateriasPackage.Literals.MATERIA__PROFESOR) //Mensaje, Objeto que no cumple la validacion, Property del objeto que falla
		}
	}
	
	@Check
	def validarTodasLasMateriasAsignadas(Planificacion planificacion){
		var mADictar = planificacion.materiasADictar.map[m| m.name]
		var mAsignadas = planificacion.asignacionDeMaterias.map[m| m.materia.name]
		if(! mAsignadas.containsAll(mADictar)){
			error('''Falta asignar alguna materia :P''', planificacion,
				PlanificacionMateriasPackage.Literals.PLANIFICACION__ASIGNACION_DE_MATERIAS)
		} // Mejorar mensaje de error... Deberia reconocer las materias que no estan asignadas.
	}
	
	@Check
	def validarCargaHorariaMateria(Materia m){
		
	}
		
	@Check
	def validarCompatibilidadAulaMateria(Materia materia){
		var recursosAula = materia.aula.recusos.map[ r | r.name]
		var requerimientosMateria = materia.requerimientos.map[ r | r.name]
		if (! recursosAula.containsAll(requerimientosMateria)){
			error('''El aula «materia.aula.name.toUpperCase» no tiene los recursos requeridos''', materia,
				PlanificacionMateriasPackage.Literals.MATERIA__AULA)
		}
	}
	
	@Check
	def validarSuperposicionEntreMaterias(Materia materia){
		
	}	
	
	
	
	/*
	 * Validaciones de puntos bonus
	 */
	@Check
	def validarCapacidadAula(Aula aula){
		
	}
	
	@Check
	def validarDisponibilidadProfesor(Materia materia){
		
	}
	
	
	
	
	
	/*
	 * Validaciones extras
	 */
	@Check
	def validadDisponibilidadENProfesor(Profesor profesor){
		//para validar que la disponibilidad DEL profesor este bien definida
	}
	
	
	
	
	
	/*
	 * Comportamiento agregado via extension methods
	 */
	def int cantidadMateriasDictadasPor(Planificacion planificacion, Profesor profesor){
		var listaMaterias = planificacion.asignacionDeMaterias.map[asignacion | asignacion.materia]
		listaMaterias.filter[m | m.dictadaPor.equals(profesor)].size
	}
	
	def int cantidadMateriasDictadasPor(EList<Materia> listaMaterias, Profesor profesor){
		listaMaterias.filter[m | m.dictadaPor.equals(profesor)].size
	}
	
	def Profesor dictadaPor(Materia materia){
		return materia.profesor
	}

	def int cantMateriasSegunDedicacion(Profesor profesor) {
		return (profesor.dedicacion).cantidadMaterias
	}

	def dispatch int cantidadMaterias(Simple dedicacion) { return 1 }
	def dispatch int cantidadMaterias(Semi dedicacion) { return 2 }
	def dispatch int cantidadMaterias(Exclusiva dedicacion) { return 5 }

}
