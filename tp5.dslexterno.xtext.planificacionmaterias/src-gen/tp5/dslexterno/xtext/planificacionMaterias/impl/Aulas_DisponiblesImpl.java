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

import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aulas Disponibles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Aulas_DisponiblesImpl#getAulasDisponibles <em>Aulas Disponibles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Aulas_DisponiblesImpl extends Estructuras_PlanificacionImpl implements Aulas_Disponibles
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Aulas_DisponiblesImpl()
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
    return PlanificacionMateriasPackage.Literals.AULAS_DISPONIBLES;
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
      aulasDisponibles = new EObjectContainmentEList<Aula>(Aula.class, this, PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES);
    }
    return aulasDisponibles;
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
      case PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES:
        return ((InternalEList<?>)getAulasDisponibles()).basicRemove(otherEnd, msgs);
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
      case PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES:
        return getAulasDisponibles();
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
      case PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES:
        getAulasDisponibles().clear();
        getAulasDisponibles().addAll((Collection<? extends Aula>)newValue);
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
      case PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES:
        getAulasDisponibles().clear();
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
      case PlanificacionMateriasPackage.AULAS_DISPONIBLES__AULAS_DISPONIBLES:
        return aulasDisponibles != null && !aulasDisponibles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Aulas_DisponiblesImpl
