package canchas

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime
import org.joda.time.Interval

abstract class Cancha {
  var reservas : ArrayBuffer[Reserva] = new ArrayBuffer[Reserva]()
  def reservar(dia:DateTime, horario:Interval) = hayDisponibilidad(dia, horario)  
  def hayDisponibilidad(dia:DateTime, horario:DateTime) = this.reservas += new Reserva(dia, horario)
      
}