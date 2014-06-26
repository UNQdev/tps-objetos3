/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materias Abiertas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas#getMateriasAbiertas <em>Materias Abiertas</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMaterias_Abiertas()
 * @model
 * @generated
 */
public interface Materias_Abiertas extends Estructuras_Planificacion
{
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMaterias_Abiertas_MateriasAbiertas()
   * @model containment="true"
   * @generated
   */
  EList<Materia> getMateriasAbiertas();

} // Materias_Abiertas
