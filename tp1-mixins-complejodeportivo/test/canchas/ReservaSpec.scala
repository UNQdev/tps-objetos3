package canchas

import org.scalatest._
import org.joda.time.DateTime

class ReservaSpec extends FlatSpec with Matchers {

  "Una reserva" should "retornar falso si no se superpone con el día de otra" in {
    val reserva1 = new Reserva(new DateTime(2014, 04, 13, 0, 0, 0), 0, 0)
    val reserva2 = new Reserva(new DateTime(2014, 04, 14, 0, 0, 0), 0, 0)
    
    assert(! reserva1.seSuperponeCon(reserva2))
  }
  
  it should "retornar falso si no se superpone con el horario de otra" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val reserva1 = new Reserva(diaDeReserva, 10, 12)
    val reserva2 = new Reserva(diaDeReserva, 12, 13)
    
    assert(! reserva1.seSuperponeCon(reserva2))
  }
  
  it should "retornar verdadero si se superpone con la fecha y horario de otra" in {
    val diaDeReserva = new DateTime(2014, 04, 14, 0, 0, 0)
    val reserva1 = new Reserva(diaDeReserva, 10, 12)
    val reserva2 = new Reserva(diaDeReserva, 11, 13)
    val reserva3 = new Reserva(diaDeReserva, 9, 11)
    
    assert(reserva1.seSuperponeCon(reserva2))
    assert(reserva1.seSuperponeCon(reserva3))
  }

}
