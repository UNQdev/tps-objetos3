package main;

import aspectos.ContadorLlamadasAspect;
import dominio.Persona;
import junit.framework.TestCase;

public class ContadorLlamadasTest extends TestCase {
    
	@Setup
	Persona p1 = new Persona();
	Persona p2 = new Persona();
	
	@Test
    public void testCantLlamadas() {
		p1.getNombre();
        p1.setNombre(" Nico ");
        p1.setNombre(" Carlos ");
        
	        int llamadas_p1_getNombre =
	        	ContadorLlamadasAspect.aspectOf().cantLlamadas(p1, "getNombre");
	        int llamadas_p1_setNombre =
	            ContadorLlamadasAspect.aspectOf().cantLlamadas(p1, "setNombre");
	        int llamadas_p2_setNombre =
	            ContadorLlamadasAspect.aspectOf().cantLlamadas(p2, "setNombre");
	        
//		int llamadas_p1_getNombre =
//	        ContadorLlamadasAspect.aspectOf().cantLlamadas("getNombre");
//		int llamadas_p1_setNombre =
//	        ContadorLlamadasAspect.aspectOf().cantLlamadas("setNombre");
//		int llamadas_p2_setNombre =
//			ContadorLlamadasAspect.aspectOf().cantLlamadas("setNombre");
        
        
        assertEquals(llamadas_p1_getNombre , 1) ;
        assertEquals(llamadas_p1_setNombre , 2) ;
        assertEquals(llamadas_p2_setNombre , 0) ;
    }
	
}