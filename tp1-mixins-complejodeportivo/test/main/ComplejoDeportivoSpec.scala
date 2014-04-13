package main

import org.scalatest._
import org.joda.time.DateTime
import excepciones.CanchaInexistenteException
import canchas._

class ComplejoDeportivoSpec extends FlatSpec with Matchers {
  
   val complejoTest = new ComplejoDeportivo
   val canchaT = new Tenis(1)
   val canchaP = new Paddle(2)
   
   val reserva1 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 12, 14)
   val reserva2 = new Reserva(new DateTime(2014, 04, 16, 0, 0, 0), 15, 16)
   val reserva3 = new Reserva(new DateTime(2014, 04, 17, 0, 0, 0), 11, 13)
   val reserva4 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 8, 9)
   val reserva5 = new Reserva(new DateTime(2014, 04, 16, 0, 0, 0), 12, 13)
   val reserva6 = new Reserva(new DateTime(2014, 04, 17, 0, 0, 0), 10, 12)
   val reserva7 = new Reserva(new DateTime(2014, 04, 18, 0, 0, 0), 13, 14)

   canchaT.reservas += reserva1 += reserva2 += reserva3
   canchaP.reservas += reserva4 += reserva5 += reserva6 += reserva7
   complejoTest.canchas += canchaT += canchaP
  
  "El complejo deportivo" should "lanzar CanchaInexistenteException si el numero de cancha no pertenece a si lista" in {
    val complejoD = new ComplejoDeportivo 
    
    intercept[CanchaInexistenteException] {
    	complejoD.reservarCancha(1, new DateTime(2014, 04, 14, 0, 0, 0), 20, 21)
    }
  }
  
  it should "reservar la cancha que corresponde al numero seleccionado" in {
    val complejoD = new ComplejoDeportivo
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val canchaT = new Tenis(1)
    val canchaP = new Paddle(2)
    complejoD.canchas += canchaT += canchaP
    complejoD.reservarCancha(1, diaDeReserva, 8, 9)
    
    canchaT.reservas should have length 1  
  }
  
  it should "retornar una lista vacia si no hay canchas con reservas para esa fecha" in {
    complejoTest.canchasConReservaElDia(new DateTime(2014, 04, 14, 0, 0, 0)) should be ('empty)
  }
  
  it should "retornar una lista con la cancha que tiene reservas para esa fecha" in {
    val listaDeCanchas = complejoTest.canchasConReservaElDia(new DateTime(2014, 04, 18, 0, 0, 0))
    listaDeCanchas should contain (canchaP)
    listaDeCanchas should have length 1  
  }
  
  it should "retornar una lista vacia si no hay reservas para esa fecha" in {
    complejoTest.reservasDelDia(new DateTime(2014, 04, 14, 0, 0, 0)) should be ('empty)
  }
  
  it should "retornar una lista con las reservas para esa fecha pedida" in {
    val listaDeReservas = complejoTest.reservasDelDia(new DateTime(2014, 04, 15, 0, 0, 0))
    listaDeReservas should have length 2  
    listaDeReservas should contain (reserva1)
    listaDeReservas should contain (reserva4)
  }
  
  it should "retornar 'ninguna' cancha si todas estan ocupadas en esa fecha y horario" in {
    complejoTest.canchaLibreDiaYHorario(new DateTime(2014, 04, 17, 0, 0, 0), 11) should be (None)
  }
  
  it should "retornar la primer cancha desocupada en esa fecha y horario" in {
    complejoTest.canchaLibreDiaYHorario(new DateTime(2014, 04, 15, 0, 0, 0), 11) should be (Some(canchaT))
  }
  
  it should "retornar la cancha con mayor numero de reservas" in {
    complejoTest.canchaConMasReservas should equal (canchaP)
  }
  
   it should "retornar la suma de los costos de reserva de las reservas de todas las canchas" in {
    reserva1.costoDeReserva = 100
    reserva2.costoDeReserva = 100
    reserva3.costoDeReserva = 100
    reserva4.costoDeReserva = 100
    reserva5.costoDeReserva = 100
    reserva6.costoDeReserva = 100
    reserva7.costoDeReserva = 100

    assertResult(700){ complejoTest.totalDeFacturacion }
  }
  
}