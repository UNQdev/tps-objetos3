package dsl

import dominio.Evento
import dominio.Agenda
import dominio.Notificador
import dominio.RecordatorioEmail
import dominio.Recordatorio
import dominio.RecordatorioTelefonico
import dominio.RecordatorioSMS
import dominio.Horario
import java.util.List
import java.util.ArrayList

class DSL {
	
	def Notificador crearListener(){
		new Notificador()
	}
	
	def Agenda agenda(Evento... eventos){
		new Agenda(eventos.toList)
	}
	
	def Evento operator_minus(Horario horario, String nombreEvento){
		new Evento(horario, nombreEvento)
	}
	
	def Evento recordar(Evento evento){
		evento;
	}
	
	def void operator_greaterThan(Evento evento, Recordatorio recordatorio){
		evento.agregarRecordatorio(recordatorio);
	}
	
	// ------- Bonus 3) ----------------------
	def dispatch Horario h(int hora){
		new Horario(hora)
	}
	
	def dispatch Horario h(Pair<Integer, Integer> horasYminutos){
		new Horario(horasYminutos.key, horasYminutos.value)
	}
	
	def Pair<Integer, Integer> operator_elvis(int horas, int minutos){
		horas -> minutos
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
	
	def List<Horario> operator_upTo(Horario hAnterior, Horario hPosterior) {
		var listaDeHorarios = new ArrayList<Horario>()
		var ultimoHorario = hAnterior
		while(! ultimoHorario.esPosteriorA(hPosterior)){
			listaDeHorarios.add(ultimoHorario)
			ultimoHorario = Horario.masCincoMinutos(ultimoHorario);
		}
		listaDeHorarios
	}
	
	def run() {
		val agenda = agenda(
			
			14.h - "Inicia Objetos 3",
		    
		    18.h - "Fin objetos3" => [
		        recordar > "Escribir Bitacora".viaEmail => [
		        	remitente = "profesor@mail.com"
		        ]
			],
		    
		    (19?:35).h - "Llegada a casa" => [
				recordar > "Enviar enunciado de TP".viaSMS
			],
		    
		    (21?:40).h - "Cena" => [
				recordar > "Lavarse Las Manos".viaTelefonico => [
					numeroDestino = "15-265-3598"
				]
				recordar > "Poner la mesa".viaEmail => [
					remitente = "comida@mail.com"
					asunto = "Para no olvidarme..."
				]
			]
		)
		
		val listenerDeTest = crearListener()
		((19?:25).h .. (21?:50).h).forEach[ h | agenda.tick(h, listenerDeTest)]
	}

	def static void main(String[] args) {
		new DSL().run();
	}
}