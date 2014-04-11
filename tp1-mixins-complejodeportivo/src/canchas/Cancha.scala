package canchas

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime
import excepciones._

abstract class Cancha(var numero : Int) {
  var reservas : ArrayBuffer[Reserva] = new ArrayBuffer[Reserva]()
  
  def horarioCierre = 18
  
  def precio() : Double
  
  def calcularPrecio(reserva: Reserva) = precio
  
  def reservar(dia : DateTime, horarioInicial : Int) = { 
	var reservaTentativa = new Reserva(dia, horarioInicial) 
    if (noHayDisponibilidad(reservaTentativa)) {
      throw new SinDisponibilidadException()
    }
	if (excedeElHorario(reservaTentativa)) {
	  throw new CanchaSinLuzException()
	}
	reservaTentativa.costoDeReserva = calcularPrecio(reservaTentativa)
	reservas += reservaTentativa
  }
  
  def noHayDisponibilidad(reserva : Reserva) : Boolean = {
	this.reservas exists (_.esIgualA(reserva))
  }
  
  def excedeElHorario(reserva : Reserva) : Boolean = {
    reserva.hora > horarioCierre
  }
  
  def cantidadReservas() : Int = {
    this.reservas.length
  }
  
  //REPORTES
  def reportarReservas() : ArrayBuffer[Reserva] = {
    
    new ArrayBuffer[Reserva]()
  }
      
}
