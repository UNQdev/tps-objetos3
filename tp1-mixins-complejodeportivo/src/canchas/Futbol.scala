package canchas

class Futbol(var cantidadDeJugadores : Int) extends Cancha {

  def precio() : Double = 40 * this.cantidadDeJugadores
}

