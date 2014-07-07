package tp5.dslexterno.xtext;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import tp5.dslexterno.xtext.PlanificacionMateriasStandaloneSetup;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Diaria;
import tp5.dslexterno.xtext.planificacionMaterias.Asignacion_Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Aula;
import tp5.dslexterno.xtext.planificacionMaterias.Dia;
import tp5.dslexterno.xtext.planificacionMaterias.Horario;
import tp5.dslexterno.xtext.planificacionMaterias.Materia;
import tp5.dslexterno.xtext.planificacionMaterias.Model;
import tp5.dslexterno.xtext.planificacionMaterias.Planificacion;
import tp5.dslexterno.xtext.planificacionMaterias.Profesor;
import tp5.dslexterno.xtext.planificacionMaterias.Rango_Horario;
import tp5.dslexterno.xtext.validation.PlanificacionMateriasValidator;

@SuppressWarnings("all")
public class PlanificacionMateriasInterpreter {
  @Extension
  private PlanificacionMateriasValidator dsl = new PlanificacionMateriasValidator();
  
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
        PlanificacionMateriasInterpreter.validate(injector, resource);
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
  
  public static void validate(final Injector injector, final Resource resource) {
    final IResourceValidator validator = injector.<IResourceValidator>getInstance(IResourceValidator.class);
    final List<Issue> issues = validator.validate(resource, CheckMode.ALL, null);
    boolean _isEmpty = issues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Procedure1<Issue> _function = new Procedure1<Issue>() {
        public void apply(final Issue it) {
          String _string = it.toString();
          InputOutput.<String>println(_string);
        }
      };
      IterableExtensions.<Issue>forEach(issues, _function);
      System.exit((-1));
    }
  }
  
  public String interpret(final Model model) {
    String _xblockexpression = null;
    {
      Planificacion planificacion = model.getPlanificacion();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Planificacion del año: ");
      int _anio = planificacion.getAnio();
      _builder.append(_anio, "");
      _builder.append(" semestre: ");
      int _semestre = planificacion.getSemestre();
      _builder.append(_semestre, "");
      _builder.append(":");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _aulaMasUtilizada = this.aulaMasUtilizada(planificacion);
      _builder.append(_aulaMasUtilizada, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      String _porcentajePorTurnoDeMateriasDictadas = this.porcentajePorTurnoDeMateriasDictadas(planificacion);
      _builder.append(_porcentajePorTurnoDeMateriasDictadas, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      EList<Profesor> _profesoresLibres = model.getProfesoresLibres();
      String _materiasDictadasPorCadaProfesor = this.materiasDictadasPorCadaProfesor(planificacion, _profesoresLibres);
      _builder.append(_materiasDictadasPorCadaProfesor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Horarios Libres: ");
      _builder.newLine();
      _builder.append("\t");
      String _horariosEnLosQueNoSeDictanMaterias = this.horariosEnLosQueNoSeDictanMaterias(planificacion);
      _builder.append(_horariosEnLosQueNoSeDictanMaterias, "\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = InputOutput.<String>println(_builder.toString());
    }
    return _xblockexpression;
  }
  
  /**
   * AULA MAS UTILIZADA
   */
  public CharSequence aulaMasUtilizada(final Planificacion planificacion) {
    CharSequence _xblockexpression = null;
    {
      EList<Asignacion_Materia> _asignacionesDeMaterias = planificacion.getAsignacionesDeMaterias();
      final Function1<Asignacion_Materia, Integer> _function = new Function1<Asignacion_Materia, Integer>() {
        public Integer apply(final Asignacion_Materia it) {
          return Integer.valueOf(PlanificacionMateriasInterpreter.this.dsl.horasAsignadas(it));
        }
      };
      List<Asignacion_Materia> asignacionesOrdenadasPorCantHoras = IterableExtensions.<Asignacion_Materia, Integer>sortBy(_asignacionesDeMaterias, _function);
      Asignacion_Materia _last = IterableExtensions.<Asignacion_Materia>last(asignacionesOrdenadasPorCantHoras);
      Aula _aula = _last.getAula();
      String aulaMasUtilizada = _aula.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Aula mas utilizada: ");
      _builder.append(aulaMasUtilizada, "");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * HORARIOS SIN MATERIAS ASIGNADAS
   */
  public String horariosEnLosQueNoSeDictanMaterias(final Planificacion planificacion) {
    String _xblockexpression = null;
    {
      EList<Asignacion_Materia> _asignacionesDeMaterias = planificacion.getAsignacionesDeMaterias();
      final Function1<Asignacion_Materia, EList<Asignacion_Diaria>> _function = new Function1<Asignacion_Materia, EList<Asignacion_Diaria>>() {
        public EList<Asignacion_Diaria> apply(final Asignacion_Materia it) {
          return it.getAsignacionesDiarias();
        }
      };
      List<EList<Asignacion_Diaria>> _map = ListExtensions.<Asignacion_Materia, EList<Asignacion_Diaria>>map(_asignacionesDeMaterias, _function);
      Iterable<Asignacion_Diaria> _flatten = Iterables.<Asignacion_Diaria>concat(_map);
      final List<Asignacion_Diaria> horariosOcupados = IterableExtensions.<Asignacion_Diaria>toList(_flatten);
      final StringBuffer buffer = new StringBuffer();
      Dia[] _values = Dia.values();
      final Procedure1<Dia> _function_1 = new Procedure1<Dia>() {
        public void apply(final Dia d) {
          final Function1<Asignacion_Diaria, Boolean> _function = new Function1<Asignacion_Diaria, Boolean>() {
            public Boolean apply(final Asignacion_Diaria it) {
              Dia _dia = it.getDia();
              return Boolean.valueOf(Objects.equal(_dia, d));
            }
          };
          Iterable<Asignacion_Diaria> _filter = IterableExtensions.<Asignacion_Diaria>filter(horariosOcupados, _function);
          List<Asignacion_Diaria> horariosDelDia = IterableExtensions.<Asignacion_Diaria>toList(_filter);
          ArrayList<Integer> horariosLibres = PlanificacionMateriasInterpreter.this.calcularHorariosLibres(horariosDelDia);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(d, "");
          _builder.append(": ");
          String _rangosHorario = PlanificacionMateriasInterpreter.this.rangosHorario(horariosLibres);
          _builder.append(_rangosHorario, "");
          _builder.newLineIfNotEmpty();
          buffer.append(_builder);
        }
      };
      IterableExtensions.<Dia>forEach(((Iterable<Dia>)Conversions.doWrapArray(_values)), _function_1);
      _xblockexpression = buffer.toString();
    }
    return _xblockexpression;
  }
  
  public ArrayList<Integer> calcularHorariosLibres(final List<Asignacion_Diaria> horariosOcupados) {
    ArrayList<Integer> _xblockexpression = null;
    {
      final ArrayList<Integer> horariosLibres = new ArrayList<Integer>();
      IntegerRange _upTo = new IntegerRange(8, 22);
      final Procedure1<Integer> _function = new Procedure1<Integer>() {
        public void apply(final Integer i) {
          final Function1<Asignacion_Diaria, Boolean> _function = new Function1<Asignacion_Diaria, Boolean>() {
            public Boolean apply(final Asignacion_Diaria it) {
              Rango_Horario _rangoHorario = it.getRangoHorario();
              return Boolean.valueOf(PlanificacionMateriasInterpreter.this.incluyeAlRango(_rangoHorario, (i).intValue(), ((i).intValue() + 1)));
            }
          };
          boolean _exists = IterableExtensions.<Asignacion_Diaria>exists(horariosOcupados, _function);
          boolean _not = (!_exists);
          if (_not) {
            horariosLibres.add(i);
          }
        }
      };
      IterableExtensions.<Integer>forEach(_upTo, _function);
      _xblockexpression = horariosLibres;
    }
    return _xblockexpression;
  }
  
  public String rangosHorario(final List<Integer> horarios) {
    String _xblockexpression = null;
    {
      final StringBuffer buffer = new StringBuffer();
      final Iterable<Integer> lista2 = IterableExtensions.<Integer>tail(horarios);
      int _size = IterableExtensions.size(lista2);
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      final Procedure1<Integer> _function = new Procedure1<Integer>() {
        public void apply(final Integer i) {
          Integer _get = horarios.get((i).intValue());
          int _plus = ((_get).intValue() + 1);
          Integer _get_1 = ((Integer[])Conversions.unwrapArray(lista2, Integer.class))[(i).intValue()];
          boolean _equals = (_plus == (_get_1).intValue());
          if (_equals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(" ");
            _builder.append("de ");
            Integer _get_2 = horarios.get((i).intValue());
            _builder.append(_get_2, " ");
            _builder.append(" a ");
            Integer _get_3 = ((Integer[])Conversions.unwrapArray(lista2, Integer.class))[(i).intValue()];
            _builder.append(_get_3, " ");
            _builder.newLineIfNotEmpty();
            buffer.append(_builder);
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(" ");
            _builder_1.append("de ");
            Integer _get_4 = horarios.get((i).intValue());
            _builder_1.append(_get_4, " ");
            _builder_1.append(" a ");
            Integer _get_5 = horarios.get((i).intValue());
            int _plus_1 = ((_get_5).intValue() + 1);
            _builder_1.append(_plus_1, " ");
            _builder_1.newLineIfNotEmpty();
            buffer.append(_builder_1);
          }
        }
      };
      IterableExtensions.<Integer>forEach(_upTo, _function);
      _xblockexpression = buffer.toString();
    }
    return _xblockexpression;
  }
  
  public boolean incluyeAlRango(final Rango_Horario horario, final int horaInicioRango, final int horaFinRango) {
    boolean _and = false;
    Horario _horaInicio = horario.getHoraInicio();
    int _hora = _horaInicio.getHora();
    boolean _lessEqualsThan = (_hora <= horaInicioRango);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      Horario _horaFinal = horario.getHoraFinal();
      int _hora_1 = _horaFinal.getHora();
      boolean _greaterEqualsThan = (_hora_1 >= horaFinRango);
      _and = _greaterEqualsThan;
    }
    return _and;
  }
  
  /**
   * PROCENTAJE DE MATERIAS DICTADAS POR TURNO
   * 
   * Turno Mañana: 08:00 a 13:00
   * Turno Tarde: 13:00 a 18:00
   * Turno Noche: 18:00 a 22:00
   */
  public String porcentajePorTurnoDeMateriasDictadas(final Planificacion planificacion) {
    String _xblockexpression = null;
    {
      EList<Asignacion_Materia> asignaciones = planificacion.getAsignacionesDeMaterias();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Porcentaje de materias dictadas");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a la mañana: ");
      int _asignacionesPorTurno = this.asignacionesPorTurno(asignaciones, 8, 13);
      _builder.append(_asignacionesPorTurno, "\t\t\t");
      _builder.append("%,");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("a la tarde: ");
      int _asignacionesPorTurno_1 = this.asignacionesPorTurno(asignaciones, 13, 18);
      _builder.append(_asignacionesPorTurno_1, "\t\t\t");
      _builder.append("%,");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("a la noche: ");
      int _asignacionesPorTurno_2 = this.asignacionesPorTurno(asignaciones, 18, 22);
      _builder.append(_asignacionesPorTurno_2, "\t\t\t");
      _builder.append("%");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public int asignacionesPorTurno(final EList<Asignacion_Materia> asignaciones, final int inicioTurno, final int finTurno) {
    int _xblockexpression = (int) 0;
    {
      final Function1<Asignacion_Materia, Boolean> _function = new Function1<Asignacion_Materia, Boolean>() {
        public Boolean apply(final Asignacion_Materia it) {
          EList<Asignacion_Diaria> _asignacionesDiarias = it.getAsignacionesDiarias();
          return Boolean.valueOf(PlanificacionMateriasInterpreter.this.pertenecenAlTurno(_asignacionesDiarias, inicioTurno, finTurno));
        }
      };
      Iterable<Asignacion_Materia> asignacionesTurno = IterableExtensions.<Asignacion_Materia>filter(asignaciones, _function);
      int _size = IterableExtensions.size(asignacionesTurno);
      int _multiply = (_size * 100);
      int _size_1 = asignaciones.size();
      _xblockexpression = (_multiply / _size_1);
    }
    return _xblockexpression;
  }
  
  public boolean pertenecenAlTurno(final EList<Asignacion_Diaria> asignacionesDiarias, final int inicioTurno, final int finTurno) {
    final Function1<Asignacion_Diaria, Boolean> _function = new Function1<Asignacion_Diaria, Boolean>() {
      public Boolean apply(final Asignacion_Diaria it) {
        boolean _or = false;
        Rango_Horario _rangoHorario = it.getRangoHorario();
        boolean _esTurno = PlanificacionMateriasInterpreter.this.esTurno(_rangoHorario, inicioTurno, finTurno);
        if (_esTurno) {
          _or = true;
        } else {
          Rango_Horario _rangoHorario_1 = it.getRangoHorario();
          boolean _incluyeTurno = PlanificacionMateriasInterpreter.this.incluyeTurno(_rangoHorario_1, inicioTurno, finTurno);
          _or = _incluyeTurno;
        }
        return Boolean.valueOf(_or);
      }
    };
    return IterableExtensions.<Asignacion_Diaria>exists(asignacionesDiarias, _function);
  }
  
  public boolean esTurno(final Rango_Horario horario, final int horaInicio, final int horaFin) {
    boolean _and = false;
    Horario _horaInicio = horario.getHoraInicio();
    int _hora = _horaInicio.getHora();
    boolean _lessEqualsThan = (horaInicio <= _hora);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      Horario _horaFinal = horario.getHoraFinal();
      int _hora_1 = _horaFinal.getHora();
      boolean _lessEqualsThan_1 = (_hora_1 <= horaFin);
      _and = _lessEqualsThan_1;
    }
    return _and;
  }
  
  public boolean incluyeTurno(final Rango_Horario horario, final int horaInicioTurno, final int horaFinTurno) {
    boolean _and = false;
    Horario _horaInicio = horario.getHoraInicio();
    int _hora = _horaInicio.getHora();
    boolean _lessEqualsThan = (_hora <= horaInicioTurno);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      Horario _horaFinal = horario.getHoraFinal();
      int _hora_1 = _horaFinal.getHora();
      boolean _lessEqualsThan_1 = (horaFinTurno <= _hora_1);
      _and = _lessEqualsThan_1;
    }
    return _and;
  }
  
  /**
   * LISTADO DE PROFESORES CON LAS MATERIAS QUE ESTA DICTANDO
   */
  public String materiasDictadasPorCadaProfesor(final Planificacion planificacion, final EList<Profesor> profesores) {
    String _xblockexpression = null;
    {
      final StringBuilder listaResultadoDeProfesoresConSusMaterias = new StringBuilder();
      final EList<Asignacion_Materia> asignacionesDeMaterias = planificacion.getAsignacionesDeMaterias();
      final Procedure1<Profesor> _function = new Procedure1<Profesor>() {
        public void apply(final Profesor it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("El profesor ");
          String _name = it.getName();
          _builder.append(_name, "");
          _builder.append(" dicta: ");
          CharSequence _materiasDictadasPor = PlanificacionMateriasInterpreter.this.materiasDictadasPor(it, asignacionesDeMaterias);
          _builder.append(_materiasDictadasPor, "");
          _builder.newLineIfNotEmpty();
          String materiasPorProfesor = _builder.toString();
          listaResultadoDeProfesoresConSusMaterias.append(materiasPorProfesor);
        }
      };
      IterableExtensions.<Profesor>forEach(profesores, _function);
      _xblockexpression = listaResultadoDeProfesoresConSusMaterias.toString();
    }
    return _xblockexpression;
  }
  
  public CharSequence materiasDictadasPor(final Profesor profesor0, final EList<Asignacion_Materia> asignacionesDeMaterias) {
    CharSequence _xblockexpression = null;
    {
      final Function1<Asignacion_Materia, Boolean> _function = new Function1<Asignacion_Materia, Boolean>() {
        public Boolean apply(final Asignacion_Materia it) {
          Profesor _profesor = it.getProfesor();
          return Boolean.valueOf(Objects.equal(_profesor, profesor0));
        }
      };
      Iterable<Asignacion_Materia> _filter = IterableExtensions.<Asignacion_Materia>filter(asignacionesDeMaterias, _function);
      final Function1<Asignacion_Materia, String> _function_1 = new Function1<Asignacion_Materia, String>() {
        public String apply(final Asignacion_Materia it) {
          Materia _materia = it.getMateria();
          return _materia.getName();
        }
      };
      Iterable<String> _map = IterableExtensions.<Asignacion_Materia, String>map(_filter, _function_1);
      List<String> listaDeMaterias = IterableExtensions.<String>toList(_map);
      CharSequence _xifexpression = null;
      boolean _isEmpty = listaDeMaterias.isEmpty();
      if (_isEmpty) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("ninguna materia este semestre");
        _xifexpression = _builder;
      } else {
        _xifexpression = listaDeMaterias.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
