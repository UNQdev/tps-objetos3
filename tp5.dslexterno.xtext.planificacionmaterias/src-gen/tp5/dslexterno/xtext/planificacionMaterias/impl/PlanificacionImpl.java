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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl#getAnio <em>Anio</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl#getMateriasADictar <em>Materias ADictar</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl#getAsignacionesDiarias <em>Asignaciones Diarias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanificacionImpl extends MinimalEObjectImpl.Container implements Planificacion
{
  /**
   * The default value of the '{@link #getAnio() <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnio()
   * @generated
   * @ordered
   */
  protected static final int ANIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAnio() <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnio()
   * @generated
   * @ordered
   */
  protected int anio = ANIO_EDEFAULT;

  /**
   * The default value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected static final int SEMESTRE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected int semestre = SEMESTRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMateriasADictar() <em>Materias ADictar</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateriasADictar()
   * @generated
   * @ordered
   */
  protected EList<Materia> materiasADictar;

  /**
   * The cached value of the '{@link #getAsignacionesDiarias() <em>Asignaciones Diarias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignacionesDiarias()
   * @generated
   * @ordered
   */
  protected EList<Asignacion_Diaria> asignacionesDiarias;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanificacionImpl()
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
    return PlanificacionMateriasPackage.Literals.PLANIFICACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAnio()
  {
    return anio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnio(int newAnio)
  {
    int oldAnio = anio;
    anio = newAnio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.PLANIFICACION__ANIO, oldAnio, anio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSemestre()
  {
    return semestre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemestre(int newSemestre)
  {
    int oldSemestre = semestre;
    semestre = newSemestre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.PLANIFICACION__SEMESTRE, oldSemestre, semestre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Materia> getMateriasADictar()
  {
    if (materiasADictar == null)
    {
      materiasADictar = new EObjectResolvingEList<Materia>(Materia.class, this, PlanificacionMateriasPackage.PLANIFICACION__MATERIAS_ADICTAR);
    }
    return materiasADictar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Asignacion_Diaria> getAsignacionesDiarias()
  {
    if (asignacionesDiarias == null)
    {
      asignacionesDiarias = new EObjectContainmentEList<Asignacion_Diaria>(Asignacion_Diaria.class, this, PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS);
    }
    return asignacionesDiarias;
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
      case PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS:
        return ((InternalEList<?>)getAsignacionesDiarias()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.PLANIFICACION__ANIO:
        return getAnio();
      case PlanificacionMateriasPackage.PLANIFICACION__SEMESTRE:
        return getSemestre();
      case PlanificacionMateriasPackage.PLANIFICACION__MATERIAS_ADICTAR:
        return getMateriasADictar();
      case PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS:
        return getAsignacionesDiarias();
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
      case PlanificacionMateriasPackage.PLANIFICACION__ANIO:
        setAnio((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__MATERIAS_ADICTAR:
        getMateriasADictar().clear();
        getMateriasADictar().addAll((Collection<? extends Materia>)newValue);
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS:
        getAsignacionesDiarias().clear();
        getAsignacionesDiarias().addAll((Collection<? extends Asignacion_Diaria>)newValue);
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
      case PlanificacionMateriasPackage.PLANIFICACION__ANIO:
        setAnio(ANIO_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__SEMESTRE:
        setSemestre(SEMESTRE_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__MATERIAS_ADICTAR:
        getMateriasADictar().clear();
        return;
      case PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS:
        getAsignacionesDiarias().clear();
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
      case PlanificacionMateriasPackage.PLANIFICACION__ANIO:
        return anio != ANIO_EDEFAULT;
      case PlanificacionMateriasPackage.PLANIFICACION__SEMESTRE:
        return semestre != SEMESTRE_EDEFAULT;
      case PlanificacionMateriasPackage.PLANIFICACION__MATERIAS_ADICTAR:
        return materiasADictar != null && !materiasADictar.isEmpty();
      case PlanificacionMateriasPackage.PLANIFICACION__ASIGNACIONES_DIARIAS:
        return asignacionesDiarias != null && !asignacionesDiarias.isEmpty();
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
    result.append(" (anio: ");
    result.append(anio);
    result.append(", semestre: ");
    result.append(semestre);
    result.append(')');
    return result.toString();
  }

} //PlanificacionImpl
