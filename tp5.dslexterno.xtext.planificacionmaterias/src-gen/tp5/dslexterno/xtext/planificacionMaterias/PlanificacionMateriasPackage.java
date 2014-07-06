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
   * The feature id for the '<em><b>Profesores Libres</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROFESORES_LIBRES = 0;

  /**
   * The feature id for the '<em><b>Aulas Disponibles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AULAS_DISPONIBLES = 1;

  /**
   * The feature id for the '<em><b>Materias Abiertas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MATERIAS_ABIERTAS = 2;

  /**
   * The feature id for the '<em><b>Planificacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANIFICACION = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 1;

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
   * The feature id for the '<em><b>Materias ADictar</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__MATERIAS_ADICTAR = 2;

  /**
   * The feature id for the '<em><b>Asignaciones Diarias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ASIGNACIONES_DIARIAS = 3;

  /**
   * The number of structural features of the '<em>Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_DiariaImpl <em>Asignacion Diaria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_DiariaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAsignacion_Diaria()
   * @generated
   */
  int ASIGNACION_DIARIA = 2;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_DIARIA__DIA = 0;

  /**
   * The feature id for the '<em><b>Asignaciones De Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_DIARIA__ASIGNACIONES_DE_MATERIAS = 1;

  /**
   * The number of structural features of the '<em>Asignacion Diaria</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_DIARIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl <em>Asignacion Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_MateriaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAsignacion_Materia()
   * @generated
   */
  int ASIGNACION_MATERIA = 3;

  /**
   * The feature id for the '<em><b>Rango Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__RANGO_HORARIO = 0;

  /**
   * The feature id for the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__MATERIA = 1;

  /**
   * The feature id for the '<em><b>Profesor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__PROFESOR = 2;

  /**
   * The feature id for the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__AULA = 3;

  /**
   * The feature id for the '<em><b>Alumnos Inscriptos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS = 4;

  /**
   * The number of structural features of the '<em>Asignacion Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_MATERIA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.MateriaImpl
   * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NAME = 0;

  /**
   * The feature id for the '<em><b>Cantidad Horas Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CANTIDAD_HORAS_SEMANALES = 1;

  /**
   * The feature id for the '<em><b>Dias Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__DIAS_SEMANALES = 2;

  /**
   * The feature id for the '<em><b>Requerimientos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__REQUERIMIENTOS = 3;

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
  int PROFESOR = 5;

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
  int DISPONIBILIDAD = 6;

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
  int DEDICACION = 7;

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
  int AULA = 8;

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
  int RECURSO = 9;

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
  int HORARIO = 10;

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
  int RANGO_HORARIO = 11;

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
  int SIMPLE = 12;

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
  int SEMI = 13;

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
  int EXCLUSIVA = 14;

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
  int DIA = 15;


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
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getProfesoresLibres <em>Profesores Libres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profesores Libres</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model#getProfesoresLibres()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ProfesoresLibres();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getAulasDisponibles <em>Aulas Disponibles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aulas Disponibles</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model#getAulasDisponibles()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AulasDisponibles();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Model#getMateriasAbiertas <em>Materias Abiertas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias Abiertas</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Model#getMateriasAbiertas()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MateriasAbiertas();

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
   * Returns the meta object for the reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getMateriasADictar <em>Materias ADictar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Materias ADictar</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getMateriasADictar()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_MateriasADictar();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAsignacionesDiarias <em>Asignaciones Diarias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asignaciones Diarias</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Planificacion#getAsignacionesDiarias()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_AsignacionesDiarias();

  /**
   * Returns the meta object for class '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria <em>Asignacion Diaria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asignacion Diaria</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria
   * @generated
   */
  EClass getAsignacion_Diaria();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getDia()
   * @see #getAsignacion_Diaria()
   * @generated
   */
  EAttribute getAsignacion_Diaria_Dia();

  /**
   * Returns the meta object for the containment reference list '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getAsignacionesDeMaterias <em>Asignaciones De Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asignaciones De Materias</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria#getAsignacionesDeMaterias()
   * @see #getAsignacion_Diaria()
   * @generated
   */
  EReference getAsignacion_Diaria_AsignacionesDeMaterias();

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
   * Returns the meta object for the reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getProfesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Profesor</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getProfesor()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EReference getAsignacion_Materia_Profesor();

  /**
   * Returns the meta object for the reference '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aula</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAula()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EReference getAsignacion_Materia_Aula();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAlumnosInscriptos <em>Alumnos Inscriptos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alumnos Inscriptos</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia#getAlumnosInscriptos()
   * @see #getAsignacion_Materia()
   * @generated
   */
  EAttribute getAsignacion_Materia_AlumnosInscriptos();

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
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getCantidadHorasSemanales <em>Cantidad Horas Semanales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cantidad Horas Semanales</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getCantidadHorasSemanales()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_CantidadHorasSemanales();

  /**
   * Returns the meta object for the attribute '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getDiasSemanales <em>Dias Semanales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dias Semanales</em>'.
   * @see tp5.dslexterno.xtext.planificacionMaterias.Materia#getDiasSemanales()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_DiasSemanales();

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
     * The meta object literal for the '<em><b>Profesores Libres</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROFESORES_LIBRES = eINSTANCE.getModel_ProfesoresLibres();

    /**
     * The meta object literal for the '<em><b>Aulas Disponibles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AULAS_DISPONIBLES = eINSTANCE.getModel_AulasDisponibles();

    /**
     * The meta object literal for the '<em><b>Materias Abiertas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MATERIAS_ABIERTAS = eINSTANCE.getModel_MateriasAbiertas();

    /**
     * The meta object literal for the '<em><b>Planificacion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANIFICACION = eINSTANCE.getModel_Planificacion();

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
     * The meta object literal for the '<em><b>Materias ADictar</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__MATERIAS_ADICTAR = eINSTANCE.getPlanificacion_MateriasADictar();

    /**
     * The meta object literal for the '<em><b>Asignaciones Diarias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__ASIGNACIONES_DIARIAS = eINSTANCE.getPlanificacion_AsignacionesDiarias();

    /**
     * The meta object literal for the '{@link tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_DiariaImpl <em>Asignacion Diaria</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.Asignacion_DiariaImpl
     * @see tp5.dslexterno.xtext.planificacionMaterias.impl.PlanificacionMateriasPackageImpl#getAsignacion_Diaria()
     * @generated
     */
    EClass ASIGNACION_DIARIA = eINSTANCE.getAsignacion_Diaria();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION_DIARIA__DIA = eINSTANCE.getAsignacion_Diaria_Dia();

    /**
     * The meta object literal for the '<em><b>Asignaciones De Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION_DIARIA__ASIGNACIONES_DE_MATERIAS = eINSTANCE.getAsignacion_Diaria_AsignacionesDeMaterias();

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
     * The meta object literal for the '<em><b>Profesor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION_MATERIA__PROFESOR = eINSTANCE.getAsignacion_Materia_Profesor();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION_MATERIA__AULA = eINSTANCE.getAsignacion_Materia_Aula();

    /**
     * The meta object literal for the '<em><b>Alumnos Inscriptos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION_MATERIA__ALUMNOS_INSCRIPTOS = eINSTANCE.getAsignacion_Materia_AlumnosInscriptos();

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
     * The meta object literal for the '<em><b>Cantidad Horas Semanales</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__CANTIDAD_HORAS_SEMANALES = eINSTANCE.getMateria_CantidadHorasSemanales();

    /**
     * The meta object literal for the '<em><b>Dias Semanales</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__DIAS_SEMANALES = eINSTANCE.getMateria_DiasSemanales();

    /**
     * The meta object literal for the '<em><b>Requerimientos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__REQUERIMIENTOS = eINSTANCE.getMateria_Requerimientos();

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
