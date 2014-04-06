package main

import scala.collection.mutable.ArrayBuffer
import canchas.Cancha
import org.joda.time.DateTime
import canchas.Reserva

class ComplejoDeportivo {
  var canchas : ArrayBuffer[Cancha] = new ArrayBuffer[Cancha] 
  
  def reservarCancha(numeroCancha : Int, dia:DateTime, horarioInicial : Int, horarioFinal : Int) = {
    
  }
  
  def canchasConReservaElDia(dia : DateTime) : ArrayBuffer[Cancha] = {
    canchas filter (_.reservas exists (_.dia.equals(dia)))
  }
  
  def reservasDelDia(dia : DateTime) : ArrayBuffer[Reserva] = {
    this.canchasConReservaElDia(dia).map(_.reservas).fold(new ArrayBuffer[Reserva])((r, rs) => r ++ rs)
  }

}