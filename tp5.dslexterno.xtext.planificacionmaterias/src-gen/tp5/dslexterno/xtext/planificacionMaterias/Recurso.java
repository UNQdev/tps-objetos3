/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Recurso#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getRecurso()
 * @model
 * @generated
 */
public interface Recurso extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getRecurso_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Recurso#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

} // Recurso
