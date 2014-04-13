package main

import scala.collection.mutable.ArrayBuffer
import canchas.{Cancha, Reserva}
import org.joda.time.DateTime
import excepciones.CanchaInexistenteException

class ComplejoDeportivo {
  var canchas : ArrayBuffer[Cancha] = new ArrayBuffer[Cancha] 
  
  def reservarCancha(numeroCancha : Int, dia:DateTime, horarioInicial : Int, horarioFinal : Int) = {
	canchas find (_.numero.equals(numeroCancha)) match {
	  case None => throw new CanchaInexistenteException()
	  case Some(cancha) => cancha.reservar(dia, horarioInicial, horarioFinal)
	}
  }

  def canchasConReservaElDia(dia : DateTime) : ArrayBuffer[Cancha] = {
    canchas filter (! _.reservasDelDia(dia).isEmpty)
  }
  
  def reservasDelDia(dia : DateTime) : ArrayBuffer[Reserva] = {
    canchas.map(_.reservasDelDia(dia)).flatten
  }
  
  def canchaLibreDiaYHorario(dia: DateTime, horario: Int) : Option[Cancha] = {	
    canchas find (_.estaLibre(dia, horario))
  }
  
  def canchaConMasReservas() : Cancha = {
	canchas.sortWith((c1, c2) => c1.cantidadReservas > c2.cantidadReservas).head
  }
  
  def totalDeFacturacion() : Double = {
    canchas.map(_.totalDeFacturacion()).sum
  }

}


