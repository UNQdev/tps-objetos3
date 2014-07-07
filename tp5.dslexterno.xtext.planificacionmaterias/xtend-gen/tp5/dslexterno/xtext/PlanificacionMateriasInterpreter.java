package tp5.dslexterno.xtext;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import tp5.dslexterno.xtext.PlanificacionMateriasStandaloneSetup;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;

@SuppressWarnings("all")
public class PlanificacionMateriasInterpreter {
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      throw new RuntimeException("El interprete necesita la ruta completa a un archivo .pmdsl como argumento");
    }
    final String fileName = args[0];
    final Model model = PlanificacionMateriasInterpreter.parsear(fileName);
    PlanificacionMateriasInterpreter _planificacionMateriasInterpreter = new PlanificacionMateriasInterpreter();
    _planificacionMateriasInterpreter.interpret(model);
  }
  
  public static Model parsear(final String fileName) {
    try {
      Model _xblockexpression = null;
      {
        PlanificacionMateriasStandaloneSetup _planificacionMateriasStandaloneSetup = new PlanificacionMateriasStandaloneSetup();
        final Injector injector = _planificacionMateriasStandaloneSetup.createInjectorAndDoEMFRegistration();
        final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
        URI _createURI = URI.createURI(fileName);
        final Resource resource = resourceSet.createResource(_createURI);
        Map<Object, Object> _xsetliteral = null;
        Map<Object, Object> _tempMap = Maps.<Object, Object>newHashMap();
        _xsetliteral = Collections.<Object, Object>unmodifiableMap(_tempMap);
        resource.load(_xsetliteral);
        EList<EObject> _contents = resource.getContents();
        EObject _get = _contents.get(0);
        _xblockexpression = ((Model) _get);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void validate(final Injector injector, final javax.annotation.Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Resource to Resource");
  }
  
  public Object interpret(final Model model) {
    return null;
  }
  
  /**
   * AULA MAS UTILIZADA
   */
  public void aulaMasUtilizada(final Model modelo) {
    final EList<Aula> aulas = modelo.getAulasDisponibles();
    final Planificacion planificacion = modelo.getPlanificacion();
    EList<Asignacion_Materia> _asignacionesDeMaterias = planificacion.getAsignacionesDeMaterias();
    final Function1<Asignacion_Materia, Aula> _function = new Function1<Asignacion_Materia, Aula>() {
      public Aula apply(final Asignacion_Materia asignacionMateria) {
        return asignacionMateria.getAula();
      }
    };
    final List<Aula> aulasUtilizadas = ListExtensions.<Asignacion_Materia, Aula>map(_asignacionesDeMaterias, _function);
  }
  
  /**
   * HORARIOS SIN MATERIAS ASIGNADAS
   */
  public void horariosEnLosQueNoSeDictanMaterias(final Model modelo) {
    final Planificacion planificacion = modelo.getPlanificacion();
    EList<Asignacion_Materia> _asignacionesDeMaterias = planificacion.getAsignacionesDeMaterias();
    final List<Rango_Horario> horariosCubiertos = this.horariosCubiertos(_asignacionesDeMaterias);
  }
  
  public List<Rango_Horario> horariosCubiertos(final EList<Asignacion_Materia> asignaciones) {
    List<Rango_Horario> _xblockexpression = null;
    {
      final Function1<Asignacion_Materia, List<Rango_Horario>> _function = new Function1<Asignacion_Materia, List<Rango_Horario>>() {
        public List<Rango_Horario> apply(final Asignacion_Materia asignacionMateria) {
          EList<Asignacion_Diaria> _asignacionesDiarias = asignacionMateria.getAsignacionesDiarias();
          final Function1<Asignacion_Diaria, Rango_Horario> _function = new Function1<Asignacion_Diaria, Rango_Horario>() {
            public Rango_Horario apply(final Asignacion_Diaria asignacionDiaria) {
              return asignacionDiaria.getRangoHorario();
            }
          };
          return ListExtensions.<Asignacion_Diaria, Rango_Horario>map(_asignacionesDiarias, _function);
        }
      };
      List<List<Rango_Horario>> _map = ListExtensions.<Asignacion_Materia, List<Rango_Horario>>map(asignaciones, _function);
      Iterable<Rango_Horario> _flatten = Iterables.<Rango_Horario>concat(_map);
      List<Rango_Horario> horarios = IterableExtensions.<Rango_Horario>toList(_flatten);
      _xblockexpression = horarios;
    }
    return _xblockexpression;
  }
  
  /**
   * PROCENTAJE DE MATERIAS DICTADAS POR TURNO
   * 
   * Turno Mañana: 08:00 a 13:00
   * Turno Tarde: 13:00 a 18:00
   * Turno Noche: 18:00 a 22:00
   */
  public void porcentajePorTurnoDeMateriasDictadas(final Model modelo) {
  }
  
  /**
   * LISTADO DE PROFESORES CON LAS MATERIAS QUE ESTA DICTANDO
   */
  public void materiasDictadasPorCadaProfesor(final Model modelo) {
  }
}
