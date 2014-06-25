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
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl#getRecusos <em>Recusos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AulaImpl extends MinimalEObjectImpl.Container implements Aula
{
  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final String NUMERO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected String numero = NUMERO_EDEFAULT;

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
  public String getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumero(String newNumero)
  {
    String oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.AULA__NUMERO, oldNumero, numero));
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
      case PlanificacionMateriasPackage.AULA__NUMERO:
        return getNumero();
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
      case PlanificacionMateriasPackage.AULA__NUMERO:
        setNumero((String)newValue);
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
      case PlanificacionMateriasPackage.AULA__NUMERO:
        setNumero(NUMERO_EDEFAULT);
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
      case PlanificacionMateriasPackage.AULA__NUMERO:
        return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
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
    result.append(" (numero: ");
    result.append(numero);
    result.append(')');
    return result.toString();
  }

} //AulaImpl
