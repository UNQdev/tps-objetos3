package traits

import canchas._

trait ConLuz extends Cancha {
  
  abstract override def precio() = super.precio
  
  override def calcularPrecio(reserva : Reserva) = 
    if (esDeNoche(reserva.horaInicial)) 0.2 * this.precio + this.precio else this.precio 
  
  override def horarioCierre = 22 
    
  def esDeNoche(hora : Int) : Boolean = hora > 18 
}