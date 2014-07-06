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

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getAula <em>Aula</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getAlumnosInscriptos <em>Alumnos Inscriptos</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getAsignacionesDiarias <em>Asignaciones Diarias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Asignacion_MateriaImpl extends MinimalEObjectImpl.Container implements Asignacion_Materia
{
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
   * The cached value of the '{@link #getProfesor() <em>Profesor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfesor()
   * @generated
   * @ordered
   */
  protected Profesor profesor;

  /**
   * The cached value of the '{@link #getAula() <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected Aula aula;

  /**
   * The default value of the '{@link #getAlumnosInscriptos() <em>Alumnos Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlumnosInscriptos()
   * @generated
   * @ordered
   */
  protected static final int ALUMNOS_INSCRIPTOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAlumnosInscriptos() <em>Alumnos Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlumnosInscriptos()
   * @generated
   * @ordered
   */
  protected int alumnosInscriptos = ALUMNOS_INSCRIPTOS_EDEFAULT;

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
  public Profesor getProfesor()
  {
    if (profesor != null && profesor.eIsProxy())
    {
      InternalEObject oldProfesor = (InternalEObject)profesor;
      profesor = (Profesor)eResolveProxy(oldProfesor);
      if (profesor != oldProfesor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR, oldProfesor, profesor));
      }
    }
    return profesor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor basicGetProfesor()
  {
    return profesor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfesor(Profesor newProfesor)
  {
    Profesor oldProfesor = profesor;
    profesor = newProfesor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR, oldProfesor, profesor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula getAula()
  {
    if (aula != null && aula.eIsProxy())
    {
      InternalEObject oldAula = (InternalEObject)aula;
      aula = (Aula)eResolveProxy(oldAula);
      if (aula != oldAula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA, oldAula, aula));
      }
    }
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula basicGetAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(Aula newAula)
  {
    Aula oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA, oldAula, aula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAlumnosInscriptos()
  {
    return alumnosInscriptos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlumnosInscriptos(int newAlumnosInscriptos)
  {
    int oldAlumnosInscriptos = alumnosInscriptos;
    alumnosInscriptos = newAlumnosInscriptos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS, oldAlumnosInscriptos, alumnosInscriptos));
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
      asignacionesDiarias = new EObjectContainmentEList<Asignacion_Diaria>(Asignacion_Diaria.class, this, PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS);
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR:
        if (resolve) return getProfesor();
        return basicGetProfesor();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA:
        if (resolve) return getAula();
        return basicGetAula();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS:
        return getAlumnosInscriptos();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR:
        setProfesor((Profesor)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA:
        setAula((Aula)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS:
        setAlumnosInscriptos((Integer)newValue);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        setMateria((Materia)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR:
        setProfesor((Profesor)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA:
        setAula((Aula)null);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS:
        setAlumnosInscriptos(ALUMNOS_INSCRIPTOS_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS:
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        return materia != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR:
        return profesor != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA:
        return aula != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS:
        return alumnosInscriptos != ALUMNOS_INSCRIPTOS_EDEFAULT;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS:
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
    result.append(" (alumnosInscriptos: ");
    result.append(alumnosInscriptos);
    result.append(')');
    return result.toString();
  }

} //Asignacion_MateriaImpl
