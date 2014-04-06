package canchas

class Futbol(var cantidadDeJugadores : Int) extends Cancha {

  def precio() : Int = 40 * this.cantidadDeJugadores
}

