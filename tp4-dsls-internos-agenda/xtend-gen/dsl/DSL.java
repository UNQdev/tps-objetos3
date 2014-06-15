package dsl;

import dominio.Agenda;
import dominio.AgendaListener;
import dominio.Evento;
import dominio.Notificador;
import dominio.Recordatorio;
import dominio.RecordatorioEmail;
import dominio.RecordatorioSMS;
import dominio.RecordatorioTelefonico;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DSL {
  public AgendaListener crearListener() {
    return new Notificador();
  }
  
  public Agenda agenda(final Evento... eventos) {
    List<Evento> _list = IterableExtensions.<Evento>toList(((Iterable<Evento>)Conversions.doWrapArray(eventos)));
    return new Agenda(_list);
  }
  
  public Evento operator_minus(final int horario, final String nombreEvento) {
    return new Evento(horario, nombreEvento);
  }
  
  public void recordar(final Evento evento, final Recordatorio recordatorio) {
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
  
  public void run() {
    Evento _minus = this.operator_minus(
      14, "Inicia Objetos 3");
    Evento _minus_1 = this.operator_minus(
      18, "Fin objetos3");
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        RecordatorioEmail _viaEmail = DSL.this.viaEmail("Escribir Bitacora");
        DSL.this.recordar(it, _viaEmail);
      }
    };
    Evento _doubleArrow = ObjectExtensions.<Evento>operator_doubleArrow(_minus_1, _function);
    Evento _minus_2 = this.operator_minus(
      19, "Llegada a casa");
    final Procedure1<Evento> _function_1 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        RecordatorioSMS _viaSMS = DSL.this.viaSMS("Enviar enunciado de TP");
        DSL.this.recordar(it, _viaSMS);
      }
    };
    Evento _doubleArrow_1 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_2, _function_1);
    Evento _minus_3 = this.operator_minus(
      21, "Cena");
    final Procedure1<Evento> _function_2 = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        RecordatorioTelefonico _viaTelefonico = DSL.this.viaTelefonico("Lavarse Las Manos");
        DSL.this.recordar(it, _viaTelefonico);
        RecordatorioEmail _viaEmail = DSL.this.viaEmail("Poner la mesa");
        DSL.this.recordar(it, _viaEmail);
      }
    };
    Evento _doubleArrow_2 = ObjectExtensions.<Evento>operator_doubleArrow(_minus_3, _function_2);
    final Agenda agenda = this.agenda(_minus, _doubleArrow, _doubleArrow_1, _doubleArrow_2);
    final AgendaListener listenerDeTest = this.crearListener();
    IntegerRange _upTo = new IntegerRange(13, 19);
    final Procedure1<Integer> _function_3 = new Procedure1<Integer>() {
      public void apply(final Integer h) {
        agenda.tick(h, listenerDeTest);
      }
    };
    IterableExtensions.<Integer>forEach(_upTo, _function_3);
  }
  
  public static void main(final String[] args) {
    DSL _dSL = new DSL();
    _dSL.run();
  }
}
