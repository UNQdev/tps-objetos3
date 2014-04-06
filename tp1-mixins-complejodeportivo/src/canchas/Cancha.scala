package canchas

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime

import excepciones.SinDisponibilidadException

abstract class Cancha {
  var reservas : ArrayBuffer[Reserva] = new ArrayBuffer[Reserva]()
  
  def precio() : Double
  
  def nuevaReserva(dia : DateTime, horarioInicial : Int, horarioFinal : Int) : Reserva = {
    if(horarioOcupado(dia, horarioInicial, horarioFinal)){
      throw new SinDisponibilidadException()
    }
    new Reserva(dia, horarioInicial, horarioFinal, this.precio)
  }
  
  def reservar(dia : DateTime, horarioInicial : Int, horarioFinal : Int) {
    this.reservas += this.nuevaReserva(dia, horarioInicial, horarioFinal)
  }
  
  def horarioOcupado(diaParaReservar : DateTime, horarioInicial : Int, horarioFinal : Int) = {
    reservas filter(_.dia.equals(diaParaReservar)) exists { reserva =>
      reserva.horaInicial < horarioInicial && horarioInicial < reserva.horaFinal || 
      reserva.horaInicial < horarioFinal && horarioFinal < reserva.horaFinal
    }
  }
      
}
