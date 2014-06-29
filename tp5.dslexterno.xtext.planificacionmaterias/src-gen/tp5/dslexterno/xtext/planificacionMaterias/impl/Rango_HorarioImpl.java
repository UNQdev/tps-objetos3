/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rango Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl#getHoraFinal <em>Hora Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Rango_HorarioImpl extends MinimalEObjectImpl.Container implements Rango_Horario
{
  /**
   * The cached value of the '{@link #getHoraInicio() <em>Hora Inicio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraInicio()
   * @generated
   * @ordered
   */
  protected Horario horaInicio;

  /**
   * The cached value of the '{@link #getHoraFinal() <em>Hora Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraFinal()
   * @generated
   * @ordered
   */
  protected Horario horaFinal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Rango_HorarioImpl()
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
    return PlanificacionMateriasPackage.Literals.RANGO_HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario getHoraInicio()
  {
    return horaInicio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHoraInicio(Horario newHoraInicio, NotificationChain msgs)
  {
    Horario oldHoraInicio = horaInicio;
    horaInicio = newHoraInicio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO, oldHoraInicio, newHoraInicio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoraInicio(Horario newHoraInicio)
  {
    if (newHoraInicio != horaInicio)
    {
      NotificationChain msgs = null;
      if (horaInicio != null)
        msgs = ((InternalEObject)horaInicio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO, null, msgs);
      if (newHoraInicio != null)
        msgs = ((InternalEObject)newHoraInicio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO, null, msgs);
      msgs = basicSetHoraInicio(newHoraInicio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO, newHoraInicio, newHoraInicio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario getHoraFinal()
  {
    return horaFinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHoraFinal(Horario newHoraFinal, NotificationChain msgs)
  {
    Horario oldHoraFinal = horaFinal;
    horaFinal = newHoraFinal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL, oldHoraFinal, newHoraFinal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoraFinal(Horario newHoraFinal)
  {
    if (newHoraFinal != horaFinal)
    {
      NotificationChain msgs = null;
      if (horaFinal != null)
        msgs = ((InternalEObject)horaFinal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL, null, msgs);
      if (newHoraFinal != null)
        msgs = ((InternalEObject)newHoraFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL, null, msgs);
      msgs = basicSetHoraFinal(newHoraFinal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL, newHoraFinal, newHoraFinal));
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
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO:
        return basicSetHoraInicio(null, msgs);
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL:
        return basicSetHoraFinal(null, msgs);
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
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO:
        return getHoraInicio();
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL:
        return getHoraFinal();
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
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO:
        setHoraInicio((Horario)newValue);
        return;
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL:
        setHoraFinal((Horario)newValue);
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
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO:
        setHoraInicio((Horario)null);
        return;
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL:
        setHoraFinal((Horario)null);
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
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_INICIO:
        return horaInicio != null;
      case PlanificacionMateriasPackage.RANGO_HORARIO__HORA_FINAL:
        return horaFinal != null;
    }
    return super.eIsSet(featureID);
  }

} //Rango_HorarioImpl
