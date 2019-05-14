package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Aerolinea;

class TestAerolinea {
	
	@Test
	void testCreaAerolinea() {
		Aerolinea a1= new Aerolinea(001, "Aerolineas Argentinas");
		assertEquals(001, a1.getId());
		assertEquals("Aerolineas Argentinas", a1.getNombre());
		
	}
	
	@Test
	void testCreaAerolinea2() {
		Aerolinea a2= new Aerolinea(002, "Fly Bondi");
		assertEquals(002, a2.getId());
		assertEquals("Fly Bondi", a2.getNombre());
	}
}
