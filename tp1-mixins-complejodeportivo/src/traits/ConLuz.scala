package main

import org.joda.time.Interval

trait ConLuz extends Cancha {
  var horarioNoche = new Interval(20, 07)
  override def reservar(horario:Interval) = if(esDeNoche(horario)){
    /*retorna el precio de noche*/
  } else { /*retorna el precio de dia*/ }
  def esDeNoche(horario:Interval) : Boolean = 
  def precio() = precio*1.20
}