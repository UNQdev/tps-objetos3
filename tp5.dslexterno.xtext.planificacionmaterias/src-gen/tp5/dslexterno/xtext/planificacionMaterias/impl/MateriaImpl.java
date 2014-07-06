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

import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Recurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getCantidadHorasSemanales <em>Cantidad Horas Semanales</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getDiasSemanales <em>Dias Semanales</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getRequerimientos <em>Requerimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends MinimalEObjectImpl.Container implements Materia
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
   * The default value of the '{@link #getCantidadHorasSemanales() <em>Cantidad Horas Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadHorasSemanales()
   * @generated
   * @ordered
   */
  protected static final int CANTIDAD_HORAS_SEMANALES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCantidadHorasSemanales() <em>Cantidad Horas Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadHorasSemanales()
   * @generated
   * @ordered
   */
  protected int cantidadHorasSemanales = CANTIDAD_HORAS_SEMANALES_EDEFAULT;

  /**
   * The default value of the '{@link #getDiasSemanales() <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasSemanales()
   * @generated
   * @ordered
   */
  protected static final int DIAS_SEMANALES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDiasSemanales() <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasSemanales()
   * @generated
   * @ordered
   */
  protected int diasSemanales = DIAS_SEMANALES_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequerimientos() <em>Requerimientos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequerimientos()
   * @generated
   * @ordered
   */
  protected EList<Recurso> requerimientos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MateriaImpl()
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
    return PlanificacionMateriasPackage.Literals.MATERIA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCantidadHorasSemanales()
  {
    return cantidadHorasSemanales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCantidadHorasSemanales(int newCantidadHorasSemanales)
  {
    int oldCantidadHorasSemanales = cantidadHorasSemanales;
    cantidadHorasSemanales = newCantidadHorasSemanales;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__CANTIDAD_HORAS_SEMANALES, oldCantidadHorasSemanales, cantidadHorasSemanales));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDiasSemanales()
  {
    return diasSemanales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiasSemanales(int newDiasSemanales)
  {
    int oldDiasSemanales = diasSemanales;
    diasSemanales = newDiasSemanales;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__DIAS_SEMANALES, oldDiasSemanales, diasSemanales));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recurso> getRequerimientos()
  {
    if (requerimientos == null)
    {
      requerimientos = new EObjectContainmentEList<Recurso>(Recurso.class, this, PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS);
    }
    return requerimientos;
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
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        return ((InternalEList<?>)getRequerimientos()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.MATERIA__NAME:
        return getName();
      case PlanificacionMateriasPackage.MATERIA__CANTIDAD_HORAS_SEMANALES:
        return getCantidadHorasSemanales();
      case PlanificacionMateriasPackage.MATERIA__DIAS_SEMANALES:
        return getDiasSemanales();
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        return getRequerimientos();
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
      case PlanificacionMateriasPackage.MATERIA__NAME:
        setName((String)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__CANTIDAD_HORAS_SEMANALES:
        setCantidadHorasSemanales((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__DIAS_SEMANALES:
        setDiasSemanales((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        getRequerimientos().clear();
        getRequerimientos().addAll((Collection<? extends Recurso>)newValue);
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
      case PlanificacionMateriasPackage.MATERIA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.MATERIA__CANTIDAD_HORAS_SEMANALES:
        setCantidadHorasSemanales(CANTIDAD_HORAS_SEMANALES_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.MATERIA__DIAS_SEMANALES:
        setDiasSemanales(DIAS_SEMANALES_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        getRequerimientos().clear();
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
      case PlanificacionMateriasPackage.MATERIA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanificacionMateriasPackage.MATERIA__CANTIDAD_HORAS_SEMANALES:
        return cantidadHorasSemanales != CANTIDAD_HORAS_SEMANALES_EDEFAULT;
      case PlanificacionMateriasPackage.MATERIA__DIAS_SEMANALES:
        return diasSemanales != DIAS_SEMANALES_EDEFAULT;
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        return requerimientos != null && !requerimientos.isEmpty();
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
    result.append(", cantidadHorasSemanales: ");
    result.append(cantidadHorasSemanales);
    result.append(", diasSemanales: ");
    result.append(diasSemanales);
    result.append(')');
    return result.toString();
  }

} //MateriaImpl
