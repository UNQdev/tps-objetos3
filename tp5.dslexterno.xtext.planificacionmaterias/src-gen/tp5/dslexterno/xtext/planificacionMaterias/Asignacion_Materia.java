/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getRangoHorario <em>Rango Horario</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getMateria <em>Materia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getCantidadAlumnos <em>Cantidad Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia()
 * @model
 * @generated
 */
public interface Asignacion_Materia extends EObject
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getDia <em>Dia</em>}' attribute.
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_RangoHorario()
   * @model containment="true"
   * @generated
   */
  Rango_Horario getRangoHorario();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getRangoHorario <em>Rango Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rango Horario</em>' containment reference.
   * @see #getRangoHorario()
   * @generated
   */
  void setRangoHorario(Rango_Horario value);

  /**
   * Returns the value of the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' reference.
   * @see #setMateria(Materia)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_Materia()
   * @model
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getMateria <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

  /**
   * Returns the value of the '<em><b>Cantidad Alumnos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cantidad Alumnos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cantidad Alumnos</em>' attribute.
   * @see #setCantidadAlumnos(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_CantidadAlumnos()
   * @model
   * @generated
   */
  int getCantidadAlumnos();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getCantidadAlumnos <em>Cantidad Alumnos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cantidad Alumnos</em>' attribute.
   * @see #getCantidadAlumnos()
   * @generated
   */
  void setCantidadAlumnos(int value);

} // Asignacion_Materia
