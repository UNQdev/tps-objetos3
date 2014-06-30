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
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getElementosPlanificacion <em>Elementos Planificacion</em>}</li>
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
   * Returns the value of the '<em><b>Elementos Planificacion</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Estructuras_Planificacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos Planificacion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos Planificacion</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_ElementosPlanificacion()
   * @model containment="true"
   * @generated
   */
  EList<Estructuras_Planificacion> getElementosPlanificacion();

  /**
   * Returns the value of the '<em><b>Planificacion</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planificacion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planificacion</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_Planificacion()
   * @model containment="true"
   * @generated
   */
  EList<Planificacion> getPlanificacion();

} // Model
