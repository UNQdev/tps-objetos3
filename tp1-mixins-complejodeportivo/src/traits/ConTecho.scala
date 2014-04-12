package traits

import main.ServicioMeteorologico
import org.joda.time.DateTime
import canchas._

trait ConTecho extends Cancha {
  
  var servicioMeteorologico = new ServicioMeteorologico
  
  def vaALlover(dia : DateTime) : Boolean = 
    this.servicioMeteorologico.vaALlover(dia)
  
  abstract override def precio() = super.precio
  
  override def calcularPrecio(reserva : Reserva) =
    if (vaALlover(reserva.dia)) 0.1 * this.precio + this.precio else this.precio
  
}