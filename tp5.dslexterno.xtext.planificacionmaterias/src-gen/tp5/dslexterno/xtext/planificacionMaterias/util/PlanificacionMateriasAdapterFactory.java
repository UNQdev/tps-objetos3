/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tp5.dslexterno.xtext.planificacionMaterias.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage
 * @generated
 */
public class PlanificacionMateriasAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanificacionMateriasPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificacionMateriasAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanificacionMateriasPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanificacionMateriasSwitch<Adapter> modelSwitch =
    new PlanificacionMateriasSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseElementos(Elementos object)
      {
        return createElementosAdapter();
      }
      @Override
      public Adapter caseNomina_Profesores(Nomina_Profesores object)
      {
        return createNomina_ProfesoresAdapter();
      }
      @Override
      public Adapter caseAulas_Disponibles(Aulas_Disponibles object)
      {
        return createAulas_DisponiblesAdapter();
      }
      @Override
      public Adapter caseMaterias_Abiertas(Materias_Abiertas object)
      {
        return createMaterias_AbiertasAdapter();
      }
      @Override
      public Adapter casePlanificacion(Planificacion object)
      {
        return createPlanificacionAdapter();
      }
      @Override
      public Adapter caseAsignacion_Materia(Asignacion_Materia object)
      {
        return createAsignacion_MateriaAdapter();
      }
      @Override
      public Adapter caseMateria(Materia object)
      {
        return createMateriaAdapter();
      }
      @Override
      public Adapter caseAula(Aula object)
      {
        return createAulaAdapter();
      }
      @Override
      public Adapter caseRecurso(Recurso object)
      {
        return createRecursoAdapter();
      }
      @Override
      public Adapter caseProfesor(Profesor object)
      {
        return createProfesorAdapter();
      }
      @Override
      public Adapter caseDedicacion(Dedicacion object)
      {
        return createDedicacionAdapter();
      }
      @Override
      public Adapter caseHorario(Horario object)
      {
        return createHorarioAdapter();
      }
      @Override
      public Adapter caseSimple(Simple object)
      {
        return createSimpleAdapter();
      }
      @Override
      public Adapter caseSemi(Semi object)
      {
        return createSemiAdapter();
      }
      @Override
      public Adapter caseExclusiva(Exclusiva object)
      {
        return createExclusivaAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Elementos <em>Elementos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Elementos
   * @generated
   */
  public Adapter createElementosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores <em>Nomina Profesores</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores
   * @generated
   */
  public Adapter createNomina_ProfesoresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles <em>Aulas Disponibles</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles
   * @generated
   */
  public Adapter createAulas_DisponiblesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas <em>Materias Abiertas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas
   * @generated
   */
  public Adapter createMaterias_AbiertasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion
   * @generated
   */
  public Adapter createPlanificacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia <em>Asignacion Materia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia
   * @generated
   */
  public Adapter createAsignacion_MateriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia
   * @generated
   */
  public Adapter createMateriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aula
   * @generated
   */
  public Adapter createAulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Recurso <em>Recurso</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Recurso
   * @generated
   */
  public Adapter createRecursoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Profesor
   * @generated
   */
  public Adapter createProfesorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Dedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dedicacion
   * @generated
   */
  public Adapter createDedicacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Horario
   * @generated
   */
  public Adapter createHorarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Simple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Simple
   * @generated
   */
  public Adapter createSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Semi <em>Semi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Semi
   * @generated
   */
  public Adapter createSemiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tp5.dslexterno.xtext.planificacionMaterias.Exclusiva <em>Exclusiva</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Exclusiva
   * @generated
   */
  public Adapter createExclusivaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PlanificacionMateriasAdapterFactory
