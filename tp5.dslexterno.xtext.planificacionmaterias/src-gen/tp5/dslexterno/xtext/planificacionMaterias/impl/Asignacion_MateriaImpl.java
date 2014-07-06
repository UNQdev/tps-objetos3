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
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getRangoHorario <em>Rango Horario</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getAula <em>Aula</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl#getAlumnosInscriptos <em>Alumnos Inscriptos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Asignacion_MateriaImpl extends MinimalEObjectImpl.Container implements Asignacion_Materia
{
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        return getRangoHorario();
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)newValue);
        return;
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        setRangoHorario((Rango_Horario)null);
        return;
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
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__RANGO_HORARIO:
        return rangoHorario != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__MATERIA:
        return materia != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__PROFESOR:
        return profesor != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__AULA:
        return aula != null;
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS:
        return alumnosInscriptos != ALUMNOS_INSCRIPTOS_EDEFAULT;
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
