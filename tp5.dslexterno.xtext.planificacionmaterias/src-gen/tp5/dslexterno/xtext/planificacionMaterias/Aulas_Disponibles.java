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
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles#getAulasDisponibles <em>Aulas Disponibles</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAulas_Disponibles()
 * @model
 * @generated
 */
public interface Aulas_Disponibles extends Estructuras_Planificacion
{
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAulas_Disponibles_AulasDisponibles()
   * @model containment="true"
   * @generated
   */
  EList<Aula> getAulasDisponibles();

} // Aulas_Disponibles
