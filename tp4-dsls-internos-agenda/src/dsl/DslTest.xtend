package dsl

import org.junit.Test
import static org.junit.Assert.*
import org.junit.Before
import dominio.Agenda
import dominio.Notificador

class DslTest {
	extension DSL dsl = new DSL
	
	@Property Agenda agenda
	@Property Notificador listenerDeTest
	
	@Before def void setUp(){
		agenda = agenda(
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
		listenerDeTest = crearListener()
	}
	
	@Test def void creacionDeInstacias(){
		assertEquals(agenda.eventos.size, 4)
		assertEquals(agenda.eventos.get(0).recordatorios.size, 0)
		assertEquals(agenda.eventos.get(1).recordatorios.size, 1)
		assertEquals(agenda.eventos.get(3).recordatorios.size, 2)
	}
	
	@Test def void agendaTicks(){
		val listenerDeTest2 = crearListener()
		
		((19?:25).h .. (21?:50).h).forEach[ h | agenda.tick(h, listenerDeTest)]
		assertEquals(listenerDeTest.logRecordatorios.size, 3)
		
		(18.h .. (20?:05).h).forEach[ h | agenda.tick(h, listenerDeTest2)]
		assertEquals(listenerDeTest2.logRecordatorios.size, 1)
	}
}