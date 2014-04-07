package canchas

import org.joda.time.DateTime
import org.joda.time.Interval

class Reserva(var dia : DateTime, var horaInicial : Int, var horaFinal : Int) {

  var costoDeReserva : Double
  
  def esIgualA(reserva : Reserva) : Boolean = 
    (reserva.dia).equals(this.dia) && (reserva.horaInicial.equals(this.horaInicial))
  
}
