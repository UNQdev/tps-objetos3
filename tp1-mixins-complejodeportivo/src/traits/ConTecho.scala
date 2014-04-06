package traits

import main.ServicioMeteorologico
import org.joda.time.DateTime
import canchas.Cancha

trait ConTecho extends Cancha{
  
  val servicioMeteorologico = new ServicioMeteorologico
  
  def vaALlover(dia : DateTime) : Boolean = {
    this.servicioMeteorologico.vaALlover(dia)
  } 
  
  abstract override def precio() = 0.1 * super.precio
  
  override def reservar(dia : DateTime, horarioInicial : Int, horarioFinal : Int) {
    
    super.reservar(dia, horarioInicial, horarioFinal)
    
  }

}