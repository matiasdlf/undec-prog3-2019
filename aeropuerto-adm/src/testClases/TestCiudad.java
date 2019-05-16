package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Ciudad;

class TestCiudad {

	
	@Test
	void testCreaCiudad() {
		Ciudad c02 = new Ciudad(002, "La Rioja", "5300");
		assertEquals(002, c02.getIdCiudad());
		assertEquals("Chilecito", c02.getNombre());
		assertEquals("5360", c02.getCodigoPostal());
	}
	
	@Test
	void testCreaCiudad2() {
		Ciudad c03 = new Ciudad(003, "Tokyo", "112-000");
		assertEquals(003, c03.getIdCiudad());
		assertEquals("Tokyo", c03.getNombre());
		assertEquals("112-000", c03.getCodigoPostal());
	}

}
