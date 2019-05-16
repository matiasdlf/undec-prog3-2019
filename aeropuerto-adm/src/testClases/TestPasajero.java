package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Pasajero;

class TestPasajero {
	
	@Test
	void testCreaPasajero() {
		Pasajero p01 = new Pasajero(001, "20-0303456-8","Diaz", "Bruno", "03825003312");
		assertEquals(0001, p01.getIdPasajero());
		assertEquals("20-0303456-8", p01.getCUIL());
		assertEquals("Diaz", p01.getApellido());
		assertEquals("Bruno", p01.getNombres());
		assertEquals("03825003312", p01.getTelefono());
	}
	
	@Test
	void testCreaPasajero2() {
		Pasajero p02 = new Pasajero(002, "20-1123467-8","Colombo", "Sabrina", "03825668220");
		assertEquals(0002, p02.getIdPasajero());
		assertEquals("20-1123467-8", p02.getCUIL());
		assertEquals("Colombo", p02.getApellido());
		assertEquals("Sabrina", p02.getNombres());
		assertEquals("03825668220", p02.getTelefono());
	}

}
