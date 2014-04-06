package canchas

class Futbol(var cantidadDeJugadores : Int) extends Cancha {

  def precio() = 40 * this.cantidadDeJugadores
}

