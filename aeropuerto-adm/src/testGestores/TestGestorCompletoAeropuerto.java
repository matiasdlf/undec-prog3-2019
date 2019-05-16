
 
package testGestores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import gestores.GestorAeropuerto;
import paquete00.Aeropuerto;
import paquete00.Ciudad;

class TestGestorCompletoAeropuerto {

	@Test
	void testGestorCrearAeropuerto() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstance();
		Ciudad c1 = new Ciudad(1, "Buenos Aires", "BSAS");
		Aeropuerto a1= new Aeropuerto(001, "Aeropuerto Ezeiza", c1, "EZ-01");
		assertEquals(true, ga1.createAeropuerto(a1));
		Ciudad c2 = new Ciudad(2, "Anguinan", "ANG");
		Aeropuerto a2= new Aeropuerto(002, "Aeropuerto Anguinan", c2, "ANG-02");
		assertEquals(true, ga1.createAeropuerto(a2));
		Ciudad c3= new Ciudad(3, "Venecia", "VEN");
		Aeropuerto a3= new Aeropuerto(003, "Aeropuerto Ezeiza", c3, "EZ-01");
		assertEquals(true, ga1.createAeropuerto(a3));
			
	}
	
	@Test
	void testGestorTrearUnAeropuertoPorId() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.traerUno(001));
		assertEquals(true, ga1.traerUno(002));
		assertEquals(true, ga1.traerUno(003));
		assertEquals(false, ga1.traerUno(999));
	}
	
	@Test
	void testGestorTraerTodosAeropuertos() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(3, ga1.traerTodos().size());
	}
	
	@Test
	void testGestorModificarCodigoAeropuertoConId() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.modificarCodigoConId(001, EZ-05));
	}
	
	@Test
	void testGestorEliminarAeropuertoConId() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.elminarAeropuertoConId(001));
	}
	
	@Test
	void testGestorEliminarAeropuertoConNombre() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.elminarAeropuertoConNombre("Aeropuerto Giovanni Nicelli"));
	}
	
}
