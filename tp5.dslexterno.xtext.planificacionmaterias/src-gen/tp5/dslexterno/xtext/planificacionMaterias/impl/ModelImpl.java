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
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getProfesoresLibres <em>Profesores Libres</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getAulasDisponibles <em>Aulas Disponibles</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getMateriasAbiertas <em>Materias Abiertas</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl#getPlanificacion <em>Planificacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getProfesoresLibres() <em>Profesores Libres</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfesoresLibres()
   * @generated
   * @ordered
   */
  protected EList<Profesor> profesoresLibres;

  /**
   * The cached value of the '{@link #getAulasDisponibles() <em>Aulas Disponibles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAulasDisponibles()
   * @generated
   * @ordered
   */
  protected EList<Aula> aulasDisponibles;

  /**
   * The cached value of the '{@link #getMateriasAbiertas() <em>Materias Abiertas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateriasAbiertas()
   * @generated
   * @ordered
   */
  protected EList<Materia> materiasAbiertas;

  /**
   * The cached value of the '{@link #getPlanificacion() <em>Planificacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanificacion()
   * @generated
   * @ordered
   */
  protected Planificacion planificacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PlanificacionMateriasPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Profesor> getProfesoresLibres()
  {
    if (profesoresLibres == null)
    {
      profesoresLibres = new EObjectContainmentEList<Profesor>(Profesor.class, this, PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES);
    }
    return profesoresLibres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aula> getAulasDisponibles()
  {
    if (aulasDisponibles == null)
    {
      aulasDisponibles = new EObjectContainmentEList<Aula>(Aula.class, this, PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES);
    }
    return aulasDisponibles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Materia> getMateriasAbiertas()
  {
    if (materiasAbiertas == null)
    {
      materiasAbiertas = new EObjectContainmentEList<Materia>(Materia.class, this, PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS);
    }
    return materiasAbiertas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Planificacion getPlanificacion()
  {
    return planificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlanificacion(Planificacion newPlanificacion, NotificationChain msgs)
  {
    Planificacion oldPlanificacion = planificacion;
    planificacion = newPlanificacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MODEL__PLANIFICACION, oldPlanificacion, newPlanificacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanificacion(Planificacion newPlanificacion)
  {
    if (newPlanificacion != planificacion)
    {
      NotificationChain msgs = null;
      if (planificacion != null)
        msgs = ((InternalEObject)planificacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.MODEL__PLANIFICACION, null, msgs);
      if (newPlanificacion != null)
        msgs = ((InternalEObject)newPlanificacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificacionMateriasPackage.MODEL__PLANIFICACION, null, msgs);
      msgs = basicSetPlanificacion(newPlanificacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MODEL__PLANIFICACION, newPlanificacion, newPlanificacion));
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
      case PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES:
        return ((InternalEList<?>)getProfesoresLibres()).basicRemove(otherEnd, msgs);
      case PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES:
        return ((InternalEList<?>)getAulasDisponibles()).basicRemove(otherEnd, msgs);
      case PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS:
        return ((InternalEList<?>)getMateriasAbiertas()).basicRemove(otherEnd, msgs);
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return basicSetPlanificacion(null, msgs);
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
      case PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES:
        return getProfesoresLibres();
      case PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES:
        return getAulasDisponibles();
      case PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS:
        return getMateriasAbiertas();
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return getPlanificacion();
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
      case PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES:
        getProfesoresLibres().clear();
        getProfesoresLibres().addAll((Collection<? extends Profesor>)newValue);
        return;
      case PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES:
        getAulasDisponibles().clear();
        getAulasDisponibles().addAll((Collection<? extends Aula>)newValue);
        return;
      case PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS:
        getMateriasAbiertas().clear();
        getMateriasAbiertas().addAll((Collection<? extends Materia>)newValue);
        return;
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        setPlanificacion((Planificacion)newValue);
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
      case PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES:
        getProfesoresLibres().clear();
        return;
      case PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES:
        getAulasDisponibles().clear();
        return;
      case PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS:
        getMateriasAbiertas().clear();
        return;
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        setPlanificacion((Planificacion)null);
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
      case PlanificacionMateriasPackage.MODEL__PROFESORES_LIBRES:
        return profesoresLibres != null && !profesoresLibres.isEmpty();
      case PlanificacionMateriasPackage.MODEL__AULAS_DISPONIBLES:
        return aulasDisponibles != null && !aulasDisponibles.isEmpty();
      case PlanificacionMateriasPackage.MODEL__MATERIAS_ABIERTAS:
        return materiasAbiertas != null && !materiasAbiertas.isEmpty();
      case PlanificacionMateriasPackage.MODEL__PLANIFICACION:
        return planificacion != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
