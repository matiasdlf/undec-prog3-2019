package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Asiento;

class TestAsiento {
	
	@Test
	void testCreaAsiento() {
		Asiento as1 = new Asiento(002, "A02");
		assertEquals(002, as1.getIdAsiento());
		assertEquals("A02", as1.getNumeroAsiento());
	}
	
	@Test
	void testCreaAsiento2() {
		Asiento as1 = new Asiento(003, "A03");
		assertEquals(003, as1.getIdAsiento());
		assertEquals("A03", as1.getNumeroAsiento());
	}

}
