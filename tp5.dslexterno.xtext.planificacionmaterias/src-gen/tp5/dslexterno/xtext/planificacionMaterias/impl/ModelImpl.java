/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp5.dslexterno.xtext.planificacionMaterias.Estructuras_Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getElementosPlanificacion <em>Elementos Planificacion</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getPlanificacion <em>Planificacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getElementosPlanificacion() <em>Elementos Planificacion</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementosPlanificacion()
   * @generated
   * @ordered
   */
  protected EList<Estructuras_Planificacion> elementosPlanificacion;

  /**
   * The cached value of the '{@link #getPlanificacion() <em>Planificacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanificacion()
   * @generated
   * @ordered
   */
  protected Planificacion planificacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PlanificacionMateriasPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estructuras_Planificacion> getElementosPlanificacion()
  {
    if (elementosPlanificacion == null)
    {
      elementosPlanificacion = new EObjectContainmentEList<Estructuras_Planificacion>(Estructuras_Planificacion.class, this, PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION);
    }
    return elementosPlanificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Planificacion getPlanificacion()
  {
    return planificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlanificacion(Planificacion newPlanificacion, NotificationChain msgs)
  {
    Planificacion oldPlanificacion = planificacion;
    planificacion = newPlanificacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MODEL__PLANIFICACION, oldPlanificacion, newPlanificacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanificacion(Planificacion newPlanificacion)
  {
    if (newPlanificacion != planificacion)
    {
      NotificationChain msgs = null;
      if (planificacion != null)
        msgs = ((InternalEObject)planificacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.MODEL__PLANIFICACION, null, msgs);
      if (newPlanificacion != null)
        msgs = ((InternalEObject)newPlanificacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.MODEL__PLANIFICACION, null, msgs);
      msgs = basicSetPlanificacion(newPlanificacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MODEL__PLANIFICACION, newPlanificacion, newPlanificacion));
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
      case PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION:
        return ((InternalEList<?>)getElementosPlanificacion()).basicRemove(otherEnd, msgs);
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return basicSetPlanificacion(null, msgs);
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
      case PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION:
        return getElementosPlanificacion();
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return getPlanificacion();
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
      case PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION:
        getElementosPlanificacion().clear();
        getElementosPlanificacion().addAll((Collection<? extends Estructuras_Planificacion>)newValue);
        return;
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        setPlanificacion((Planificacion)newValue);
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
      case PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION:
        getElementosPlanificacion().clear();
        return;
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        setPlanificacion((Planificacion)null);
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
      case PlanificacionMateriasPackage.MODEL__ELEMENTOS_PLANIFICACION:
        return elementosPlanificacion != null && !elementosPlanificacion.isEmpty();
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return planificacion != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
