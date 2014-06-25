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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;
import tp5.dslexterno.xtext.planificacionMaterias.Recurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getRequerimientos <em>Requerimientos</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends ElementosImpl implements Materia
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

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
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__NOMBRE, oldNombre, nombre));
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
  public Profesor getProfesor()
  {
    if (profesor != null && profesor.eIsProxy())
    {
      InternalEObject oldProfesor = (InternalEObject)profesor;
      profesor = (Profesor)eResolveProxy(oldProfesor);
      if (profesor != oldProfesor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificacionMateriasPackage.MATERIA__PROFESOR, oldProfesor, profesor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__PROFESOR, oldProfesor, profesor));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificacionMateriasPackage.MATERIA__AULA, oldAula, aula));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificacionMateriasPackage.MATERIA__AULA, oldAula, aula));
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
      case PlanificacionMateriasPackage.MATERIA__NOMBRE:
        return getNombre();
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        return getRequerimientos();
      case PlanificacionMateriasPackage.MATERIA__PROFESOR:
        if (resolve) return getProfesor();
        return basicGetProfesor();
      case PlanificacionMateriasPackage.MATERIA__AULA:
        if (resolve) return getAula();
        return basicGetAula();
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
      case PlanificacionMateriasPackage.MATERIA__NOMBRE:
        setNombre((String)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        getRequerimientos().clear();
        getRequerimientos().addAll((Collection<? extends Recurso>)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__PROFESOR:
        setProfesor((Profesor)newValue);
        return;
      case PlanificacionMateriasPackage.MATERIA__AULA:
        setAula((Aula)newValue);
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
      case PlanificacionMateriasPackage.MATERIA__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        getRequerimientos().clear();
        return;
      case PlanificacionMateriasPackage.MATERIA__PROFESOR:
        setProfesor((Profesor)null);
        return;
      case PlanificacionMateriasPackage.MATERIA__AULA:
        setAula((Aula)null);
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
      case PlanificacionMateriasPackage.MATERIA__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case PlanificacionMateriasPackage.MATERIA__REQUERIMIENTOS:
        return requerimientos != null && !requerimientos.isEmpty();
      case PlanificacionMateriasPackage.MATERIA__PROFESOR:
        return profesor != null;
      case PlanificacionMateriasPackage.MATERIA__AULA:
        return aula != null;
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
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //MateriaImpl
