package traits

import main.ServicioMeteorologico
import org.joda.time.DateTime
import canchas._

trait ConTecho extends Cancha {
  
  val servicioMeteorologico = new ServicioMeteorologico
  
  def vaALlover(dia : DateTime) : Boolean = 
    this.servicioMeteorologico.vaALlover(dia)
  
  override def calcularPrecio(reserva : Reserva) =
    if (vaALlover(reserva.dia)) 1.1 * super.precio else super.precio
  
}