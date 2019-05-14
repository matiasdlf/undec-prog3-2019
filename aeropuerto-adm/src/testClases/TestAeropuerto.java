package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Aeropuerto;

class TestAeropuerto {
	
	@Test
	void testCreaAeropuerto() {
		Aeropuerto ae1 = new Aeropuerto(001, "Ezeiza", "Buenos Aires", "EZ-01");
		assertEquals(001, ae1.getIdAeropuerto());
		assertEquals("Ezeiza", ae1.getNombre());
		assertEquals("Buenos Aires", ae1.getCiudad());
		assertEquals("EZ-01", ae1.getCodigo());	
	}
	
	@Test
	void testCreaAeropuerto2() {
		Aeropuerto ae2 = new Aeropuerto(002, "Aeropuerto Anguinan", "Anguinan", "EZ-02");
		assertEquals(002, ae1.getIdAeropuerto());
		assertEquals("Aeropuerto Anguinan", ae1.getNombre());
		assertEquals("Anguinan", ae1.getCiudad());
		assertEquals("EZ-02", ae1.getCodigo());
	}	
}
