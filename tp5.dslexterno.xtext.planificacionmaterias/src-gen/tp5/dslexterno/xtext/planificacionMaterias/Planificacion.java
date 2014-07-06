/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAnio <em>Anio</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getMateriasADictar <em>Materias ADictar</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAsignacionesDeMaterias <em>Asignaciones De Materias</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getPlanificacion()
 * @model
 * @generated
 */
public interface Planificacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Anio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anio</em>' attribute.
   * @see #setAnio(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getPlanificacion_Anio()
   * @model
   * @generated
   */
  int getAnio();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAnio <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anio</em>' attribute.
   * @see #getAnio()
   * @generated
   */
  void setAnio(int value);

  /**
   * Returns the value of the '<em><b>Semestre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semestre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semestre</em>' attribute.
   * @see #setSemestre(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getPlanificacion_Semestre()
   * @model
   * @generated
   */
  int getSemestre();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getSemestre <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semestre</em>' attribute.
   * @see #getSemestre()
   * @generated
   */
  void setSemestre(int value);

  /**
   * Returns the value of the '<em><b>Materias ADictar</b></em>' reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materias ADictar</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materias ADictar</em>' reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getPlanificacion_MateriasADictar()
   * @model
   * @generated
   */
  EList<Materia> getMateriasADictar();

  /**
   * Returns the value of the '<em><b>Asignaciones De Materias</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asignaciones De Materias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asignaciones De Materias</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getPlanificacion_AsignacionesDeMaterias()
   * @model containment="true"
   * @generated
   */
  EList<Asignacion_Materia> getAsignacionesDeMaterias();

} // Planificacion
