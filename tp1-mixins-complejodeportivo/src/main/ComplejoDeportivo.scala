package main

import scala.collection.mutable.ArrayBuffer
import canchas._
import org.joda.time.DateTime
import excepciones.CanchaInexistenteException

class ComplejoDeportivo {
  var canchas : ArrayBuffer[Cancha] = new ArrayBuffer[Cancha] 
  
  def reservarCancha(numeroCancha : Int, dia:DateTime, horarioInicial : Int, horarioFinal : Int) = {
	canchas find (_.numero.equals(numeroCancha)) match {
	  case None => throw new CanchaInexistenteException()
	  case Some(cancha) => cancha.reservar(dia, horarioInicial)
	}
//  Test this way...
//  canchas.find(_.numero.equals(numeroCancha)).fold(throw new CanchaInexistenteException())(c => c.reservar(dia, horarioInicial, horarioFinal))
  }
  
  /*
   * REPORTES
   */
  //a) Obtener todas las canchas que tengan reservas para un día determinado.
  def canchasConReservaElDia(dia : DateTime) : ArrayBuffer[Cancha] = {
    canchas filter (_.reservas exists (_.dia.equals(dia)))
  }
  //b) Obtener todas reservas para un día determinado.
  def reservasDelDia(dia : DateTime) : ArrayBuffer[Reserva] = {
    this.canchasConReservaElDia(dia).map(_.reservas).fold(new ArrayBuffer[Reserva])((r, rs) => r ++ rs)
  }
  //c) Dado un día y horario, encontrar alguna cancha libre (una cancha cualquiera, no importa el deporte).
  def canchaLibreDiaYHorario(dia: DateTime, horario: Int) : Cancha = {
	//ESTO es CACA, pero no entiendo como negar el "noHayDispo.." en la llamada del find :(
    def libre(cancha:Cancha, reserva : Reserva) : Boolean = !cancha.noHayDisponibilidad(reserva)	
    
    canchas find (cancha => libre(cancha, new Reserva(dia, horario))) match {
	  case None => throw new CanchaInexistenteException()
	  case Some(cancha) => cancha
	}
  }
  //d) La cancha con más reservas.
  def canchaConMasReservas() : Cancha = {
	//TODO: NO TUVE CHANCES CON ESTA ¬¬
    new Paddle(99)
  }
  //e) La totalidad de la facturación del complejo (sumar los precios de todas las reservas para todas las canchas).
  def totalFacturacion() : Double = {
    canchas.map(_.reservas.costoDeReserva).foldLeft(0){(accumulado: Double, precio: Double) => accumulado + precio}
  }

}
