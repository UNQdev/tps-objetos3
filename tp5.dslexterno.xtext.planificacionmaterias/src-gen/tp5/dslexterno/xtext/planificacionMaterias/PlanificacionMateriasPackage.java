/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasFactory
 * @model kind="package"
 * @generated
 */
public interface PlanificacionMateriasPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "planificacionMaterias";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslexterno.tp5/xtext/PlanificacionMaterias";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "planificacionMaterias";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanificacionMateriasPackage eINSTANCE = tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl.init();

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elementos Planificacion</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTOS_PLANIFICACION = 0;

  /**
   * The feature id for the '<em><b>Planificacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANIFICACION = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Estructuras_PlanificacionImpl <em>Estructuras Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Estructuras_PlanificacionImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getEstructuras_Planificacion()
   * @generated
   */
  int ESTRUCTURAS_PLANIFICACION = 5;

  /**
   * The number of structural features of the '<em>Estructuras Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Materias_AbiertasImpl <em>Materias Abiertas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Materias_AbiertasImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getMaterias_Abiertas()
   * @generated
   */
  int MATERIAS_ABIERTAS = 1;

  /**
   * The feature id for the '<em><b>Materias Abiertas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAS_ABIERTAS__MATERIAS_ABIERTAS = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Materias Abiertas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAS_ABIERTAS_FEATURE_COUNT = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Aulas_DisponiblesImpl <em>Aulas Disponibles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Aulas_DisponiblesImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAulas_Disponibles()
   * @generated
   */
  int AULAS_DISPONIBLES = 2;

  /**
   * The feature id for the '<em><b>Aulas Disponibles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULAS_DISPONIBLES__AULAS_DISPONIBLES = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Aulas Disponibles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULAS_DISPONIBLES_FEATURE_COUNT = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Nomina_ProfesoresImpl <em>Nomina Profesores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Nomina_ProfesoresImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getNomina_Profesores()
   * @generated
   */
  int NOMINA_PROFESORES = 3;

  /**
   * The feature id for the '<em><b>Profesores Libres</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOMINA_PROFESORES__PROFESORES_LIBRES = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nomina Profesores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOMINA_PROFESORES_FEATURE_COUNT = ESTRUCTURAS_PLANIFICACION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl <em>Asignacion Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAsignacion_Materia()
   * @generated
   */
  int ASIGNACION_MATERIA = 4;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__DIA = 0;

  /**
   * The feature id for the '<em><b>Rango Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__RANGO_HORARIO = 1;

  /**
   * The feature id for the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__MATERIA = 2;

  /**
   * The feature id for the '<em><b>Cantidad Alumnos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__CANTIDAD_ALUMNOS = 3;

  /**
   * The number of structural features of the '<em>Asignacion Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 6;

  /**
   * The feature id for the '<em><b>Anio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ANIO = 0;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__SEMESTRE = 1;

  /**
   * The feature id for the '<em><b>Asignacion De Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ASIGNACION_DE_MATERIAS = 2;

  /**
   * The number of structural features of the '<em>Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NAME = 0;

  /**
   * The feature id for the '<em><b>Requerimientos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__REQUERIMIENTOS = 1;

  /**
   * The feature id for the '<em><b>Profesor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__PROFESOR = 2;

  /**
   * The feature id for the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__AULA = 3;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = 1;

  /**
   * The feature id for the '<em><b>Disponibilidad</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DISPONIBILIDAD = 2;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl <em>Disponibilidad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDisponibilidad()
   * @generated
   */
  int DISPONIBILIDAD = 9;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__DIA = 0;

  /**
   * The feature id for the '<em><b>Rango Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__RANGO_HORARIO = 1;

  /**
   * The number of structural features of the '<em>Disponibilidad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DedicacionImpl <em>Dedicacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.DedicacionImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDedicacion()
   * @generated
   */
  int DEDICACION = 10;

  /**
   * The number of structural features of the '<em>Dedicacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEDICACION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAula()
   * @generated
   */
  int AULA = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__NAME = 0;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__CAPACIDAD = 1;

  /**
   * The feature id for the '<em><b>Recusos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__RECUSOS = 2;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.RecursoImpl <em>Recurso</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.RecursoImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getRecurso()
   * @generated
   */
  int RECURSO = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO__NAME = 0;

  /**
   * The number of structural features of the '<em>Recurso</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getHorario()
   * @generated
   */
  int HORARIO = 13;

  /**
   * The feature id for the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HORA = 0;

  /**
   * The feature id for the '<em><b>Minutos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__MINUTOS = 1;

  /**
   * The number of structural features of the '<em>Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl <em>Rango Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getRango_Horario()
   * @generated
   */
  int RANGO_HORARIO = 14;

  /**
   * The feature id for the '<em><b>Hora Inicio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGO_HORARIO__HORA_INICIO = 0;

  /**
   * The feature id for the '<em><b>Hora Final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGO_HORARIO__HORA_FINAL = 1;

  /**
   * The number of structural features of the '<em>Rango Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGO_HORARIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.SimpleImpl <em>Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.SimpleImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getSimple()
   * @generated
   */
  int SIMPLE = 15;

  /**
   * The number of structural features of the '<em>Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.SemiImpl <em>Semi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.SemiImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getSemi()
   * @generated
   */
  int SEMI = 16;

  /**
   * The number of structural features of the '<em>Semi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ExclusivaImpl <em>Exclusiva</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ExclusivaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getExclusiva()
   * @generated
   */
  int EXCLUSIVA = 17;

  /**
   * The number of structural features of the '<em>Exclusiva</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVA_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.Dia <em>Dia</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDia()
   * @generated
   */
  int DIA = 18;


  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getElementosPlanificacion <em>Elementos Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elementos Planificacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model#getElementosPlanificacion()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ElementosPlanificacion();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getPlanificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Planificacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model#getPlanificacion()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Planificacion();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas <em>Materias Abiertas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materias Abiertas</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas
   * @generated
   */
  EClass getMaterias_Abiertas();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas#getMateriasAbiertas <em>Materias Abiertas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias Abiertas</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materias_Abiertas#getMateriasAbiertas()
   * @see #getMaterias_Abiertas()
   * @generated
   */
  EReference getMaterias_Abiertas_MateriasAbiertas();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles <em>Aulas Disponibles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aulas Disponibles</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles
   * @generated
   */
  EClass getAulas_Disponibles();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles#getAulasDisponibles <em>Aulas Disponibles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aulas Disponibles</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aulas_Disponibles#getAulasDisponibles()
   * @see #getAulas_Disponibles()
   * @generated
   */
  EReference getAulas_Disponibles_AulasDisponibles();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores <em>Nomina Profesores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nomina Profesores</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores
   * @generated
   */
  EClass getNomina_Profesores();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores#getProfesoresLibres <em>Profesores Libres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profesores Libres</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Nomina_Profesores#getProfesoresLibres()
   * @see #getNomina_Profesores()
   * @generated
   */
  EReference getNomina_Profesores_ProfesoresLibres();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia <em>Asignacion Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asignacion Materia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia
   * @generated
   */
  EClass getAsignacion_Materia();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getDia()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EAttribute getAsignacion_Materia_Dia();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getRangoHorario <em>Rango Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rango Horario</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getRangoHorario()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EReference getAsignacion_Materia_RangoHorario();

  /**
   * Returns the meta object for the reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Materia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getMateria()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EReference getAsignacion_Materia_Materia();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getCantidadAlumnos <em>Cantidad Alumnos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cantidad Alumnos</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getCantidadAlumnos()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EAttribute getAsignacion_Materia_CantidadAlumnos();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Estructuras_Planificacion <em>Estructuras Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estructuras Planificacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Estructuras_Planificacion
   * @generated
   */
  EClass getEstructuras_Planificacion();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planificacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion
   * @generated
   */
  EClass getPlanificacion();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAnio <em>Anio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anio</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAnio()
   * @see #getPlanificacion()
   * @generated
   */
  EAttribute getPlanificacion_Anio();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semestre</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getSemestre()
   * @see #getPlanificacion()
   * @generated
   */
  EAttribute getPlanificacion_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAsignacionDeMaterias <em>Asignacion De Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asignacion De Materias</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAsignacionDeMaterias()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_AsignacionDeMaterias();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia
   * @generated
   */
  EClass getMateria();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getName()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Name();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getRequerimientos <em>Requerimientos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requerimientos</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getRequerimientos()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_Requerimientos();

  /**
   * Returns the meta object for the reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getProfesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Profesor</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getProfesor()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_Profesor();

  /**
   * Returns the meta object for the reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aula</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getAula()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_Aula();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profesor</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Profesor
   * @generated
   */
  EClass getProfesor();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Profesor#getName()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Name();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dedicacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDedicacion()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Dedicacion();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDisponibilidad <em>Disponibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disponibilidad</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDisponibilidad()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Disponibilidad();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad <em>Disponibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disponibilidad</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad
   * @generated
   */
  EClass getDisponibilidad();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getDia()
   * @see #getDisponibilidad()
   * @generated
   */
  EAttribute getDisponibilidad_Dia();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getRangoHorario <em>Rango Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rango Horario</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Disponibilidad#getRangoHorario()
   * @see #getDisponibilidad()
   * @generated
   */
  EReference getDisponibilidad_RangoHorario();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Dedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dedicacion</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dedicacion
   * @generated
   */
  EClass getDedicacion();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aula
   * @generated
   */
  EClass getAula();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aula#getName()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Name();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getCapacidad <em>Capacidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacidad</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aula#getCapacidad()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Capacidad();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Aula#getRecusos <em>Recusos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recusos</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Aula#getRecusos()
   * @see #getAula()
   * @generated
   */
  EReference getAula_Recusos();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Recurso <em>Recurso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recurso</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Recurso
   * @generated
   */
  EClass getRecurso();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Recurso#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Recurso#getName()
   * @see #getRecurso()
   * @generated
   */
  EAttribute getRecurso_Name();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getHora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Horario#getHora()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Hora();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Horario#getMinutos <em>Minutos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutos</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Horario#getMinutos()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Minutos();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario <em>Rango Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rango Horario</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario
   * @generated
   */
  EClass getRango_Horario();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraInicio <em>Hora Inicio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hora Inicio</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraInicio()
   * @see #getRango_Horario()
   * @generated
   */
  EReference getRango_Horario_HoraInicio();

  /**
   * Returns the meta object for the containment reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraFinal <em>Hora Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hora Final</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario#getHoraFinal()
   * @see #getRango_Horario()
   * @generated
   */
  EReference getRango_Horario_HoraFinal();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Simple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Simple
   * @generated
   */
  EClass getSimple();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Semi <em>Semi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semi</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Semi
   * @generated
   */
  EClass getSemi();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Exclusiva <em>Exclusiva</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusiva</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Exclusiva
   * @generated
   */
  EClass getExclusiva();

  /**
   * Returns the meta object for enum '{@link tp5.dslexterno.xtext.planificacionMaterias.Dia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
   * @generated
   */
  EEnum getDia();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlanificacionMateriasFactory getPlanificacionMateriasFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ModelImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elementos Planificacion</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTOS_PLANIFICACION = eINSTANCE.getModel_ElementosPlanificacion();

    /**
     * The meta object literal for the '<em><b>Planificacion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANIFICACION = eINSTANCE.getModel_Planificacion();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Materias_AbiertasImpl <em>Materias Abiertas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Materias_AbiertasImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getMaterias_Abiertas()
     * @generated
     */
    EClass MATERIAS_ABIERTAS = eINSTANCE.getMaterias_Abiertas();

    /**
     * The meta object literal for the '<em><b>Materias Abiertas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIAS_ABIERTAS__MATERIAS_ABIERTAS = eINSTANCE.getMaterias_Abiertas_MateriasAbiertas();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Aulas_DisponiblesImpl <em>Aulas Disponibles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Aulas_DisponiblesImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAulas_Disponibles()
     * @generated
     */
    EClass AULAS_DISPONIBLES = eINSTANCE.getAulas_Disponibles();

    /**
     * The meta object literal for the '<em><b>Aulas Disponibles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULAS_DISPONIBLES__AULAS_DISPONIBLES = eINSTANCE.getAulas_Disponibles_AulasDisponibles();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Nomina_ProfesoresImpl <em>Nomina Profesores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Nomina_ProfesoresImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getNomina_Profesores()
     * @generated
     */
    EClass NOMINA_PROFESORES = eINSTANCE.getNomina_Profesores();

    /**
     * The meta object literal for the '<em><b>Profesores Libres</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOMINA_PROFESORES__PROFESORES_LIBRES = eINSTANCE.getNomina_Profesores_ProfesoresLibres();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl <em>Asignacion Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAsignacion_Materia()
     * @generated
     */
    EClass ASIGNACION_MATERIA = eINSTANCE.getAsignacion_Materia();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION_MATERIA__DIA = eINSTANCE.getAsignacion_Materia_Dia();

    /**
     * The meta object literal for the '<em><b>Rango Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION_MATERIA__RANGO_HORARIO = eINSTANCE.getAsignacion_Materia_RangoHorario();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION_MATERIA__MATERIA = eINSTANCE.getAsignacion_Materia_Materia();

    /**
     * The meta object literal for the '<em><b>Cantidad Alumnos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION_MATERIA__CANTIDAD_ALUMNOS = eINSTANCE.getAsignacion_Materia_CantidadAlumnos();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Estructuras_PlanificacionImpl <em>Estructuras Planificacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Estructuras_PlanificacionImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getEstructuras_Planificacion()
     * @generated
     */
    EClass ESTRUCTURAS_PLANIFICACION = eINSTANCE.getEstructuras_Planificacion();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl <em>Planificacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getPlanificacion()
     * @generated
     */
    EClass PLANIFICACION = eINSTANCE.getPlanificacion();

    /**
     * The meta object literal for the '<em><b>Anio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANIFICACION__ANIO = eINSTANCE.getPlanificacion_Anio();

    /**
     * The meta object literal for the '<em><b>Semestre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANIFICACION__SEMESTRE = eINSTANCE.getPlanificacion_Semestre();

    /**
     * The meta object literal for the '<em><b>Asignacion De Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__ASIGNACION_DE_MATERIAS = eINSTANCE.getPlanificacion_AsignacionDeMaterias();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl <em>Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getMateria()
     * @generated
     */
    EClass MATERIA = eINSTANCE.getMateria();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__NAME = eINSTANCE.getMateria_Name();

    /**
     * The meta object literal for the '<em><b>Requerimientos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__REQUERIMIENTOS = eINSTANCE.getMateria_Requerimientos();

    /**
     * The meta object literal for the '<em><b>Profesor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__PROFESOR = eINSTANCE.getMateria_Profesor();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__AULA = eINSTANCE.getMateria_Aula();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl <em>Profesor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ProfesorImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getProfesor()
     * @generated
     */
    EClass PROFESOR = eINSTANCE.getProfesor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__NAME = eINSTANCE.getProfesor_Name();

    /**
     * The meta object literal for the '<em><b>Dedicacion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__DEDICACION = eINSTANCE.getProfesor_Dedicacion();

    /**
     * The meta object literal for the '<em><b>Disponibilidad</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__DISPONIBILIDAD = eINSTANCE.getProfesor_Disponibilidad();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl <em>Disponibilidad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.DisponibilidadImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDisponibilidad()
     * @generated
     */
    EClass DISPONIBILIDAD = eINSTANCE.getDisponibilidad();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPONIBILIDAD__DIA = eINSTANCE.getDisponibilidad_Dia();

    /**
     * The meta object literal for the '<em><b>Rango Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPONIBILIDAD__RANGO_HORARIO = eINSTANCE.getDisponibilidad_RangoHorario();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.DedicacionImpl <em>Dedicacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.DedicacionImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDedicacion()
     * @generated
     */
    EClass DEDICACION = eINSTANCE.getDedicacion();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl <em>Aula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.AulaImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAula()
     * @generated
     */
    EClass AULA = eINSTANCE.getAula();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__NAME = eINSTANCE.getAula_Name();

    /**
     * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__CAPACIDAD = eINSTANCE.getAula_Capacidad();

    /**
     * The meta object literal for the '<em><b>Recusos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA__RECUSOS = eINSTANCE.getAula_Recusos();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.RecursoImpl <em>Recurso</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.RecursoImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getRecurso()
     * @generated
     */
    EClass RECURSO = eINSTANCE.getRecurso();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECURSO__NAME = eINSTANCE.getRecurso_Name();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.HorarioImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getHorario()
     * @generated
     */
    EClass HORARIO = eINSTANCE.getHorario();

    /**
     * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__HORA = eINSTANCE.getHorario_Hora();

    /**
     * The meta object literal for the '<em><b>Minutos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__MINUTOS = eINSTANCE.getHorario_Minutos();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl <em>Rango Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Rango_HorarioImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getRango_Horario()
     * @generated
     */
    EClass RANGO_HORARIO = eINSTANCE.getRango_Horario();

    /**
     * The meta object literal for the '<em><b>Hora Inicio</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGO_HORARIO__HORA_INICIO = eINSTANCE.getRango_Horario_HoraInicio();

    /**
     * The meta object literal for the '<em><b>Hora Final</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGO_HORARIO__HORA_FINAL = eINSTANCE.getRango_Horario_HoraFinal();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.SimpleImpl <em>Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.SimpleImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getSimple()
     * @generated
     */
    EClass SIMPLE = eINSTANCE.getSimple();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.SemiImpl <em>Semi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.SemiImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getSemi()
     * @generated
     */
    EClass SEMI = eINSTANCE.getSemi();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.ExclusivaImpl <em>Exclusiva</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.ExclusivaImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getExclusiva()
     * @generated
     */
    EClass EXCLUSIVA = eINSTANCE.getExclusiva();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.Dia <em>Dia</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.Dia
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getDia()
     * @generated
     */
    EEnum DIA = eINSTANCE.getDia();

  }

} //PlanificacionMateriasPackage
