package traits

import canchas._
import org.joda.time.DateTime

trait ConTribuna extends Cancha {

  override def calcularPrecio(reserva: Reserva) = {
    if (esFinDeSemana(reserva)) 2 * super.precio else super.precio
  } 
  
  def esFinDeSemana(reserva : Reserva) : Boolean = {
	//reserva.dia corresponde al findesemana
    false
  }
  
}