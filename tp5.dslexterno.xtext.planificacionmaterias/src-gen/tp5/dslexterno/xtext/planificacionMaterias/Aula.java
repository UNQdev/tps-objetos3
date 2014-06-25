/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getNumero <em>Numero</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getRecusos <em>Recusos</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAula()
 * @model
 * @generated
 */
public interface Aula extends EObject
{
  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numero</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(String)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAula_Numero()
   * @model
   * @generated
   */
  String getNumero();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(String value);

  /**
   * Returns the value of the '<em><b>Recusos</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Recurso}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recusos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recusos</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAula_Recusos()
   * @model containment="true"
   * @generated
   */
  EList<Recurso> getRecusos();

} // Aula
