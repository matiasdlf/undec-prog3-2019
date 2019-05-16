package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.AerolineaNombreNullEx;
import paquete00.Aerolinea;

class TestAerolinea {
	
	@Test
	void testCreaAerolinea() throws AerolineaNombreNullEx {
		Aerolinea a1= new Aerolinea(001, "Aerolineas Argentinas");
		assertEquals(001, a1.getIdAerolinea());
		assertEquals("Aerolineas Argentinas", a1.getNombre());
		
	}
	
	@Test
	void testCreaAerolinea2() throws AerolineaNombreNullEx {
		Aerolinea a2= new Aerolinea(002, "Fly Bondi");
		assertEquals(002, a2.getIdAerolinea());
		assertEquals("Fly Bondi", a2.getNombre());
	}
}
