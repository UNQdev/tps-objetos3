/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nomina Profesores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores#getProfesoresLibres <em>Profesores Libres</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getNomina_Profesores()
 * @model
 * @generated
 */
public interface Nomina_Profesores extends Estructuras_Planificacion
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getNomina_Profesores_ProfesoresLibres()
   * @model containment="true"
   * @generated
   */
  EList<Profesor> getProfesoresLibres();

} // Nomina_Profesores
