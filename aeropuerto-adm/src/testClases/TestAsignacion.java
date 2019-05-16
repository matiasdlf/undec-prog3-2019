package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Asiento;
import paquete00.Asignacion;
import paquete00.Pasajero;

class TestAsignacion {
	
	@Test
	void testCreaAsignacion() {
		Pasajero p01 = new Pasajero(0001, "20-0303456-8","Diaz", "Bruno", "03825003312");
		Asiento as01 = new Asiento(001, "A01");
		Asignacion asig01 = new Asignacion(p01, as01, "AS001");
		assertEquals(0001, asig01.getPasajero().getIdPasajero());
		assertEquals(001, asig01.getAsiento().getIdAsiento());
		assertEquals("AS001", asig01.getCodigoAsignacion());
	}
	
	@Test
	void testCreaAsignacion2() {
		Pasajero p02 = new Pasajero(0002, "20-0102314-8","Nobunaga", "Hitomi", "819017901357");
		Asiento as02 = new Asiento(002, "A02");
		Asignacion asig02 = new Asignacion(p02, as02, "AS002");
		assertEquals(0002, asig02.getPasajero().getIdPasajero());
		assertEquals(002, asig02.getAsiento().getIdAsiento());
		assertEquals("AS002", asig02.getCodigoAsignacion());
	}

}