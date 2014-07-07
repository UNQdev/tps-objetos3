/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Dedicacion;
import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad;
import tp5.dslexterno.xtext.planificacionMaterias.Disponible;
import tp5.dslexterno.xtext.planificacionMaterias.Exclusiva;
import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.No_Disponible;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasFactory;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;
import tp5.dslexterno.xtext.planificacionMaterias.Recurso;
import tp5.dslexterno.xtext.planificacionMaterias.Semi;
import tp5.dslexterno.xtext.planificacionMaterias.Simple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanificacionMateriasPackageImpl extends EPackageImpl implements PlanificacionMateriasPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass planificacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacion_MateriaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacion_DiariaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass materiaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass profesorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disponibilidadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dedicacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recursoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rango_HorarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disponibleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass no_DisponibleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusivaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum diaEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PlanificacionMateriasPackageImpl()
  {
    super(eNS_URI, PlanificacionMateriasFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PlanificacionMateriasPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PlanificacionMateriasPackage init()
  {
    if (isInited) return (PlanificacionMateriasPackage)EPackage.Registry.INSTANCE.getEPackage(PlanificacionMateriasPackage.eNS_URI);

    // Obtain or create and register package
    PlanificacionMateriasPackageImpl thePlanificacionMateriasPackage = (PlanificacionMateriasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlanificacionMateriasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlanificacionMateriasPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePlanificacionMateriasPackage.createPackageContents();

    // Initialize created meta-data
    thePlanificacionMateriasPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePlanificacionMateriasPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PlanificacionMateriasPackage.eNS_URI, thePlanificacionMateriasPackage);
    return thePlanificacionMateriasPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_ProfesoresLibres()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_AulasDisponibles()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_MateriasAbiertas()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Planificacion()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlanificacion()
  {
    return planificacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlanificacion_Anio()
  {
    return (EAttribute)planificacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlanificacion_Semestre()
  {
    return (EAttribute)planificacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlanificacion_MateriasADictar()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlanificacion_AsignacionesDeMaterias()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsignacion_Materia()
  {
    return asignacion_MateriaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_Materia()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_Profesor()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_Aula()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsignacion_Materia_AlumnosInscriptos()
  {
    return (EAttribute)asignacion_MateriaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_AsignacionesDiarias()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsignacion_Diaria()
  {
    return asignacion_DiariaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsignacion_Diaria_Dia()
  {
    return (EAttribute)asignacion_DiariaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Diaria_RangoHorario()
  {
    return (EReference)asignacion_DiariaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMateria()
  {
    return materiaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMateria_Name()
  {
    return (EAttribute)materiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMateria_CantidadHorasSemanales()
  {
    return (EAttribute)materiaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMateria_DiasSemanales()
  {
    return (EAttribute)materiaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_Requerimientos()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProfesor()
  {
    return profesorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProfesor_Name()
  {
    return (EAttribute)profesorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProfesor_Dedicacion()
  {
    return (EReference)profesorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProfesor_Disponibilidad()
  {
    return (EReference)profesorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisponibilidad()
  {
    return disponibilidadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisponibilidad_Dia()
  {
    return (EAttribute)disponibilidadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisponibilidad_RangosHorario()
  {
    return (EReference)disponibilidadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDedicacion()
  {
    return dedicacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAula()
  {
    return aulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAula_Name()
  {
    return (EAttribute)aulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAula_Capacidad()
  {
    return (EAttribute)aulaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAula_Recusos()
  {
    return (EReference)aulaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecurso()
  {
    return recursoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecurso_Name()
  {
    return (EAttribute)recursoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorario()
  {
    return horarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Hora()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Minutos()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRango_Horario()
  {
    return rango_HorarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRango_Horario_HoraInicio()
  {
    return (EReference)rango_HorarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRango_Horario_HoraFinal()
  {
    return (EReference)rango_HorarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisponible()
  {
    return disponibleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNo_Disponible()
  {
    return no_DisponibleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimple()
  {
    return simpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSemi()
  {
    return semiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExclusiva()
  {
    return exclusivaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDia()
  {
    return diaEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificacionMateriasFactory getPlanificacionMateriasFactory()
  {
    return (PlanificacionMateriasFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROFESORES_LIBRES);
    createEReference(modelEClass, MODEL__AULAS_DISPONIBLES);
    createEReference(modelEClass, MODEL__MATERIAS_ABIERTAS);
    createEReference(modelEClass, MODEL__PLANIFICACION);

    planificacionEClass = createEClass(PLANIFICACION);
    createEAttribute(planificacionEClass, PLANIFICACION__ANIO);
    createEAttribute(planificacionEClass, PLANIFICACION__SEMESTRE);
    createEReference(planificacionEClass, PLANIFICACION__MATERIAS_ADICTAR);
    createEReference(planificacionEClass, PLANIFICACION__ASIGNACIONES_DE_MATERIAS);

    asignacion_MateriaEClass = createEClass(ASIGNACION_MATERIA);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__MATERIA);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__PROFESOR);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__AULA);
    createEAttribute(asignacion_MateriaEClass, ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__ASIGNACIONES_DIARIAS);

    asignacion_DiariaEClass = createEClass(ASIGNACION_DIARIA);
    createEAttribute(asignacion_DiariaEClass, ASIGNACION_DIARIA__DIA);
    createEReference(asignacion_DiariaEClass, ASIGNACION_DIARIA__RANGO_HORARIO);

    materiaEClass = createEClass(MATERIA);
    createEAttribute(materiaEClass, MATERIA__NAME);
    createEAttribute(materiaEClass, MATERIA__CANTIDAD_HORAS_SEMANALES);
    createEAttribute(materiaEClass, MATERIA__DIAS_SEMANALES);
    createEReference(materiaEClass, MATERIA__REQUERIMIENTOS);

    profesorEClass = createEClass(PROFESOR);
    createEAttribute(profesorEClass, PROFESOR__NAME);
    createEReference(profesorEClass, PROFESOR__DEDICACION);
    createEReference(profesorEClass, PROFESOR__DISPONIBILIDAD);

    disponibilidadEClass = createEClass(DISPONIBILIDAD);
    createEAttribute(disponibilidadEClass, DISPONIBILIDAD__DIA);
    createEReference(disponibilidadEClass, DISPONIBILIDAD__RANGOS_HORARIO);

    dedicacionEClass = createEClass(DEDICACION);

    aulaEClass = createEClass(AULA);
    createEAttribute(aulaEClass, AULA__NAME);
    createEAttribute(aulaEClass, AULA__CAPACIDAD);
    createEReference(aulaEClass, AULA__RECUSOS);

    recursoEClass = createEClass(RECURSO);
    createEAttribute(recursoEClass, RECURSO__NAME);

    horarioEClass = createEClass(HORARIO);
    createEAttribute(horarioEClass, HORARIO__HORA);
    createEAttribute(horarioEClass, HORARIO__MINUTOS);

    rango_HorarioEClass = createEClass(RANGO_HORARIO);
    createEReference(rango_HorarioEClass, RANGO_HORARIO__HORA_INICIO);
    createEReference(rango_HorarioEClass, RANGO_HORARIO__HORA_FINAL);

    disponibleEClass = createEClass(DISPONIBLE);

    no_DisponibleEClass = createEClass(NO_DISPONIBLE);

    simpleEClass = createEClass(SIMPLE);

    semiEClass = createEClass(SEMI);

    exclusivaEClass = createEClass(EXCLUSIVA);

    // Create enums
    diaEEnum = createEEnum(DIA);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    disponibleEClass.getESuperTypes().add(this.getDisponibilidad());
    no_DisponibleEClass.getESuperTypes().add(this.getDisponibilidad());
    simpleEClass.getESuperTypes().add(this.getDedicacion());
    semiEClass.getESuperTypes().add(this.getDedicacion());
    exclusivaEClass.getESuperTypes().add(this.getDedicacion());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_ProfesoresLibres(), this.getProfesor(), null, "profesoresLibres", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_AulasDisponibles(), this.getAula(), null, "aulasDisponibles", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_MateriasAbiertas(), this.getMateria(), null, "materiasAbiertas", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Planificacion(), this.getPlanificacion(), null, "planificacion", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(planificacionEClass, Planificacion.class, "Planificacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlanificacion_Anio(), ecorePackage.getEInt(), "anio", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlanificacion_Semestre(), ecorePackage.getEInt(), "semestre", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_MateriasADictar(), this.getMateria(), null, "materiasADictar", null, 0, -1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_AsignacionesDeMaterias(), this.getAsignacion_Materia(), null, "asignacionesDeMaterias", null, 0, -1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacion_MateriaEClass, Asignacion_Materia.class, "Asignacion_Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAsignacion_Materia_Materia(), this.getMateria(), null, "materia", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_Profesor(), this.getProfesor(), null, "profesor", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_Aula(), this.getAula(), null, "aula", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsignacion_Materia_AlumnosInscriptos(), ecorePackage.getEInt(), "alumnosInscriptos", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_AsignacionesDiarias(), this.getAsignacion_Diaria(), null, "asignacionesDiarias", null, 0, -1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacion_DiariaEClass, Asignacion_Diaria.class, "Asignacion_Diaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacion_Diaria_Dia(), this.getDia(), "dia", null, 0, 1, Asignacion_Diaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Diaria_RangoHorario(), this.getRango_Horario(), null, "rangoHorario", null, 0, 1, Asignacion_Diaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(materiaEClass, Materia.class, "Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMateria_Name(), ecorePackage.getEString(), "name", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMateria_CantidadHorasSemanales(), ecorePackage.getEInt(), "cantidadHorasSemanales", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMateria_DiasSemanales(), ecorePackage.getEInt(), "diasSemanales", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_Requerimientos(), this.getRecurso(), null, "requerimientos", null, 0, -1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProfesor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfesor_Dedicacion(), this.getDedicacion(), null, "dedicacion", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfesor_Disponibilidad(), this.getDisponibilidad(), null, "disponibilidad", null, 0, -1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disponibilidadEClass, Disponibilidad.class, "Disponibilidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisponibilidad_Dia(), this.getDia(), "dia", null, 0, 1, Disponibilidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisponibilidad_RangosHorario(), this.getRango_Horario(), null, "rangosHorario", null, 0, 1, Disponibilidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dedicacionEClass, Dedicacion.class, "Dedicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aulaEClass, Aula.class, "Aula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAula_Name(), ecorePackage.getEString(), "name", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAula_Capacidad(), ecorePackage.getEInt(), "capacidad", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAula_Recusos(), this.getRecurso(), null, "recusos", null, 0, -1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursoEClass, Recurso.class, "Recurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecurso_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horarioEClass, Horario.class, "Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHorario_Hora(), ecorePackage.getEInt(), "hora", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHorario_Minutos(), ecorePackage.getEInt(), "minutos", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rango_HorarioEClass, Rango_Horario.class, "Rango_Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRango_Horario_HoraInicio(), this.getHorario(), null, "horaInicio", null, 0, 1, Rango_Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRango_Horario_HoraFinal(), this.getHorario(), null, "horaFinal", null, 0, 1, Rango_Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disponibleEClass, Disponible.class, "Disponible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(no_DisponibleEClass, No_Disponible.class, "No_Disponible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(semiEClass, Semi.class, "Semi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exclusivaEClass, Exclusiva.class, "Exclusiva", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(diaEEnum, Dia.class, "Dia");
    addEEnumLiteral(diaEEnum, Dia.LUNES);
    addEEnumLiteral(diaEEnum, Dia.MARTES);
    addEEnumLiteral(diaEEnum, Dia.MIERCOLES);
    addEEnumLiteral(diaEEnum, Dia.JUEVES);
    addEEnumLiteral(diaEEnum, Dia.VIERNES);
    addEEnumLiteral(diaEEnum, Dia.SABADO);

    // Create resource
    createResource(eNS_URI);
  }

} //PlanificacionMateriasPackageImpl
