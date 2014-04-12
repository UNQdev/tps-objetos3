package canchas

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime
import excepciones._

abstract class Cancha(var numero : Int) {
  var reservas : ArrayBuffer[Reserva] = new ArrayBuffer[Reserva]()
  
  def horarioCierre = 18
  
  def precio() : Double
  
  def calcularPrecio(reserva: Reserva) = precio
  
  def reservar(dia : DateTime, horarioInicial : Int, horarioFinal : Int) = { 
	var reservaTentativa = new Reserva(dia, horarioInicial, horarioFinal) 
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
	this.reservas exists (_.seSuperponeCon(reserva))
  }
  
  def excedeElHorario(reserva : Reserva) : Boolean = {
    reserva.horaInicial > horarioCierre
  }
  
  def cantidadReservas() : Int = {
    this.reservas.length
  }
  
  def estaLibre(dia : DateTime, horario : Int) : Boolean = {
    this.reservas.find(! _.seSuperponeCon(new Reserva(dia, horario, 0))).fold(false){r => true}
  }
  
  def totalDeFacturacion() : Double = { this.reservas.map(_.costoDeReserva).sum }
      
}
