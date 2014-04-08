package canchas

class Futbol(numero : Int, var cantidadDeJugadores : Int) extends Cancha(numero) { 
  
  def precio() : Double = 40.5 * this.cantidadDeJugadores
}

