package ejemplos

import scala.collection.mutable.ArrayBuffer

object Mixamples extends App {

	trait Alquilable {
	  var arrendatario : Arrendatario = _
	  
	  def alquilar(arrendatario : Arrendatario) {
	    arrendatario.debitar(this.precio)
	    this.arrendatario = arrendatario
	  }
	  def precio : Int
	}
  
	trait Preciable {
	  def precio()
	}
	
	class Arrendatario(var saldo:Int) {
	  def debitar(monto:Int) {
	    saldo -= monto
	  }
	}
	trait Filosofo {
	  def filosofar() {
	    println("Pienso, luego existo")
	  }
	}
  
	trait Charlatan {
	  def chamuyar() {
	    println("Te conte' que trajae' en Hollywood")
	  }
	}
	
	class JacoboWinograd extends Persona with Filosofo with Charlatan
	
	class Descartes extends Filosofo {
	  def hablar() {
	    this.filosofar()
	  }
	}
	
	class Socrates extends Filosofo {
	  override def filosofar() {
	    println("Soy Socrates, obvio que filosofo")
	  }
	}
	
	object Locke extends Persona with Filosofo {   //es lo mismo que poner val loc = new Persona with Filosofo 
	  override def filosofar() {
	    println("Soy Locke, no John")
	  }
	}
	
	class Persona {
	  def hablar() {
	    println("hablo")
	  }
	}
	
	class Pelicula extends Alquilable {
	  override def precio() = 2
	}
	
	class CuatroXCuatro(var precioDeAlquiler:Int = 330) extends Alquilable {
	  override def precio() = this.precioDeAlquiler
	}
	
	val descartes = new Descartes
	descartes.filosofar
	
	val l = ArrayBuffer(descartes, new Socrates)
	l.foreach{f => f.filosofar}
	
	val persona = new Persona with Filosofo {
	  def caminar() {
	    println("camino")
	  }
	  override def filosofar() {
	    println("soy una persona, luego existo")
	  }
	}
	
	persona.filosofar
	l += persona
	
	l += new JacoboWinograd
	println("con Jacobo\n" + ("-" * 30))
	
	val jacoboAlquilable = new JacoboWinograd with Alquilable { 
	  override def precio() = 100
	}
}