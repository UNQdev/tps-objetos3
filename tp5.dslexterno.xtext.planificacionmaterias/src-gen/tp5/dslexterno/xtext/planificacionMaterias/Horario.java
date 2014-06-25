/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getHora <em>Hora</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getMinutos <em>Minutos</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getHorario()
 * @model
 * @generated
 */
public interface Horario extends EObject
{
  /**
   * Returns the value of the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora</em>' attribute.
   * @see #setHora(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getHorario_Hora()
   * @model
   * @generated
   */
  int getHora();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getHora <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora</em>' attribute.
   * @see #getHora()
   * @generated
   */
  void setHora(int value);

  /**
   * Returns the value of the '<em><b>Minutos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutos</em>' attribute.
   * @see #setMinutos(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getHorario_Minutos()
   * @model
   * @generated
   */
  int getMinutos();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getMinutos <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutos</em>' attribute.
   * @see #getMinutos()
   * @generated
   */
  void setMinutos(int value);

} // Horario
