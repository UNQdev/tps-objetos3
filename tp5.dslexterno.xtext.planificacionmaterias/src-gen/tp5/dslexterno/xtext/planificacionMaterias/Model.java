/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getProfesoresLibres <em>Profesores Libres</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getAulasDisponibles <em>Aulas Disponibles</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getMateriasAbiertas <em>Materias Abiertas</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getPlanificacion <em>Planificacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Profesores Libres</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Profesor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profesores Libres</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profesores Libres</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_ProfesoresLibres()
   * @model containment="true"
   * @generated
   */
  EList<Profesor> getProfesoresLibres();

  /**
   * Returns the value of the '<em><b>Aulas Disponibles</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Aula}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aulas Disponibles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aulas Disponibles</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_AulasDisponibles()
   * @model containment="true"
   * @generated
   */
  EList<Aula> getAulasDisponibles();

  /**
   * Returns the value of the '<em><b>Materias Abiertas</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materias Abiertas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materias Abiertas</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_MateriasAbiertas()
   * @model containment="true"
   * @generated
   */
  EList<Materia> getMateriasAbiertas();

  /**
   * Returns the value of the '<em><b>Planificacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planificacion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planificacion</em>' containment reference.
   * @see #setPlanificacion(Planificacion)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_Planificacion()
   * @model containment="true"
   * @generated
   */
  Planificacion getPlanificacion();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getPlanificacion <em>Planificacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Planificacion</em>' containment reference.
   * @see #getPlanificacion()
   * @generated
   */
  void setPlanificacion(Planificacion value);

} // Model
