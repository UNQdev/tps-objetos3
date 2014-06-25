/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aulas Disponibles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles#getAulas <em>Aulas</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAulas_Disponibles()
 * @model
 * @generated
 */
public interface Aulas_Disponibles extends Elementos
{
  /**
   * Returns the value of the '<em><b>Aulas</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Aula}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aulas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aulas</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAulas_Disponibles_Aulas()
   * @model containment="true"
   * @generated
   */
  EList<Aula> getAulas();

} // Aulas_Disponibles
