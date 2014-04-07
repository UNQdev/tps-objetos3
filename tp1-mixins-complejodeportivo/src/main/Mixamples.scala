package main

import scala.collection.mutable.ArrayBuffer

object Mixamples {

  def main(args: Array[String]): Unit = {
 
    
  abstract class Cola {
	def get(): Int
	def put(i : Int)
	def size : Int
  }

  class ColaBasica extends Cola {
	private val buffer = ArrayBuffer[Int]()
	override def get() = buffer remove 0
	override def put(i:Int) { buffer += i }
	override def size = buffer size
  }

  //EXCERSICE
  val c = new ColaBasica
  c put 3
  c put 10
  c put 1
  println("Ejercitando el objeto ColaBasica")
  println(c get)
  println(c get)
  println(c get)

  
  /*
  Ahora vamos a necesitar un par de "comportamientos", como "filtros" para aplicar a las colas y así modificar su comportamiento. 
  Duplicador: cuando se agrega un elemento, en realidad agrega el resultado de multiplicarlo por 2
  Incrementador: que agrega el número dado incrementado por 1.
  */
  
  trait Duplicador extends Cola {
	abstract override def put(i:Int) {
		super.put(2 * i)
	}
  }
  
  /*
  El trait hereda de Cola, ya que la idea es que intercepte el llamado a put.
  Ahora, el trait no va a implementar el put "completo", sino solo un agregado, pero va a necesitar utilizar una implementación concreta.
  Sin embargo si miramos en Cola, el método es abstracto. Entonces por esto es que necesitamos marcarlo como abstract override. 
  Lo que quiere decir con abstract override es que queremos sobrescribir la implementación que vaya a tener la clase sobre la que va a aplicar el trait. El efecto que va a tener esto es que este trait sólo se va a poder aplicar a una subclase de Cola que ya tenga implementado el método put.
  */
  
  //EXCERSICE
  val duplicada = new ColaBasica with Duplicador
  duplicada put 3
  println("Ejercitando el objeto ColaBasica con Duplicador, si le agrego un 3")
  println(duplicada get)
  
  
  
  trait Inmutable extends Cola {
	override def put(i:Int) {
    // no hace nada
	}
  }
  
  //EXCERSICE
  val inmutable = new ColaBasica with Inmutable
  inmutable put 3
  println("Ejercitando el objeto ColaBasica Inmutable, si le agrego un 3")
  println("tamanio", inmutable size)
  

  
  trait Incrementador extends Cola {
	abstract override def put(i:Int) {
		super.put(i + 1)
	}
  }
  
  val duplicadaConInc = new ColaBasica with Duplicador with Incrementador
  duplicadaConInc put 3
  println("Ejercitando el objeto ColaBasica con Duplicador e Incrementador, si le agrego un 3")
  println("+1, *2", duplicadaConInc get)

  
  /*
   * HERENCIA DE TRAITS
   */
  
  trait Cuatriplicador extends Duplicador {
	abstract override def put(i:Int) {
		super.put(2 * i)
	}
  }
  
  //EXCERSICE
  val cuatriplicados = new ColaBasica with Cuatriplicador
  cuatriplicados put 3
  println("Ejercitando el objeto ColaBasica con Cuadriplicador, si le agrego un 3")
  println("*4", cuatriplicados get)
  
  }
}