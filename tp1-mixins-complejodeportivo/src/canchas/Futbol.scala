package canchas

import scala.collection.mutable.ArrayBuffer

class Futbol extends Cancha {
  var reservas : ArrayBuffer
  def precio(cantidad:Int){
    40*cantidad
  }
  
  def reservar(){}
}