package canchas

import org.joda.time.DateTime
import org.joda.time.Interval

class Reserva(var dia : DateTime, var horaInicial : Int, var horaFinal : Int) {

  var costoDeReserva : Double = 0
  
  def seSuperponeCon(reserva : Reserva) : Boolean = 
    (reserva.dia).equals(this.dia) && 
    (reserva.horaInicial < this.horaInicial && this.horaInicial < reserva.horaFinal || 
      reserva.horaInicial < this.horaFinal && this.horaFinal < reserva.horaFinal)
  
}
