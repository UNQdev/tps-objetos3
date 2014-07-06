/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Diaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getAsignacionesDeMaterias <em>Asignaciones De Materias</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria()
 * @model
 * @generated
 */
public interface Asignacion_Diaria extends EObject
{
  /**
   * Returns the value of the '<em><b>Dia</b></em>' attribute.
   * The literals are from the enumeration {@link tp5.dslexterno.xtext.planificacionMaterias.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia</em>' attribute.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see #setDia(Dia)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Asignaciones De Materias</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asignaciones De Materias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asignaciones De Materias</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria_AsignacionesDeMaterias()
   * @model containment="true"
   * @generated
   */
  EList<Asignacion_Materia> getAsignacionesDeMaterias();

} // Asignacion_Diaria
