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
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getRangoHorario <em>Rango Horario</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getMateria <em>Materia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAula <em>Aula</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAlumnosInscriptos <em>Alumnos Inscriptos</em>}</li>
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
   * Returns the value of the '<em><b>Profesor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profesor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profesor</em>' reference.
   * @see #setProfesor(Profesor)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_Profesor()
   * @model
   * @generated
   */
  Profesor getProfesor();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getProfesor <em>Profesor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profesor</em>' reference.
   * @see #getProfesor()
   * @generated
   */
  void setProfesor(Profesor value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' reference.
   * @see #setAula(Aula)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_Aula()
   * @model
   * @generated
   */
  Aula getAula();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAula <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' reference.
   * @see #getAula()
   * @generated
   */
  void setAula(Aula value);

  /**
   * Returns the value of the '<em><b>Alumnos Inscriptos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alumnos Inscriptos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alumnos Inscriptos</em>' attribute.
   * @see #setAlumnosInscriptos(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getAsignacion_Materia_AlumnosInscriptos()
   * @model
   * @generated
   */
  int getAlumnosInscriptos();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAlumnosInscriptos <em>Alumnos Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alumnos Inscriptos</em>' attribute.
   * @see #getAlumnosInscriptos()
   * @generated
   */
  void setAlumnosInscriptos(int value);

} // Asignacion_Materia
