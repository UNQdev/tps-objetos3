/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Diaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getRangoHorario <em>Rango Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria()
 * @model
 * @generated
 */
public interface Asignacion_Diaria extends EObject
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Rango Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rango Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rango Horario</em>' containment reference.
   * @see #setRangoHorario(Rango_Horario)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Diaria_RangoHorario()
   * @model containment="true"
   * @generated
   */
  Rango_Horario getRangoHorario();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getRangoHorario <em>Rango Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rango Horario</em>' containment reference.
   * @see #getRangoHorario()
   * @generated
   */
  void setRangoHorario(Rango_Horario value);

} // Asignacion_Diaria
