package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Aeropuerto;
import paquete00.Ciudad;

class TestAeropuerto {
	
	@Test
	void testCreaAeropuerto() {
		Ciudad c1 = new Ciudad(001,"Buenos Aires", "1000-419");
		Aeropuerto ae1 = new Aeropuerto(001, "Ezeiza", c1 , "EZ-01");
		assertEquals(001, ae1.getIdAeropuerto());
		assertEquals("Ezeiza", ae1.getNombre());
		assertEquals("Buenos Aires", ae1.getCiudad());
		assertEquals("EZ-01", ae1.getCodigo());	
	}
	
	@Test
	void testCreaAeropuerto2() {
		Ciudad c2 = new Ciudad(002,"Anguinan", "5363");
		Aeropuerto ae2 = new Aeropuerto(002, "Aeropuerto Anguinan", c2, "ANG-02");
		assertEquals(002, ae2.getIdAeropuerto());
		assertEquals("Aeropuerto Anguinan", ae2.getNombre());
		assertEquals("Anguinan", ae2.getCiudad());
		assertEquals("EZ-02", ae2.getCodigo());
	}	
}
