/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disponibilidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl#getRangoHorario <em>Rango Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisponibilidadImpl extends MinimalEObjectImpl.Container implements Disponibilidad
{
  /**
   * The default value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected static final Dia DIA_EDEFAULT = Dia.LUNES;

  /**
   * The cached value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected Dia dia = DIA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRangoHorario() <em>Rango Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangoHorario()
   * @generated
   * @ordered
   */
  protected Rango_Horario rangoHorario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisponibilidadImpl()
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
    return PlanificacionMateriasPackage.Literals.DISPONIBILIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDia()
  {
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDia(Dia newDia)
  {
    Dia oldDia = dia;
    dia = newDia == null ? DIA_EDEFAULT : newDia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.DISPONIBILIDAD__DIA, oldDia, dia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rango_Horario getRangoHorario()
  {
    return rangoHorario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRangoHorario(Rango_Horario newRangoHorario, NotificationChain msgs)
  {
    Rango_Horario oldRangoHorario = rangoHorario;
    rangoHorario = newRangoHorario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO, oldRangoHorario, newRangoHorario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangoHorario(Rango_Horario newRangoHorario)
  {
    if (newRangoHorario != rangoHorario)
    {
      NotificationChain msgs = null;
      if (rangoHorario != null)
        msgs = ((InternalEObject)rangoHorario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO, null, msgs);
      if (newRangoHorario != null)
        msgs = ((InternalEObject)newRangoHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO, null, msgs);
      msgs = basicSetRangoHorario(newRangoHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO, newRangoHorario, newRangoHorario));
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
      case PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO:
        return basicSetRangoHorario(null, msgs);
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
      case PlanificacionMateriasPackage.DISPONIBILIDAD__DIA:
        return getDia();
      case PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO:
        return getRangoHorario();
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
      case PlanificacionMateriasPackage.DISPONIBILIDAD__DIA:
        setDia((Dia)newValue);
        return;
      case PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)newValue);
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
      case PlanificacionMateriasPackage.DISPONIBILIDAD__DIA:
        setDia(DIA_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)null);
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
      case PlanificacionMateriasPackage.DISPONIBILIDAD__DIA:
        return dia != DIA_EDEFAULT;
      case PlanificacionMateriasPackage.DISPONIBILIDAD__RANGO_HORARIO:
        return rangoHorario != null;
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
    result.append(" (dia: ");
    result.append(dia);
    result.append(')');
    return result.toString();
  }

} //DisponibilidadImpl
