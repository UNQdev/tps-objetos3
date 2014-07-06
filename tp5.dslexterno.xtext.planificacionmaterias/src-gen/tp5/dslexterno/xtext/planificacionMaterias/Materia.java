/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getName <em>Name</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getCantidadHorasSemanales <em>Cantidad Horas Semanales</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getDiasSemanales <em>Dias Semanales</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getRequerimientos <em>Requerimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cantidad Horas Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cantidad Horas Semanales</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cantidad Horas Semanales</em>' attribute.
   * @see #setCantidadHorasSemanales(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_CantidadHorasSemanales()
   * @model
   * @generated
   */
  int getCantidadHorasSemanales();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getCantidadHorasSemanales <em>Cantidad Horas Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cantidad Horas Semanales</em>' attribute.
   * @see #getCantidadHorasSemanales()
   * @generated
   */
  void setCantidadHorasSemanales(int value);

  /**
   * Returns the value of the '<em><b>Dias Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias Semanales</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias Semanales</em>' attribute.
   * @see #setDiasSemanales(int)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_DiasSemanales()
   * @model
   * @generated
   */
  int getDiasSemanales();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getDiasSemanales <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dias Semanales</em>' attribute.
   * @see #getDiasSemanales()
   * @generated
   */
  void setDiasSemanales(int value);

  /**
   * Returns the value of the '<em><b>Requerimientos</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Recurso}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requerimientos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requerimientos</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Requerimientos()
   * @model containment="true"
   * @generated
   */
  EList<Recurso> getRequerimientos();

} // Materia
