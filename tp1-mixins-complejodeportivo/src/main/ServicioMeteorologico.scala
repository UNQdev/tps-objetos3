package main

import scala.util.Random
import org.joda.time.DateTime 

class ServicioMeteorologico {
  def vaALlover(dia : DateTime) : Boolean = {
    new Random().nextBoolean
  }
}