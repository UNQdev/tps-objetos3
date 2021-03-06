/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage
 * @generated
 */
public interface PlanificacionMateriasFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanificacionMateriasFactory eINSTANCE = tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Planificacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Planificacion</em>'.
   * @generated
   */
  Planificacion createPlanificacion();

  /**
   * Returns a new object of class '<em>Asignacion Materia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asignacion Materia</em>'.
   * @generated
   */
  Asignacion_Materia createAsignacion_Materia();

  /**
   * Returns a new object of class '<em>Asignacion Diaria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asignacion Diaria</em>'.
   * @generated
   */
  Asignacion_Diaria createAsignacion_Diaria();

  /**
   * Returns a new object of class '<em>Materia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Materia</em>'.
   * @generated
   */
  Materia createMateria();

  /**
   * Returns a new object of class '<em>Profesor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Profesor</em>'.
   * @generated
   */
  Profesor createProfesor();

  /**
   * Returns a new object of class '<em>Disponibilidad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disponibilidad</em>'.
   * @generated
   */
  Disponibilidad createDisponibilidad();

  /**
   * Returns a new object of class '<em>Dedicacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dedicacion</em>'.
   * @generated
   */
  Dedicacion createDedicacion();

  /**
   * Returns a new object of class '<em>Aula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aula</em>'.
   * @generated
   */
  Aula createAula();

  /**
   * Returns a new object of class '<em>Recurso</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recurso</em>'.
   * @generated
   */
  Recurso createRecurso();

  /**
   * Returns a new object of class '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horario</em>'.
   * @generated
   */
  Horario createHorario();

  /**
   * Returns a new object of class '<em>Rango Horario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rango Horario</em>'.
   * @generated
   */
  Rango_Horario createRango_Horario();

  /**
   * Returns a new object of class '<em>Disponible</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disponible</em>'.
   * @generated
   */
  Disponible createDisponible();

  /**
   * Returns a new object of class '<em>No Disponible</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Disponible</em>'.
   * @generated
   */
  No_Disponible createNo_Disponible();

  /**
   * Returns a new object of class '<em>Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple</em>'.
   * @generated
   */
  Simple createSimple();

  /**
   * Returns a new object of class '<em>Semi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semi</em>'.
   * @generated
   */
  Semi createSemi();

  /**
   * Returns a new object of class '<em>Exclusiva</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclusiva</em>'.
   * @generated
   */
  Exclusiva createExclusiva();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PlanificacionMateriasPackage getPlanificacionMateriasPackage();

} //PlanificacionMateriasFactory
