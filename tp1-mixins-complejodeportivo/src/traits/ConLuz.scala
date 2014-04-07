package traits

import canchas._
import org.joda.time.DateTime

trait ConLuz extends Cancha {
  
  override def calcularPrecio(reserva : Reserva) = 
    if (esDeNoche(reserva.horaInicial)) 0.2 * super.precio else super.precio
  
  override def horarioCierre = 22 
  
  def esDeNoche(hora : Int) : Boolean = hora > 18 
}