package canchas

import org.scalatest._
import org.easymock.EasyMock
import org.scalatest.mock.EasyMockSugar
import org.joda.time.DateTime
import scala.collection.mutable.ArrayBuffer
import excepciones._
import traits._
import main.ServicioMeteorologico

class CanchaSpec extends FlatSpec with Matchers with EasyMockSugar{
  
  "Una cancha" should "tener disponibilidad si no tiene reservas" in {
    val cancha = new Paddle(1)
    val reserva = new Reserva(DateTime.now(), 0, 0)
    
    assert(! cancha.noHayDisponibilidad(reserva))
  }
  
  it should "estar disponible si ninguna de sus reservas se superpone con la nueva" in {
    val nuevaReserva = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 8, 10)
    val reserva1 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    assert(! cancha.noHayDisponibilidad(nuevaReserva))
  }
  
  it should "no estar disponible si alguna de sus reservas se superpone con la nueva" in {
    val nuevaReserva = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 11, 13)
    val reserva1 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    assert(cancha.noHayDisponibilidad(nuevaReserva))
  }
  
  it should "retornar falso si el horario de la reserva es anterior al horario de cierre" in {
    val cancha = new Paddle(1)
    val reserva = new Reserva(DateTime.now(), 15, 16)
    
    assert(! cancha.excedeElHorario(reserva))
  }
  
  it should "retornar verdadero si el horario de la reserva es posterior al horario de cierre" in {
    val cancha = new Paddle(1)
    val reserva = new Reserva(DateTime.now(), 20, 21)
    
    assert(cancha.excedeElHorario(reserva))
  }
  
  it should "retornar una lista vacia si no hay reservas para esa fecha" in {
    val cancha = new Paddle(1)
    cancha.reservasDelDia(new DateTime(2014, 04, 14, 0, 0, 0)) should be ('empty)
  }
  
  it should "retornar una lista con las reservas para esa fecha pedida" in {
    val reserva1 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val reserva3 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 11, 13)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2 += reserva3
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    val reservasDia = cancha.reservasDelDia(new DateTime(2014, 04, 15, 0, 0, 0))
    reservasDia should have length 2  
    reservasDia should contain (reserva2)
    reservasDia should contain (reserva3)
  }
  
  it should "devolver la cantidad de reservas" in {
    val reserva1 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val reserva3 = new Reserva(new DateTime(2014, 04, 16, 0, 0, 0), 11, 13)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2 += reserva3
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    assertResult(3){ cancha.cantidadReservas }
  }
  
  it should "estar libre si no tiene reservas" in {
    val cancha = new Paddle(1)
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    
    assert(cancha.estaLibre(diaDeReserva, 16))
  }
  
  it should "estar libre si no tiene reservas que se superpongan con la fecha y horario" in {
    val diaDeReserva = new DateTime(2014, 04, 15, 0, 0, 0)
    val reserva1 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val reserva3 = new Reserva(new DateTime(2014, 04, 16, 0, 0, 0), 11, 13)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2 += reserva3
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    assert(cancha.estaLibre(diaDeReserva, 16))
  }
  
  it should "no estar libre si tiene alguna reserva que se superponga con la fecha y horario" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val reserva1 = new Reserva(diaDeReserva, 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val reserva3 = new Reserva(new DateTime(2014, 04, 16, 0, 0, 0), 11, 13)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2 += reserva3
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    assert(! cancha.estaLibre(diaDeReserva, 12))
  }
  
  
  it should "agregar una reserva a la lista de reservas cuando la lista esta vacia" in {
    val cancha = new Paddle(1)
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    cancha.reservar(diaDeReserva, 8, 9)
    
    cancha.reservas should have length 1
  }
  
  it should "agregar una reserva a la lista de reservas si no se superpone con ninguna de las reservas" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val reserva1 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    cancha.reservar(diaDeReserva, 8, 9)
    
    cancha.reservas should have length 3
  }
  
  it should "lanzar SinDisponibilidadException si alguna de las reservas de la lista se superpone con la nueva" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val reserva1 = new Reserva(diaDeReserva, 12, 14)
    val reserva2 = new Reserva(new DateTime(2014, 04, 15, 0, 0, 0), 15, 16)
    val listaDeReservas = new ArrayBuffer[Reserva]() += reserva1 += reserva2
    val cancha = new Paddle(1)
    cancha.reservas = listaDeReservas
    
    intercept[SinDisponibilidadException] {
    	cancha.reservar(diaDeReserva, 13, 14)
    }
  }
  
  it should "lanzar CanchaSinLuzException si el horario excede la hora de cierre" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val cancha = new Paddle(1)
    
    intercept[CanchaSinLuzException] {
    	cancha.reservar(diaDeReserva, 20, 21)
    }
  }
  
  "Una chancha de Paddle" should "agregar un costo de 100 a la reserva" in {
    val cancha = new Paddle(1)
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    cancha.reservar(diaDeReserva, 8, 9)
    
    cancha.reservas.head.costoDeReserva should be (100)
  }

  it should "ser 0 el total de facturacion si no tiene reservas" in {
	  val cancha = new Paddle(1)
	  
	  assertResult(0){ cancha.totalDeFacturacion }
  }

  it should "ser 300 el total de facturacion si tiene tres reservas" in {
	val cancha = new Paddle(1)
	cancha.reservar(new DateTime(2014, 04, 14, 0, 0, 0), 8, 9)
	cancha.reservar(new DateTime(2014, 04, 14, 0, 0, 0), 9, 10)
	cancha.reservar(new DateTime(2014, 04, 14, 0, 0, 0), 10, 11)
	  
	assertResult(300) { cancha.totalDeFacturacion }
  }
  
  "Una chancha de Tennis" should "agregar un costo de 150 a la reserva" in {
    val cancha = new Tenis(1)
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    cancha.reservar(diaDeReserva, 8, 9)
    
    cancha.reservas.head.costoDeReserva should be (150)
  }
  
  "Una chancha de Futbol" should "agregar un costo de 400 a la reserva si es cancha de 5 o de 880 si es de 11" in {
    val canchaDeCinco = new Futbol(1, 10)
    val canchaDeOnce = new Futbol(2, 22)
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    canchaDeCinco.reservar(diaDeReserva, 8, 9)
    canchaDeOnce.reservar(diaDeReserva, 8, 9)

    canchaDeCinco.reservas.head.costoDeReserva should be (400)
    canchaDeOnce.reservas.head.costoDeReserva should be (880)
  }
  
  "Una cancha con luz" should "tener un horario de cierre posterior a las 18:00 hs." in {
    val canchaConLuz = new Paddle(1) with ConLuz
    
    canchaConLuz.horarioCierre should be > 18
  }
  
  it should "cobrarse con el precio base de la cancha si la reserva es antes de las 18:00 hs" in {
    val cancha = new Paddle(1) with ConLuz
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    cancha.reservar(diaDeReserva, 15, 16)
    
    cancha.reservas.head.costoDeReserva should be (100)
  }
  
  it should "aumentar un 20 por ciento el precio de la cancha si la reserva es para pasadas las 18:00 hs" in {
    val cancha = new Paddle(1) with ConLuz
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    cancha.reservar(diaDeReserva, 19, 20)
    
    cancha.reservas.head.costoDeReserva should be (120)
  }
  
  "Una cancha con techo" should "cobrar con el precio base de la cancha si el dia de la reserva no llueve" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val mockServicioMeteorologico = mock[ServicioMeteorologico]
    EasyMock.expect(mockServicioMeteorologico.vaALlover(diaDeReserva)).andReturn(false);
    EasyMock.replay(mockServicioMeteorologico)
    val cancha = new Paddle(1) with ConTecho
    cancha.servicioMeteorologico = mockServicioMeteorologico
    cancha.reservar(diaDeReserva, 15, 16)
   
    cancha.reservas.head.costoDeReserva should be (100)
  }
  
  it should "aumentar un 10 por ciento el precio de la cancha si la reserva es un dia de lluvia" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val mockServicioMeteorologico = mock[ServicioMeteorologico]
    EasyMock.expect(mockServicioMeteorologico.vaALlover(diaDeReserva)).andReturn(true);
    EasyMock.replay(mockServicioMeteorologico)
    val cancha = new Paddle(1) with ConTecho
    cancha.servicioMeteorologico = mockServicioMeteorologico
    cancha.reservar(diaDeReserva, 15, 16)
   
    cancha.reservas.head.costoDeReserva should be (110)
  }
  
  "Una cancha con tribuna" should "cobrar con el precio base de la cancha si el dia de la reserva no es fin de semana" in {
    val diaDeReserva = new DateTime(2014, 04, 16, 0, 0, 0)
    val cancha = new Paddle(1) with ConTribuna
    cancha.reservar(diaDeReserva, 15, 16)
   
    cancha.reservas.head.costoDeReserva should be (100)
  }
  
  it should "aumentar el doble al precio de la cancha si la reserva el fin de semana " in {
    val diaDeReserva = new DateTime(2014, 04, 19, 0, 0, 0)
    val cancha = new Paddle(1) with ConTribuna
    cancha.reservar(diaDeReserva, 15, 16)
   
    cancha.reservas.head.costoDeReserva should be (200)
  }

}