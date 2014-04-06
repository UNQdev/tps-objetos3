package traits

import canchas.Cancha
import org.joda.time.DateTime

trait ConLuz extends Cancha {
  
  def esDeNoche(hora : Int) : Boolean = {
    hora > 19
  } 
  
  abstract override def precio() = 0.2 * super.precio
  
  override def reservar(dia : DateTime, horarioInicial : Int, horarioFinal : Int) {
    if (esDeNoche(horarioInicial)){
      super.nuevaReserva(dia, horarioInicial, horarioFinal)
    }
    
  }

}