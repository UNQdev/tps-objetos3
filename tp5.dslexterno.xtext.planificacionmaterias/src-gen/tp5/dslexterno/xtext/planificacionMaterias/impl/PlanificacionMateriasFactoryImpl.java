/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tp5.dslexterno.xtext.planificacionMaterias.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanificacionMateriasFactoryImpl extends EFactoryImpl implements PlanificacionMateriasFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlanificacionMateriasFactory init()
  {
    try
    {
      PlanificacionMateriasFactory thePlanificacionMateriasFactory = (PlanificacionMateriasFactory)EPackage.Registry.INSTANCE.getEFactory(PlanificacionMateriasPackage.eNS_URI);
      if (thePlanificacionMateriasFactory != null)
      {
        return thePlanificacionMateriasFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlanificacionMateriasFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificacionMateriasFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlanificacionMateriasPackage.MODEL: return createModel();
      case PlanificacionMateriasPackage.PLANIFICACION: return createPlanificacion();
      case PlanificacionMateriasPackage.ASIGNACION_MATERIA: return createAsignacion_Materia();
      case PlanificacionMateriasPackage.ASIGNACION_DIARIA: return createAsignacion_Diaria();
      case PlanificacionMateriasPackage.MATERIA: return createMateria();
      case PlanificacionMateriasPackage.PROFESOR: return createProfesor();
      case PlanificacionMateriasPackage.DISPONIBILIDAD: return createDisponibilidad();
      case PlanificacionMateriasPackage.DEDICACION: return createDedicacion();
      case PlanificacionMateriasPackage.AULA: return createAula();
      case PlanificacionMateriasPackage.RECURSO: return createRecurso();
      case PlanificacionMateriasPackage.HORARIO: return createHorario();
      case PlanificacionMateriasPackage.RANGO_HORARIO: return createRango_Horario();
      case PlanificacionMateriasPackage.DISPONIBLE: return createDisponible();
      case PlanificacionMateriasPackage.NO_DISPONIBLE: return createNo_Disponible();
      case PlanificacionMateriasPackage.SIMPLE: return createSimple();
      case PlanificacionMateriasPackage.SEMI: return createSemi();
      case PlanificacionMateriasPackage.EXCLUSIVA: return createExclusiva();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlanificacionMateriasPackage.DIA:
        return createDiaFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlanificacionMateriasPackage.DIA:
        return convertDiaToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Planificacion createPlanificacion()
  {
    PlanificacionImpl planificacion = new PlanificacionImpl();
    return planificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asignacion_Materia createAsignacion_Materia()
  {
    Asignacion_MateriaImpl asignacion_Materia = new Asignacion_MateriaImpl();
    return asignacion_Materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asignacion_Diaria createAsignacion_Diaria()
  {
    Asignacion_DiariaImpl asignacion_Diaria = new Asignacion_DiariaImpl();
    return asignacion_Diaria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia createMateria()
  {
    MateriaImpl materia = new MateriaImpl();
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor createProfesor()
  {
    ProfesorImpl profesor = new ProfesorImpl();
    return profesor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disponibilidad createDisponibilidad()
  {
    DisponibilidadImpl disponibilidad = new DisponibilidadImpl();
    return disponibilidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion createDedicacion()
  {
    DedicacionImpl dedicacion = new DedicacionImpl();
    return dedicacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula createAula()
  {
    AulaImpl aula = new AulaImpl();
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recurso createRecurso()
  {
    RecursoImpl recurso = new RecursoImpl();
    return recurso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario createHorario()
  {
    HorarioImpl horario = new HorarioImpl();
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rango_Horario createRango_Horario()
  {
    Rango_HorarioImpl rango_Horario = new Rango_HorarioImpl();
    return rango_Horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disponible createDisponible()
  {
    DisponibleImpl disponible = new DisponibleImpl();
    return disponible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public No_Disponible createNo_Disponible()
  {
    No_DisponibleImpl no_Disponible = new No_DisponibleImpl();
    return no_Disponible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simple createSimple()
  {
    SimpleImpl simple = new SimpleImpl();
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Semi createSemi()
  {
    SemiImpl semi = new SemiImpl();
    return semi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exclusiva createExclusiva()
  {
    ExclusivaImpl exclusiva = new ExclusivaImpl();
    return exclusiva;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia createDiaFromString(EDataType eDataType, String initialValue)
  {
    Dia result = Dia.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDiaToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificacionMateriasPackage getPlanificacionMateriasPackage()
  {
    return (PlanificacionMateriasPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlanificacionMateriasPackage getPackage()
  {
    return PlanificacionMateriasPackage.eINSTANCE;
  }

} //PlanificacionMateriasFactoryImpl
