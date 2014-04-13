package canchas

import org.joda.time.DateTime
import org.joda.time.Interval

class Reserva(var dia : DateTime, var horaInicial : Int, var horaFinal : Int) {

  var costoDeReserva : Double = 0
  
  def seSuperponeCon(reserva : Reserva) : Boolean = 
    (reserva.dia).equals(this.dia) && 
    (this.horaInicial <= reserva.horaInicial && reserva.horaInicial < this.horaFinal || 
      this.horaInicial < reserva.horaFinal && reserva.horaFinal < this.horaFinal)
  
}
