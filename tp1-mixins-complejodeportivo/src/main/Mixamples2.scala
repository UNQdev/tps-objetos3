package main

object Mixamples2 {

	/*
	 * PRIMER MIXIN SIMPLE (sobre una clase)
	 */
	
	/*Un trait se define parecido a una clase, pero con la el keyword "trait".*/
	
	trait Filosofo {
		def filosofar() {
			println("Consumo memoria, ergo existo")
		}
	}
	
	/*Luego, se aplica a una clase. Si la clase no tiene una superclase podemos usar extend.*/
	
	class Socrates extends Filosofo {
		def hablar() {
			filosofar()
		}
	}
	
	/*En cambio, si la clase ya hereda de otra clase, se puede utilizar el with.*/
	
	class Persona
	
	class Platon extends Persona with Filosofo {
		def hablar() {
			filosofar()
		}
	}
	
	/*En ambos casos vemos que un método de la clase, está utilizando el "filosofar()" que se agrega con el mixin. Esa es una opción.*/
	
	
	
	/*
	 * EL MIXIN DEFINE UN TIPO
	 */
	
	/*Otra opción, es utilizar el método desde el cliente de los objetos.*/
	
	val socrates = new Socrates
	socrates.filosofar
	
	/*Estamos llamando directo al método "filosofar" que está definido en el mixin.
	O sea que el mixin sirve para componer a la clase, incluso agregando mensajes públicos que luego utilizamos como clientes del objeto.
	De acá se desprende además, que el Mixin, al igual que una clase, o una interface en Java, define un Tipo.
	Ejemplo:*/
	
	val filosofos : List[Filosofo] = List(new Socrates, new Platon)
	filosofos foreach { f => f filosofar }
	
	/*Acá vemos que la lista es de tipo Lista de Filosofos (que es el mixin).*/
	
	
	
	/*
	 * MIXIN SOBRE UN OBJETO
	 */
	
	/*En Scala además de definir una clase, uno puede crear un objeto y ahí mismo "construir la clase". Algo así como una clase "anónima" en java. Ésto viene un poco por el lado de los mixins. Para poder combinarlos sin tener que crear muchas clases.
	Apliquemos el filósofo a un objeto cualquiera.*/
	
	val objeto = new Object() with Filosofo
	objeto.filosofar
	 
	/*A este object ahora, lo podemos tratar como un filósofo.
	De paso mostramos que se pueden definir métodos ahí nomás:
	
	val objeto = new Object() with Filosofo {
	   def hablar() {
	      filosofar()
	   }
	}
	*/
	
	
	
	/*
	 * MULTIPLES MIXINS
	 */
	
	/*Como con las interfaces, podemos aplicar varios mixins a una clase.
	Definimos otro trait*/
	
	trait Charlatan {
	  def mentir() {
	    println("Te conté que trabajé en hollywood ?")
	  }
	}
	
	/*Luego aplicamos ambos*/
	
	class JacoboWinograd extends Persona with Filosofo with Charlatan {
	  def hablar() {
	    filosofar()
	    mentir()
	    mentir()
	  }
	}
	
	
	
	/*
	 * MIXIN CON ESTADO
	 */
	
	/*Un mixin en scala puede definir estado además de comportamiento.*/
	
	trait Sedentario {
	  var viveEn : String
	}
	
	/*En este caso definimos un atributo, con lo cual Scala genera además los getters y setters.*/
	
	val s = new Socrates with Sedentario
	s.viveEn = "Grecia"
	


	    
	/*
	 * MIXIN NO PUEDE TENER PARAMETROS
	 */
	
	/*A diferencia de las clases, no podemos hacer esto
	
	trait Sedentario(var viveEn : String) {
	
	}
	
	  Es decir que un trait no puede tener constructores.*/
	
	  
	  
	/*
	 * MIXIN ABSTRACTO
	 */
	
	/*Un mixin puede definir un método abstracto. Esto quiere decir que al aplicarlo a una construcción, ésta debe implementar ese método, de otra forma no va a compilar.
	
	Ojo acá que no decimos "aplicarlo a una clase", sino explícitamente construcción.
	Porque ya vimos que un trait se puede aplicar al definir una clase, o al crear un objeto.
	
	Ejemplo: hacemos un trait que sirve para aplicar la lógica de que un objeto puede ser alquilable. Va a tener como estado quien es el inquilino actual, y un método para ser alquilado. Luego podemos aplicarlo a cualquier clase que querramos que sea Alquilable
	*/
	trait Alquilable {
	    var inquilino : Inquilino = null
	    def alquilarA(inquilino : Inquilino) {
	      inquilino debitar precioDeAlquiler
	    }
	    
	    def precioDeAlquiler : Int
	  }
	
	/*Atenti que la lógica de alquilarA, le debita plata al inquilino. Pero cuanto ?? Eso depende del objeto que estemos alquilando. Entonces define un método abstracto "precioDeAlquiler". Esto quiere decir que ahora solo se puede aplicar este trait a una construcción que entienda ese mensaje.
	Acá el código de Inquilino:*/
	class Inquilino(var saldo : Int) {
	    def debitar(cuanto:Int) {
	      saldo -= cuanto
	    }
	  }
	
	/*Y ahora lo aplicamos a dos clases con implementaciones distintas:*/
	  class Pelicula extends Alquilable {
	    override def precioDeAlquiler = 8
	  }
	  
	  class JuegoPS3(var precio : Int) extends Alquilable {
	    override def precioDeAlquiler = precio
	  }
	
	/*La pelicula devuelve un valor fijo, en cambio el juego de ps3 se configura con un atributo. Podríamos tener otras implementaciones distintas.
	También podemos aplicarlo a un objeto*/
	
	val alqui = new Object with Alquilable {
	    override def precioDeAlquiler = 43
	}
	alqui.alquilarA(new Inquilino(200))
	
	/*Ya lo aplicamos a una clase y a un objeto. 
	También podemos hacer que la implementación de "precioDeAlquiler" no esté en la clase, sino en otro mixin !*/
	
	  trait Preciable {
	    var precioDeAlquiler : Int
	  }
	
	/*Representa a un objeto que tiene un precio (define un atributo y sus accesors)
	Ahora lo usamos con cualquier cosa loca:*/
	
	val socratesEsclavoAlquilable = new Socrates with Preciable with Alquilable
	socratesEsclavoAlquilable.precioDeAlquiler = 200
	socratesEsclavoAlquilable.alquilarA(new Inquilino(1000))
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}