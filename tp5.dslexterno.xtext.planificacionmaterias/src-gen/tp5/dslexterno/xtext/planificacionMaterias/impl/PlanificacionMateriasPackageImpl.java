/**
 */
package tp5.dslexterno.xtext.planificacionMaterias.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles;
import tp5.dslexterno.xtext.planificacionMaterias.Dedicacion;
import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Elementos;
import tp5.dslexterno.xtext.planificacionMaterias.Exclusiva;
import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasFactory;
import tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;
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
  private EClass elementosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nomina_ProfesoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aulas_DisponiblesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass materias_AbiertasEClass = null;

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
  private EClass materiaEClass = null;

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
  private EClass profesorEClass = null;

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
  private EClass horarioEClass = null;

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
  public EReference getModel_Elementos()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Planificacion()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementos()
  {
    return elementosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNomina_Profesores()
  {
    return nomina_ProfesoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNomina_Profesores_ProfesorsLibres()
  {
    return (EReference)nomina_ProfesoresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAulas_Disponibles()
  {
    return aulas_DisponiblesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAulas_Disponibles_Aulas()
  {
    return (EReference)aulas_DisponiblesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaterias_Abiertas()
  {
    return materias_AbiertasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaterias_Abiertas_MateriasADictar()
  {
    return (EReference)materias_AbiertasEClass.getEStructuralFeatures().get(0);
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
  public EReference getPlanificacion_AsignacionDeMaterias()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getAsignacion_Materia_Dia()
  {
    return (EAttribute)asignacion_MateriaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_HoraInicio()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_HoraFinal()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia_Materia()
  {
    return (EReference)asignacion_MateriaEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getMateria_Nombre()
  {
    return (EAttribute)materiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_Requerimientos()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_Profesor()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_Aula()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getAula_Numero()
  {
    return (EAttribute)aulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAula_Recusos()
  {
    return (EReference)aulaEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getRecurso_Nombre()
  {
    return (EAttribute)recursoEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getProfesor_Nombre()
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
  public EClass getDedicacion()
  {
    return dedicacionEClass;
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
    createEReference(modelEClass, MODEL__ELEMENTOS);
    createEReference(modelEClass, MODEL__PLANIFICACION);

    elementosEClass = createEClass(ELEMENTOS);

    nomina_ProfesoresEClass = createEClass(NOMINA_PROFESORES);
    createEReference(nomina_ProfesoresEClass, NOMINA_PROFESORES__PROFESORS_LIBRES);

    aulas_DisponiblesEClass = createEClass(AULAS_DISPONIBLES);
    createEReference(aulas_DisponiblesEClass, AULAS_DISPONIBLES__AULAS);

    materias_AbiertasEClass = createEClass(MATERIAS_ABIERTAS);
    createEReference(materias_AbiertasEClass, MATERIAS_ABIERTAS__MATERIAS_ADICTAR);

    planificacionEClass = createEClass(PLANIFICACION);
    createEAttribute(planificacionEClass, PLANIFICACION__ANIO);
    createEAttribute(planificacionEClass, PLANIFICACION__SEMESTRE);
    createEReference(planificacionEClass, PLANIFICACION__ASIGNACION_DE_MATERIAS);

    asignacion_MateriaEClass = createEClass(ASIGNACION_MATERIA);
    createEAttribute(asignacion_MateriaEClass, ASIGNACION_MATERIA__DIA);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__HORA_INICIO);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__HORA_FINAL);
    createEReference(asignacion_MateriaEClass, ASIGNACION_MATERIA__MATERIA);

    materiaEClass = createEClass(MATERIA);
    createEAttribute(materiaEClass, MATERIA__NOMBRE);
    createEReference(materiaEClass, MATERIA__REQUERIMIENTOS);
    createEReference(materiaEClass, MATERIA__PROFESOR);
    createEReference(materiaEClass, MATERIA__AULA);

    aulaEClass = createEClass(AULA);
    createEAttribute(aulaEClass, AULA__NUMERO);
    createEReference(aulaEClass, AULA__RECUSOS);

    recursoEClass = createEClass(RECURSO);
    createEAttribute(recursoEClass, RECURSO__NOMBRE);

    profesorEClass = createEClass(PROFESOR);
    createEAttribute(profesorEClass, PROFESOR__NOMBRE);
    createEReference(profesorEClass, PROFESOR__DEDICACION);

    dedicacionEClass = createEClass(DEDICACION);

    horarioEClass = createEClass(HORARIO);
    createEAttribute(horarioEClass, HORARIO__HORA);
    createEAttribute(horarioEClass, HORARIO__MINUTOS);

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
    nomina_ProfesoresEClass.getESuperTypes().add(this.getElementos());
    aulas_DisponiblesEClass.getESuperTypes().add(this.getElementos());
    materias_AbiertasEClass.getESuperTypes().add(this.getElementos());
    asignacion_MateriaEClass.getESuperTypes().add(this.getElementos());
    materiaEClass.getESuperTypes().add(this.getElementos());
    simpleEClass.getESuperTypes().add(this.getDedicacion());
    semiEClass.getESuperTypes().add(this.getDedicacion());
    exclusivaEClass.getESuperTypes().add(this.getDedicacion());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elementos(), this.getElementos(), null, "elementos", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Planificacion(), this.getPlanificacion(), null, "planificacion", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementosEClass, Elementos.class, "Elementos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nomina_ProfesoresEClass, Nomina_Profesores.class, "Nomina_Profesores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNomina_Profesores_ProfesorsLibres(), this.getProfesor(), null, "profesorsLibres", null, 0, -1, Nomina_Profesores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aulas_DisponiblesEClass, Aulas_Disponibles.class, "Aulas_Disponibles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAulas_Disponibles_Aulas(), this.getAula(), null, "aulas", null, 0, -1, Aulas_Disponibles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(materias_AbiertasEClass, Materias_Abiertas.class, "Materias_Abiertas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaterias_Abiertas_MateriasADictar(), this.getMateria(), null, "materiasADictar", null, 0, -1, Materias_Abiertas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(planificacionEClass, Planificacion.class, "Planificacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlanificacion_Anio(), ecorePackage.getEInt(), "anio", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlanificacion_Semestre(), ecorePackage.getEInt(), "semestre", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_AsignacionDeMaterias(), this.getAsignacion_Materia(), null, "asignacionDeMaterias", null, 0, -1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacion_MateriaEClass, Asignacion_Materia.class, "Asignacion_Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacion_Materia_Dia(), this.getDia(), "dia", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_HoraInicio(), this.getHorario(), null, "horaInicio", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_HoraFinal(), this.getHorario(), null, "horaFinal", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Materia_Materia(), this.getMateria(), null, "materia", null, 0, 1, Asignacion_Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(materiaEClass, Materia.class, "Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMateria_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_Requerimientos(), this.getRecurso(), null, "requerimientos", null, 0, -1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_Profesor(), this.getProfesor(), null, "profesor", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_Aula(), this.getAula(), null, "aula", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aulaEClass, Aula.class, "Aula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAula_Numero(), ecorePackage.getEString(), "numero", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAula_Recusos(), this.getRecurso(), null, "recusos", null, 0, -1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursoEClass, Recurso.class, "Recurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecurso_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProfesor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfesor_Dedicacion(), this.getDedicacion(), null, "dedicacion", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dedicacionEClass, Dedicacion.class, "Dedicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(horarioEClass, Horario.class, "Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHorario_Hora(), ecorePackage.getEInt(), "hora", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHorario_Minutos(), ecorePackage.getEInt(), "minutos", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    // Create resource
    createResource(eNS_URI);
  }

} //PlanificacionMateriasPackageImpl
