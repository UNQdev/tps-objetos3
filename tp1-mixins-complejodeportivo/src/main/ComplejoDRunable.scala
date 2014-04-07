package main

import canchas._
import traits._

object ComplejoDRunable extends App {

   	var cancha1 = new Futbol(10) with ConLuz
  	var cancha2 = new Futbol(10) with SinLuz with ConTribuna
  	var cancha3 = new Tenis with ConTecho
  	var cancha4 = new Paddle with ConLuz

  
//  	var complejo = new ComplejoDeportivo()
//  	complejo.canchas += (cancha1, cancha2, cancha3, cancha4)
  	
  	println(cancha1.precio)
  	println(cancha2.precio)
  	println(cancha3.precio)
  	println(cancha4.precio) 
  
  
  
  
  
  
}