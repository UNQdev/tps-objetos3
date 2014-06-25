/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getHoraFinal <em>Hora Final</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getMateria <em>Materia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Asignacion_MateriaImpl extends ElementosImpl implements Asignacion_Materia
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
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Asignacion_MateriaImpl()
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
    return PlanificacionMateriasPackage.Literals.ASIGNACION_MATERIA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA, oldDia, dia));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO, oldHoraInicio, newHoraInicio);
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
        msgs = ((InternalEObject)horaInicio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO, null, msgs);
      if (newHoraInicio != null)
        msgs = ((InternalEObject)newHoraInicio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO, null, msgs);
      msgs = basicSetHoraInicio(newHoraInicio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO, newHoraInicio, newHoraInicio));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL, oldHoraFinal, newHoraFinal);
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
        msgs = ((InternalEObject)horaFinal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL, null, msgs);
      if (newHoraFinal != null)
        msgs = ((InternalEObject)newHoraFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL, null, msgs);
      msgs = basicSetHoraFinal(newHoraFinal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL, newHoraFinal, newHoraFinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia getMateria()
  {
    if (materia != null && materia.eIsProxy())
    {
      InternalEObject oldMateria = (InternalEObject)materia;
      materia = (Materia)eResolveProxy(oldMateria);
      if (materia != oldMateria)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA, oldMateria, materia));
      }
    }
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia basicGetMateria()
  {
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMateria(Materia newMateria)
  {
    Materia oldMateria = materia;
    materia = newMateria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA, oldMateria, materia));
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO:
        return basicSetHoraInicio(null, msgs);
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA:
        return getDia();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO:
        return getHoraInicio();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL:
        return getHoraFinal();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA:
        setDia((Dia)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO:
        setHoraInicio((Horario)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL:
        setHoraFinal((Horario)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)newValue);
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA:
        setDia(DIA_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO:
        setHoraInicio((Horario)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL:
        setHoraFinal((Horario)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)null);
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA:
        return dia != DIA_EDEFAULT;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_INICIO:
        return horaInicio != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__HORA_FINAL:
        return horaFinal != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        return materia != null;
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

} //Asignacion_MateriaImpl
