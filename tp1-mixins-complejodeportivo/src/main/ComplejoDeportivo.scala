package main

import scala.collection.mutable.ArrayBuffer
import canchas._
import org.joda.time.DateTime

class ComplejoDeportivo {
  var canchas : ArrayBuffer[Cancha] = new ArrayBuffer[Cancha] 
  
  def reservarCancha(numeroCancha : Int, dia:DateTime, horarioInicial : Int, horarioFinal : Int) = {
	//buscar la cancha y luego:
    cancha.reservar(dia, horarioInicio, horarioFinal) 
  }
  
  
  
  //REPORTES
  /*
   * a) Obtener todas las canchas que tengan reservas para un día determinado.
   * b) Obtener todas reservas para un día determinado.
   * c) Dado un día y horario, encontrar alguna cancha libre (una cancha cualquiera, no importa el deporte).
   * d) La cancha con más reservas.
   * e) La totalidad de la facturación del complejo (sumar los precios de todas las reservas para todas las canchas).
   */
  
  def canchasConReservasElDia(dia: DateTime) : ArrayBuffer[Cancha] = {
    
    new ArrayBuffer[Cancha]()
  }
  
  def reservasDelDia(dia: DateTime) : ArrayBuffer[Reserva] = {
    
    new ArrayBuffer[Reserva]()
  }
   
  def canchaLibre(dia: DateTime, horario: Int) : Cancha = {
    
    new Paddle()
  }
  
  def canchaConMasReservas() : Cancha = {
    
    new Tenis()
  }
  
  def totalFacturacion() : Double = {
    
    2.10
  }
}
