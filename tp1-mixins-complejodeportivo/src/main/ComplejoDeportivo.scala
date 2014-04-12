package main

import scala.collection.mutable.ArrayBuffer
import canchas._
import org.joda.time.DateTime
import excepciones.CanchaInexistenteException
import traits.ConLuz
import traits.ConTecho
import traits.ConTribuna

class ComplejoDeportivo {
  var canchas : ArrayBuffer[Cancha] = new ArrayBuffer[Cancha] 
  
  def reservarCancha(numeroCancha : Int, dia:DateTime, horarioInicial : Int, horarioFinal : Int) = {
	canchas find (_.numero.equals(numeroCancha)) match {
	  case None => throw new CanchaInexistenteException()
	  case Some(cancha) => cancha.reservar(dia, horarioInicial, horarioFinal)
	}
  }
  
  /*
   * REPORTES
   */
  def canchasConReservaElDia(dia : DateTime) : ArrayBuffer[Cancha] = {
    canchas filter (_.reservas exists (_.dia.equals(dia)))
  }
  
  def reservasDelDia(dia : DateTime) : ArrayBuffer[Reserva] = {
    this.canchasConReservaElDia(dia).map(_.reservas).flatten
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

