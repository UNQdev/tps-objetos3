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
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getElementos <em>Elementos</em>}</li>
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
   * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Elementos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getModel_Elementos()
   * @model containment="true"
   * @generated
   */
  EList<Elementos> getElementos();

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
