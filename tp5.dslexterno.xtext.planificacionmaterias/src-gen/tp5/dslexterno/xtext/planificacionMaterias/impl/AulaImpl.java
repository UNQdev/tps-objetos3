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

import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Recurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl#getCapacidad <em>Capacidad</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl#getRecusos <em>Recusos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AulaImpl extends MinimalEObjectImpl.Container implements Aula
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
   * The default value of the '{@link #getCapacidad() <em>Capacidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacidad()
   * @generated
   * @ordered
   */
  protected static final int CAPACIDAD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCapacidad() <em>Capacidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacidad()
   * @generated
   * @ordered
   */
  protected int capacidad = CAPACIDAD_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecusos() <em>Recusos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecusos()
   * @generated
   * @ordered
   */
  protected EList<Recurso> recusos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AulaImpl()
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
    return PlanificacionMateriasPackage.Literals.AULA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.AULA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCapacidad()
  {
    return capacidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapacidad(int newCapacidad)
  {
    int oldCapacidad = capacidad;
    capacidad = newCapacidad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.AULA__CAPACIDAD, oldCapacidad, capacidad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recurso> getRecusos()
  {
    if (recusos == null)
    {
      recusos = new EObjectContainmentEList<Recurso>(Recurso.class, this, PlanificacionMateriasPackage.AULA__RECUSOS);
    }
    return recusos;
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
      case PlanificacionMateriasPackage.AULA__RECUSOS:
        return ((InternalEList<?>)getRecusos()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.AULA__NAME:
        return getName();
      case PlanificacionMateriasPackage.AULA__CAPACIDAD:
        return getCapacidad();
      case PlanificacionMateriasPackage.AULA__RECUSOS:
        return getRecusos();
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
      case PlanificacionMateriasPackage.AULA__NAME:
        setName((String)newValue);
        return;
      case PlanificacionMateriasPackage.AULA__CAPACIDAD:
        setCapacidad((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.AULA__RECUSOS:
        getRecusos().clear();
        getRecusos().addAll((Collection<? extends Recurso>)newValue);
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
      case PlanificacionMateriasPackage.AULA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.AULA__CAPACIDAD:
        setCapacidad(CAPACIDAD_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.AULA__RECUSOS:
        getRecusos().clear();
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
      case PlanificacionMateriasPackage.AULA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanificacionMateriasPackage.AULA__CAPACIDAD:
        return capacidad != CAPACIDAD_EDEFAULT;
      case PlanificacionMateriasPackage.AULA__RECUSOS:
        return recusos != null && !recusos.isEmpty();
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
    result.append(", capacidad: ");
    result.append(capacidad);
    result.append(')');
    return result.toString();
  }

} //AulaImpl
