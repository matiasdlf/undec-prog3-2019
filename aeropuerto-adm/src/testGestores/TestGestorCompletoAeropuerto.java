
 
package testGestores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import gestores.GestorAeropuerto;

class TestGestorCompletoAeropuerto {

	@Test
	void testGestorCrearAeropuerto() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.createAeropuerto(001, "Aeropuerto Ezeiza", "Buenos Aires", "EZ-01"));
		assertEquals(true, ga1.createAeropuerto(002, "Aeropuerto Anguinan", "Anguinan", "ANG-02"));
		assertEquals(true, ga1.createAeropuerto(003, "Aeropuerto Giovanni Nicelli", "Venecia", "VN-03"));
			
	}
	
	@Test
	void testGestorTrearUnAeropuerto() {
		//Trae por ID
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(true, ga1.traerUno(001));
		assertEquals(true, ga1.traerUno(002));
		assertEquals(true, ga1.traerUno(003));
		assertEquals(false, ga1.traerUno(999));
	}
	
	void testGestorTraerTodosAeropuertos() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		assertEquals(3, ga1.traerTodos().size());
	}
	
	void testGestorModificarAeropuerto() {
		GestorAeropuerto ga1 = GestorAeropuerto.getInstancia();
		
	}
 	

}
