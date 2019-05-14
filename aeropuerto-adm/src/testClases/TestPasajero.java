package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Pasajero;

class TestPasajero {
	
	@Test
	void testCreaPasajero() {
		Pasajero p01 = new Pasajero("0001", "20-0303456-8","Diaz", "Bruno", "03825003312");
		AssertEquals(0001, p01.getIdPasajero());
		AssertEquals("20-0303456-8", p01.getCUIL());
		AssertEquals("Diaz", p01.getNombre());
		AssertEquals("Bruno", p01.getApellido());
		AssertEquals("03825003312", p01.getTelefono());
	}
	
	@Test
	void testCreaPasajero2() {
		Pasajero p02 = new Pasajero("0002", "20-1123467-8","Colombo", "Sabrina", "03825668220");
		AssertEquals(0002, p02.getIdPasajero());
		AssertEquals("20-1123467-8", p02.getCUIL());
		AssertEquals("Colombo", p02.getNombre());
		AssertEquals("Sabrina", p02.getApellido());
		AssertEquals("03825668220", p02.getTelefono());
	}

}
