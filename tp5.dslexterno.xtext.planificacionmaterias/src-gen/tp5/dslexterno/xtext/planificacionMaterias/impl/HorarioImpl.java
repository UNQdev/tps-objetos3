/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl#getMinutos <em>Minutos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorarioImpl extends MinimalEObjectImpl.Container implements Horario
{
  /**
   * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected static final int HORA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected int hora = HORA_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutos() <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutos()
   * @generated
   * @ordered
   */
  protected static final int MINUTOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinutos() <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutos()
   * @generated
   * @ordered
   */
  protected int minutos = MINUTOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorarioImpl()
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
    return PlanificacionMateriasPackage.Literals.HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHora()
  {
    return hora;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHora(int newHora)
  {
    int oldHora = hora;
    hora = newHora;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.HORARIO__HORA, oldHora, hora));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutos()
  {
    return minutos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutos(int newMinutos)
  {
    int oldMinutos = minutos;
    minutos = newMinutos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.HORARIO__MINUTOS, oldMinutos, minutos));
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
      case PlanificacionMateriasPackage.HORARIO__HORA:
        return getHora();
      case PlanificacionMateriasPackage.HORARIO__MINUTOS:
        return getMinutos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanificacionMateriasPackage.HORARIO__HORA:
        setHora((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.HORARIO__MINUTOS:
        setMinutos((Integer)newValue);
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
      case PlanificacionMateriasPackage.HORARIO__HORA:
        setHora(HORA_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.HORARIO__MINUTOS:
        setMinutos(MINUTOS_EDEFAULT);
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
      case PlanificacionMateriasPackage.HORARIO__HORA:
        return hora != HORA_EDEFAULT;
      case PlanificacionMateriasPackage.HORARIO__MINUTOS:
        return minutos != MINUTOS_EDEFAULT;
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
    result.append(" (hora: ");
    result.append(hora);
    result.append(", minutos: ");
    result.append(minutos);
    result.append(')');
    return result.toString();
  }

} //HorarioImpl
