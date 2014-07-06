/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disponibilidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getRangosHorario <em>Rangos Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getDisponibilidad()
 * @model
 * @generated
 */
public interface Disponibilidad extends EObject
{
  /**
   * Returns the value of the '<em><b>Dia</b></em>' attribute.
   * The literals are from the enumeration {@link tp5.dslexterno.xtext.planificacionMaterias.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia</em>' attribute.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see #setDia(Dia)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getDisponibilidad_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Rangos Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rangos Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rangos Horario</em>' containment reference.
   * @see #setRangosHorario(Rango_Horario)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getDisponibilidad_RangosHorario()
   * @model containment="true"
   * @generated
   */
  Rango_Horario getRangosHorario();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getRangosHorario <em>Rangos Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rangos Horario</em>' containment reference.
   * @see #getRangosHorario()
   * @generated
   */
  void setRangosHorario(Rango_Horario value);

} // Disponibilidad
