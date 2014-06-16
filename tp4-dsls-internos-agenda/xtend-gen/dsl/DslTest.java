package dsl;

import dominio.Agenda;
import dominio.Evento;
import dominio.Horario;
import dominio.Notificador;
import dominio.Recordatorio;
import dominio.RecordatorioEmail;
import dominio.RecordatorioSMS;
import dominio.RecordatorioTelefonico;
import dsl.DSL;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DslTest {
  @Extension
  private DSL dsl = new DSL();
  
  private Agenda _agenda;
  
  public Agenda getAgenda() {
    return this._agenda;
  }
  
  public void setAgenda(final Agenda agenda) {
    this._agenda = agenda;
  }
  
  private Notificador _listenerDeTest;
  
  public Notificador getListenerDeTest() {
    return this._listenerDeTest;
  }
  
  public void setListenerDeTest(final Notificador listenerDeTest) {
    this._listenerDeTest = listenerDeTest;
  }
  
  @Before
  public void setUp() {
    Horario _h = this.dsl.h(Integer.valueOf(14));
    Evento _minus = this.dsl.operator_minus(_h, "Inicia Objetos 3");
    Horario _h_1 = this.dsl.h(Integer.valueOf(18));
    Evento _minus_1 = this.dsl.operator_minus(_h_1, "Fin objetos3");
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DslTest.this.dsl.recordar(it);
        RecordatorioEmail _viaEmail = DslTest.this.dsl.viaEmail("Escribir Bitacora");
        final Procedure1<RecordatorioEmail> _function = new Procedure1<RecordatorioEmail>() {
          public void apply(final RecordatorioEmail it) {
            it.setRemitente("profesor@mail.com");
          }
        };
        RecordatorioEmail _doubleArrow = ObjectExtensions.<RecordatorioEmail>operator_doubleArrow(_viaEmail, _function);
        DslTest.this.dsl.operator_greaterThan(_recordar, _doubleArrow);
      }
    };
    Evento _doubleArrow = ObjectExtensions.<Evento>operator_doubleArrow(_minus_1, _function);
    Pair<Integer, Integer> _elvis = this.dsl.operator_elvis(19, 35);
    Horario _h_2 = this.dsl.h(_elvis);
    Evento _minus_2 = this.dsl.operator_minus(_h_2, "Llegada a casa");
    final Procedure1<Evento> _function_1 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DslTest.this.dsl.recordar(it);
        RecordatorioSMS _viaSMS = DslTest.this.dsl.viaSMS("Enviar enunciado de TP");
        DslTest.this.dsl.operator_greaterThan(_recordar, _viaSMS);
      }
    };
    Evento _doubleArrow_1 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_2, _function_1);
    Pair<Integer, Integer> _elvis_1 = this.dsl.operator_elvis(21, 40);
    Horario _h_3 = this.dsl.h(_elvis_1);
    Evento _minus_3 = this.dsl.operator_minus(_h_3, "Cena");
    final Procedure1<Evento> _function_2 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _recordar = DslTest.this.dsl.recordar(it);
        RecordatorioTelefonico _viaTelefonico = DslTest.this.dsl.viaTelefonico("Lavarse Las Manos");
        final Procedure1<RecordatorioTelefonico> _function = new Procedure1<RecordatorioTelefonico>() {
          public void apply(final RecordatorioTelefonico it) {
            it.setNumeroDestino("15-265-3598");
          }
        };
        RecordatorioTelefonico _doubleArrow = ObjectExtensions.<RecordatorioTelefonico>operator_doubleArrow(_viaTelefonico, _function);
        DslTest.this.dsl.operator_greaterThan(_recordar, _doubleArrow);
        Evento _recordar_1 = DslTest.this.dsl.recordar(it);
        RecordatorioEmail _viaEmail = DslTest.this.dsl.viaEmail("Poner la mesa");
        final Procedure1<RecordatorioEmail> _function_1 = new Procedure1<RecordatorioEmail>() {
          public void apply(final RecordatorioEmail it) {
            it.setRemitente("comida@mail.com");
            it.setAsunto("Para no olvidarme...");
          }
        };
        RecordatorioEmail _doubleArrow_1 = ObjectExtensions.<RecordatorioEmail>operator_doubleArrow(_viaEmail, _function_1);
        DslTest.this.dsl.operator_greaterThan(_recordar_1, _doubleArrow_1);
      }
    };
    Evento _doubleArrow_2 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_3, _function_2);
    Agenda _agenda = this.dsl.agenda(_minus, _doubleArrow, _doubleArrow_1, _doubleArrow_2);
    this.setAgenda(_agenda);
    Notificador _crearListener = this.dsl.crearListener();
    this.setListenerDeTest(_crearListener);
  }
  
  @Test
  public void creacionDeInstacias() {
    Agenda _agenda = this.getAgenda();
    int _size = _agenda.eventos.size();
    Assert.assertEquals(_size, 4);
    Agenda _agenda_1 = this.getAgenda();
    Evento _get = _agenda_1.eventos.get(0);
    List<Recordatorio> _recordatorios = _get.getRecordatorios();
    int _size_1 = _recordatorios.size();
    Assert.assertEquals(_size_1, 0);
    Agenda _agenda_2 = this.getAgenda();
    Evento _get_1 = _agenda_2.eventos.get(1);
    List<Recordatorio> _recordatorios_1 = _get_1.getRecordatorios();
    int _size_2 = _recordatorios_1.size();
    Assert.assertEquals(_size_2, 1);
    Agenda _agenda_3 = this.getAgenda();
    Evento _get_2 = _agenda_3.eventos.get(3);
    List<Recordatorio> _recordatorios_2 = _get_2.getRecordatorios();
    int _size_3 = _recordatorios_2.size();
    Assert.assertEquals(_size_3, 2);
  }
  
  @Test
  public void agendaTicks() {
    final Notificador listenerDeTest2 = this.dsl.crearListener();
    Pair<Integer, Integer> _elvis = this.dsl.operator_elvis(19, 25);
    Horario _h = this.dsl.h(_elvis);
    Pair<Integer, Integer> _elvis_1 = this.dsl.operator_elvis(21, 50);
    Horario _h_1 = this.dsl.h(_elvis_1);
    List<Horario> _upTo = this.dsl.operator_upTo(_h, _h_1);
    final Procedure1<Horario> _function = new Procedure1<Horario>() {
      public void apply(final Horario h) {
        Agenda _agenda = DslTest.this.getAgenda();
        Notificador _listenerDeTest = DslTest.this.getListenerDeTest();
        _agenda.tick(h, _listenerDeTest);
      }
    };
    IterableExtensions.<Horario>forEach(_upTo, _function);
    Notificador _listenerDeTest = this.getListenerDeTest();
    List<Recordatorio> _logRecordatorios = _listenerDeTest.getLogRecordatorios();
    int _size = _logRecordatorios.size();
    Assert.assertEquals(_size, 3);
    Horario _h_2 = this.dsl.h(Integer.valueOf(18));
    Pair<Integer, Integer> _elvis_2 = this.dsl.operator_elvis(20, 05);
    Horario _h_3 = this.dsl.h(_elvis_2);
    List<Horario> _upTo_1 = this.dsl.operator_upTo(_h_2, _h_3);
    final Procedure1<Horario> _function_1 = new Procedure1<Horario>() {
      public void apply(final Horario h) {
        Agenda _agenda = DslTest.this.getAgenda();
        _agenda.tick(h, listenerDeTest2);
      }
    };
    IterableExtensions.<Horario>forEach(_upTo_1, _function_1);
    List<Recordatorio> _logRecordatorios_1 = listenerDeTest2.getLogRecordatorios();
    int _size_1 = _logRecordatorios_1.size();
    Assert.assertEquals(_size_1, 1);
  }
}
