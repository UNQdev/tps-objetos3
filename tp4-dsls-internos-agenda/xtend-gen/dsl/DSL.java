package dsl;

import dominio.Agenda;
import dominio.Evento;
import dominio.Horario;
import dominio.Notificador;
import dominio.Recordatorio;
import dominio.RecordatorioEmail;
import dominio.RecordatorioSMS;
import dominio.RecordatorioTelefonico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DSL {
  public Notificador crearListener() {
    return new Notificador();
  }
  
  public Agenda agenda(final Evento... eventos) {
    List<Evento> _list = IterableExtensions.<Evento>toList(((Iterable<Evento>)Conversions.doWrapArray(eventos)));
    return new Agenda(_list);
  }
  
  public Evento operator_minus(final Horario horario, final String nombreEvento) {
    return new Evento(horario, nombreEvento);
  }
  
  public Evento recordar(final Evento evento) {
    return evento;
  }
  
  protected Horario _h(final int hora) {
    return new Horario(hora);
  }
  
  protected Horario _h(final Pair<Integer, Integer> horasYminutos) {
    Integer _key = horasYminutos.getKey();
    Integer _value = horasYminutos.getValue();
    return new Horario((_key).intValue(), (_value).intValue());
  }
  
  public Pair<Integer, Integer> operator_elvis(final int horas, final int minutos) {
    return Pair.<Integer, Integer>of(Integer.valueOf(horas), Integer.valueOf(minutos));
  }
  
  public void operator_greaterThan(final Evento evento, final Recordatorio recordatorio) {
    evento.agregarRecordatorio(recordatorio);
  }
  
  public RecordatorioEmail viaEmail(final String asuntoRecordatorio) {
    return new RecordatorioEmail(asuntoRecordatorio);
  }
  
  public RecordatorioSMS viaSMS(final String asuntoRecordatorio) {
    return new RecordatorioSMS(asuntoRecordatorio);
  }
  
  public RecordatorioTelefonico viaTelefonico(final String asuntoRecordatorio) {
    return new RecordatorioTelefonico(asuntoRecordatorio);
  }
  
  public List<Horario> operator_upTo(final Horario hAnterior, final Horario hPosterior) {
    ArrayList<Horario> _xblockexpression = null;
    {
      ArrayList<Horario> listaDeHorarios = new ArrayList<Horario>();
      Horario ultimoHorario = hAnterior;
      boolean _esPosteriorA = ultimoHorario.esPosteriorA(hPosterior);
      boolean _not = (!_esPosteriorA);
      boolean _while = _not;
      while (_while) {
        {
          listaDeHorarios.add(ultimoHorario);
          Horario _masCincoMinutos = Horario.masCincoMinutos(ultimoHorario);
          ultimoHorario = _masCincoMinutos;
        }
        boolean _esPosteriorA_1 = ultimoHorario.esPosteriorA(hPosterior);
        boolean _not_1 = (!_esPosteriorA_1);
        _while = _not_1;
      }
      _xblockexpression = listaDeHorarios;
    }
    return _xblockexpression;
  }
  
  public void run() {
    Horario _h = this.h(Integer.valueOf(14));
    Evento _minus = this.operator_minus(_h, "Inicia Objetos 3");
    Horario _h_1 = this.h(Integer.valueOf(18));
    Evento _minus_1 = this.operator_minus(_h_1, "Fin objetos3");
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DSL.this.recordar(it);
        RecordatorioEmail _viaEmail = DSL.this.viaEmail("Escribir Bitacora");
        final Procedure1<RecordatorioEmail> _function = new Procedure1<RecordatorioEmail>() {
          public void apply(final RecordatorioEmail it) {
            it.setRemitente("profesor@mail.com");
          }
        };
        RecordatorioEmail _doubleArrow = ObjectExtensions.<RecordatorioEmail>operator_doubleArrow(_viaEmail, _function);
        DSL.this.operator_greaterThan(_recordar, _doubleArrow);
      }
    };
    Evento _doubleArrow = ObjectExtensions.<Evento>operator_doubleArrow(_minus_1, _function);
    Pair<Integer, Integer> _elvis = this.operator_elvis(19, 35);
    Horario _h_2 = this.h(_elvis);
    Evento _minus_2 = this.operator_minus(_h_2, "Llegada a casa");
    final Procedure1<Evento> _function_1 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DSL.this.recordar(it);
        RecordatorioSMS _viaSMS = DSL.this.viaSMS("Enviar enunciado de TP");
        DSL.this.operator_greaterThan(_recordar, _viaSMS);
      }
    };
    Evento _doubleArrow_1 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_2, _function_1);
    Pair<Integer, Integer> _elvis_1 = this.operator_elvis(21, 40);
    Horario _h_3 = this.h(_elvis_1);
    Evento _minus_3 = this.operator_minus(_h_3, "Cena");
    final Procedure1<Evento> _function_2 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DSL.this.recordar(it);
        RecordatorioTelefonico _viaTelefonico = DSL.this.viaTelefonico("Lavarse Las Manos");
        final Procedure1<RecordatorioTelefonico> _function = new Procedure1<RecordatorioTelefonico>() {
          public void apply(final RecordatorioTelefonico it) {
            it.setNumeroDestino("15-265-3598");
          }
        };
        RecordatorioTelefonico _doubleArrow = ObjectExtensions.<RecordatorioTelefonico>operator_doubleArrow(_viaTelefonico, _function);
        DSL.this.operator_greaterThan(_recordar, _doubleArrow);
        Evento _recordar_1 = DSL.this.recordar(it);
        RecordatorioEmail _viaEmail = DSL.this.viaEmail("Poner la mesa");
        final Procedure1<RecordatorioEmail> _function_1 = new Procedure1<RecordatorioEmail>() {
          public void apply(final RecordatorioEmail it) {
            it.setRemitente("comida@mail.com");
            it.setAsunto("Para no olvidarme...");
          }
        };
        RecordatorioEmail _doubleArrow_1 = ObjectExtensions.<RecordatorioEmail>operator_doubleArrow(_viaEmail, _function_1);
        DSL.this.operator_greaterThan(_recordar_1, _doubleArrow_1);
      }
    };
    Evento _doubleArrow_2 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_3, _function_2);
    final Agenda agenda = this.agenda(_minus, _doubleArrow, _doubleArrow_1, _doubleArrow_2);
    final Notificador listenerDeTest = this.crearListener();
    Pair<Integer, Integer> _elvis_2 = this.operator_elvis(19, 25);
    Horario _h_4 = this.h(_elvis_2);
    Pair<Integer, Integer> _elvis_3 = this.operator_elvis(21, 50);
    Horario _h_5 = this.h(_elvis_3);
    List<Horario> _upTo = this.operator_upTo(_h_4, _h_5);
    final Procedure1<Horario> _function_3 = new Procedure1<Horario>() {
      public void apply(final Horario h) {
        agenda.tick(h, listenerDeTest);
      }
    };
    IterableExtensions.<Horario>forEach(_upTo, _function_3);
  }
  
  public static void main(final String[] args) {
    DSL _dSL = new DSL();
    _dSL.run();
  }
  
  public Horario h(final Object hora) {
    if (hora instanceof Integer) {
      return _h((Integer)hora);
    } else if (hora instanceof Pair) {
      return _h((Pair<Integer, Integer>)hora);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(hora).toString());
    }
  }
}
