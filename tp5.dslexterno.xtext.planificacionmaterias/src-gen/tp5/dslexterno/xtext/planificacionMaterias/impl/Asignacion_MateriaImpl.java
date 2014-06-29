/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getRangoHorario <em>Rango Horario</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getCantidadAlumnos <em>Cantidad Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Asignacion_MateriaImpl extends MinimalEObjectImpl.Container implements Asignacion_Materia
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
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

  /**
   * The default value of the '{@link #getCantidadAlumnos() <em>Cantidad Alumnos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadAlumnos()
   * @generated
   * @ordered
   */
  protected static final int CANTIDAD_ALUMNOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCantidadAlumnos() <em>Cantidad Alumnos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadAlumnos()
   * @generated
   * @ordered
   */
  protected int cantidadAlumnos = CANTIDAD_ALUMNOS_EDEFAULT;

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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO, oldRangoHorario, newRangoHorario);
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
        msgs = ((InternalEObject)rangoHorario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO, null, msgs);
      if (newRangoHorario != null)
        msgs = ((InternalEObject)newRangoHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO, null, msgs);
      msgs = basicSetRangoHorario(newRangoHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO, newRangoHorario, newRangoHorario));
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
  public int getCantidadAlumnos()
  {
    return cantidadAlumnos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCantidadAlumnos(int newCantidadAlumnos)
  {
    int oldCantidadAlumnos = cantidadAlumnos;
    cantidadAlumnos = newCantidadAlumnos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__CANTIDAD_ALUMNOS, oldCantidadAlumnos, cantidadAlumnos));
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__DIA:
        return getDia();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        return getRangoHorario();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__CANTIDAD_ALUMNOS:
        return getCantidadAlumnos();
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__CANTIDAD_ALUMNOS:
        setCantidadAlumnos((Integer)newValue);
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__CANTIDAD_ALUMNOS:
        setCantidadAlumnos(CANTIDAD_ALUMNOS_EDEFAULT);
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        return rangoHorario != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        return materia != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__CANTIDAD_ALUMNOS:
        return cantidadAlumnos != CANTIDAD_ALUMNOS_EDEFAULT;
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
    result.append(", cantidadAlumnos: ");
    result.append(cantidadAlumnos);
    result.append(')');
    return result.toString();
  }

} //Asignacion_MateriaImpl
