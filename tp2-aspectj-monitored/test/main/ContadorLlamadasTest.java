package test.main;

import junit.framework.TestCase;
import src.aspectos.ContadorLlamadasAspect;
import src.dominio.Persona;

import org.junit.*;

public class ContadorLlamadasTest extends TestCase {

	@Test
	public void testCantLlamadas() {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.getNombre();
        p1.setNombre(" Nico ");
        p1.setNombre(" Carlos ");
        
	        int llamadas_p1_getNombre =
	        	ContadorLlamadasAspect.aspectOf(p1).cantLlamadas("getNombre");
	        int llamadas_p1_setNombre =
	        	ContadorLlamadasAspect.aspectOf(p1).cantLlamadas("setNombre");
	        int llamadas_p2_setNombre =
	        	ContadorLlamadasAspect.aspectOf(p2).cantLlamadas("setNombre");

        assertEquals(llamadas_p1_getNombre , 1) ;
        assertEquals(llamadas_p1_setNombre , 2) ;
        assertEquals(llamadas_p2_setNombre , 0) ;
    }
	
}