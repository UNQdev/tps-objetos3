package traits

import canchas._

trait ConLuz extends Cancha {
  
  override def calcularPrecio(reserva : Reserva) = 
    if (esDeNoche(reserva.hora)) 0.2 * super.precio else super.precio
  
  override def horarioCierre = 22 
  
  def esDeNoche(hora : Int) : Boolean = hora > 18 
}