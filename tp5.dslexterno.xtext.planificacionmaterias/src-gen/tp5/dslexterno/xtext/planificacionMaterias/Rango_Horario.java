/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rango Horario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraFinal <em>Hora Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getRango_Horario()
 * @model
 * @generated
 */
public interface Rango_Horario extends EObject
{
  /**
   * Returns the value of the '<em><b>Hora Inicio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora Inicio</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora Inicio</em>' containment reference.
   * @see #setHoraInicio(Horario)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getRango_Horario_HoraInicio()
   * @model containment="true"
   * @generated
   */
  Horario getHoraInicio();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraInicio <em>Hora Inicio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora Inicio</em>' containment reference.
   * @see #getHoraInicio()
   * @generated
   */
  void setHoraInicio(Horario value);

  /**
   * Returns the value of the '<em><b>Hora Final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora Final</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora Final</em>' containment reference.
   * @see #setHoraFinal(Horario)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getRango_Horario_HoraFinal()
   * @model containment="true"
   * @generated
   */
  Horario getHoraFinal();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraFinal <em>Hora Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora Final</em>' containment reference.
   * @see #getHoraFinal()
   * @generated
   */
  void setHoraFinal(Horario value);

} // Rango_Horario
