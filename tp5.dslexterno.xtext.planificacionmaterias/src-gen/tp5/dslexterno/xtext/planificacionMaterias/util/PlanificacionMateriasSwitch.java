/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tp5.dslexterno.xtext.planificacionMaterias.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage
 * @generated
 */
public class PlanificacionMateriasSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanificacionMateriasPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificacionMateriasSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanificacionMateriasPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PlanificacionMateriasPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.PLANIFICACION:
      {
        Planificacion planificacion = (Planificacion)theEObject;
        T result = casePlanificacion(planificacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA:
      {
        Asignacion_Materia asignacion_Materia = (Asignacion_Materia)theEObject;
        T result = caseAsignacion_Materia(asignacion_Materia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.ASIGNACION_DIARIA:
      {
        Asignacion_Diaria asignacion_Diaria = (Asignacion_Diaria)theEObject;
        T result = caseAsignacion_Diaria(asignacion_Diaria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.MATERIA:
      {
        Materia materia = (Materia)theEObject;
        T result = caseMateria(materia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.PROFESOR:
      {
        Profesor profesor = (Profesor)theEObject;
        T result = caseProfesor(profesor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.DISPONIBILIDAD:
      {
        Disponibilidad disponibilidad = (Disponibilidad)theEObject;
        T result = caseDisponibilidad(disponibilidad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.DEDICACION:
      {
        Dedicacion dedicacion = (Dedicacion)theEObject;
        T result = caseDedicacion(dedicacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.AULA:
      {
        Aula aula = (Aula)theEObject;
        T result = caseAula(aula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.RECURSO:
      {
        Recurso recurso = (Recurso)theEObject;
        T result = caseRecurso(recurso);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.HORARIO:
      {
        Horario horario = (Horario)theEObject;
        T result = caseHorario(horario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.RANGO_HORARIO:
      {
        Rango_Horario rango_Horario = (Rango_Horario)theEObject;
        T result = caseRango_Horario(rango_Horario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.DISPONIBLE:
      {
        Disponible disponible = (Disponible)theEObject;
        T result = caseDisponible(disponible);
        if (result == null) result = caseDisponibilidad(disponible);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.NO_DISPONIBLE:
      {
        No_Disponible no_Disponible = (No_Disponible)theEObject;
        T result = caseNo_Disponible(no_Disponible);
        if (result == null) result = caseDisponibilidad(no_Disponible);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.SIMPLE:
      {
        Simple simple = (Simple)theEObject;
        T result = caseSimple(simple);
        if (result == null) result = caseDedicacion(simple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.SEMI:
      {
        Semi semi = (Semi)theEObject;
        T result = caseSemi(semi);
        if (result == null) result = caseDedicacion(semi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificacionMateriasPackage.EXCLUSIVA:
      {
        Exclusiva exclusiva = (Exclusiva)theEObject;
        T result = caseExclusiva(exclusiva);
        if (result == null) result = caseDedicacion(exclusiva);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planificacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planificacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlanificacion(Planificacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Materia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Materia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacion_Materia(Asignacion_Materia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Diaria</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Diaria</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacion_Diaria(Asignacion_Diaria object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Materia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Materia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMateria(Materia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Profesor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profesor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProfesor(Profesor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disponibilidad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disponibilidad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisponibilidad(Disponibilidad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dedicacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dedicacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDedicacion(Dedicacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAula(Aula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recurso</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recurso</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecurso(Recurso object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorario(Horario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rango Horario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rango Horario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRango_Horario(Rango_Horario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disponible</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disponible</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisponible(Disponible object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Disponible</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Disponible</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNo_Disponible(No_Disponible object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimple(Simple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemi(Semi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclusiva</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclusiva</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExclusiva(Exclusiva object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PlanificacionMateriasSwitch
