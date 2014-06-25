/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nomina Profesores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Nomina_ProfesoresImpl#getProfesorsLibres <em>Profesors Libres</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Nomina_ProfesoresImpl extends ElementosImpl implements Nomina_Profesores
{
  /**
   * The cached value of the '{@link #getProfesorsLibres() <em>Profesors Libres</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfesorsLibres()
   * @generated
   * @ordered
   */
  protected EList<Profesor> profesorsLibres;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Nomina_ProfesoresImpl()
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
    return PlanificacionMateriasPackage.Literals.NOMINA_PROFESORES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Profesor> getProfesorsLibres()
  {
    if (profesorsLibres == null)
    {
      profesorsLibres = new EObjectContainmentEList<Profesor>(Profesor.class, this, PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES);
    }
    return profesorsLibres;
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
      case PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES:
        return ((InternalEList<?>)getProfesorsLibres()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES:
        return getProfesorsLibres();
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
      case PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES:
        getProfesorsLibres().clear();
        getProfesorsLibres().addAll((Collection<? extends Profesor>)newValue);
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
      case PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES:
        getProfesorsLibres().clear();
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
      case PlanificacionMateriasPackage.NOMINA_PROFESORES__PROFESORS_LIBRES:
        return profesorsLibres != null && !profesorsLibres.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Nomina_ProfesoresImpl
