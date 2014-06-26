/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materias Abiertas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Materias_AbiertasImpl#getMateriasAbiertas <em>Materias Abiertas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Materias_AbiertasImpl extends Estructuras_PlanificacionImpl implements Materias_Abiertas
{
  /**
   * The cached value of the '{@link #getMateriasAbiertas() <em>Materias Abiertas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateriasAbiertas()
   * @generated
   * @ordered
   */
  protected EList<Materia> materiasAbiertas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Materias_AbiertasImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlanificacionMateriasPackage.Literals.MATERIAS_ABIERTAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Materia> getMateriasAbiertas()
  {
    if (materiasAbiertas == null)
    {
      materiasAbiertas = new EObjectContainmentEList<Materia>(Materia.class, this, PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS);
    }
    return materiasAbiertas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS:
        return ((InternalEList<?>)getMateriasAbiertas()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS:
        return getMateriasAbiertas();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS:
        getMateriasAbiertas().clear();
        getMateriasAbiertas().addAll((Collection<? extends Materia>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS:
        getMateriasAbiertas().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.MATERIAS_ABIERTAS__MATERIAS_ABIERTAS:
        return materiasAbiertas != null && !materiasAbiertas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Materias_AbiertasImpl
