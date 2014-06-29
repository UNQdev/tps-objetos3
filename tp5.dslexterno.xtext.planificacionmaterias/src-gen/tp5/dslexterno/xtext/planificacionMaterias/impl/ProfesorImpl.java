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

import tp5.dslexterno.xtext.planificacionMaterias.Dedicacion;
import tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl#getDisponibilidad <em>Disponibilidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends MinimalEObjectImpl.Container implements Profesor
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDedicacion() <em>Dedicacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected Dedicacion dedicacion;

  /**
   * The cached value of the '{@link #getDisponibilidad() <em>Disponibilidad</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisponibilidad()
   * @generated
   * @ordered
   */
  protected EList<Disponibilidad> disponibilidad;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProfesorImpl()
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
    return PlanificacionMateriasPackage.Literals.PROFESOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.PROFESOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion getDedicacion()
  {
    return dedicacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDedicacion(Dedicacion newDedicacion, NotificationChain msgs)
  {
    Dedicacion oldDedicacion = dedicacion;
    dedicacion = newDedicacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.PROFESOR__DEDICACION, oldDedicacion, newDedicacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDedicacion(Dedicacion newDedicacion)
  {
    if (newDedicacion != dedicacion)
    {
      NotificationChain msgs = null;
      if (dedicacion != null)
        msgs = ((InternalEObject)dedicacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.PROFESOR__DEDICACION, null, msgs);
      if (newDedicacion != null)
        msgs = ((InternalEObject)newDedicacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.PROFESOR__DEDICACION, null, msgs);
      msgs = basicSetDedicacion(newDedicacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.PROFESOR__DEDICACION, newDedicacion, newDedicacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Disponibilidad> getDisponibilidad()
  {
    if (disponibilidad == null)
    {
      disponibilidad = new EObjectContainmentEList<Disponibilidad>(Disponibilidad.class, this, PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD);
    }
    return disponibilidad;
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
      case PlanificacionMateriasPackage.PROFESOR__DEDICACION:
        return basicSetDedicacion(null, msgs);
      case PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD:
        return ((InternalEList<?>)getDisponibilidad()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.PROFESOR__NAME:
        return getName();
      case PlanificacionMateriasPackage.PROFESOR__DEDICACION:
        return getDedicacion();
      case PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD:
        return getDisponibilidad();
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
      case PlanificacionMateriasPackage.PROFESOR__NAME:
        setName((String)newValue);
        return;
      case PlanificacionMateriasPackage.PROFESOR__DEDICACION:
        setDedicacion((Dedicacion)newValue);
        return;
      case PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD:
        getDisponibilidad().clear();
        getDisponibilidad().addAll((Collection<? extends Disponibilidad>)newValue);
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
      case PlanificacionMateriasPackage.PROFESOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.PROFESOR__DEDICACION:
        setDedicacion((Dedicacion)null);
        return;
      case PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD:
        getDisponibilidad().clear();
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
      case PlanificacionMateriasPackage.PROFESOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanificacionMateriasPackage.PROFESOR__DEDICACION:
        return dedicacion != null;
      case PlanificacionMateriasPackage.PROFESOR__DISPONIBILIDAD:
        return disponibilidad != null && !disponibilidad.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProfesorImpl
