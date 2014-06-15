package dsl

import dominio.Evento
import dominio.Agenda
import dominio.AgendaListener
import dominio.Notificador
import dominio.RecordatorioEmail
import dominio.Recordatorio
import dominio.RecordatorioTelefonico
import dominio.RecordatorioSMS

class DSL {
	
	def AgendaListener crearListener(){
		new Notificador()
	}
	
	def Agenda agenda(Evento... eventos){
		new Agenda(eventos.toList)
	}
	
	def Evento operator_minus(int horario, String nombreEvento){
		new Evento(horario, nombreEvento)
	}
	
	def void recordar(Evento evento, Recordatorio recordatorio){
		evento.agregarRecordatorio(recordatorio);
	}
		
	// ------- Extension methods -------------
	
	def RecordatorioEmail viaEmail(String asuntoRecordatorio){
		new RecordatorioEmail(asuntoRecordatorio)
	}
	
	def RecordatorioSMS viaSMS(String asuntoRecordatorio){
		new RecordatorioSMS(asuntoRecordatorio)
	}
	
	def RecordatorioTelefonico viaTelefonico(String asuntoRecordatorio){
		new RecordatorioTelefonico(asuntoRecordatorio)
	}
	
	def run() {
		val agenda = agenda(
			14 - "Inicia Objetos 3",
			    18 - "Fin objetos3" => [
			        recordar("Escribir Bitacora".viaEmail)
				],
			    19 - "Llegada a casa" => [
					recordar("Enviar enunciado de TP".viaSMS)
				],
			    21 - "Cena" => [
					recordar("Lavarse Las Manos".viaTelefonico)
					recordar("Poner la mesa".viaEmail)
				]
			)
		val listenerDeTest = crearListener()
		(13 .. 19).forEach[ int h | agenda.tick(h, listenerDeTest)]
	}

	def static void main(String[] args) {
		new DSL().run();
	}
}
