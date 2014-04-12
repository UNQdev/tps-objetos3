package traits

import canchas._
import org.joda.time.DateTime

trait ConTribuna extends Cancha {

  abstract override def precio() = super.precio
  
  override def calcularPrecio(reserva: Reserva) = {
    if (esFinDeSemana(reserva)) 2 * this.precio else this.precio
  } 
  
  def esFinDeSemana(reserva : Reserva) : Boolean = {
	reserva.dia.getDayOfWeek == 6 || reserva.dia.getDayOfWeek == 7 
  }
  
}