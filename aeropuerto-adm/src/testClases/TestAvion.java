package testClases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import paquete00.Asiento;
import paquete00.Avion;

class TestAvion {
	
	@Test
	void testCreaAvion() {
		List<Asiento> asientosAV02 = new ArrayList<Asiento>();
		Asiento as01 = new Asiento(1, "A01");
		Asiento as02 = new Asiento(2, "A02");
		Asiento as03 = new Asiento(3, "A03");
		Asiento as04 = new Asiento(4, "A04");
		Asiento as05 = new Asiento(5, "A05");
		Asiento as06 = new Asiento(6, "B01");
		Asiento as07 = new Asiento(7, "B02");
		Asiento as08 = new Asiento(8, "B03");
		Asiento as09 = new Asiento(9, "B04");
		Asiento as10 = new Asiento(10, "B05");
		
		asientosAV02.add(as01);
		asientosAV02.add(as02);
		asientosAV02.add(as03);
		asientosAV02.add(as04);
		asientosAV02.add(as05);
		asientosAV02.add(as06);
		asientosAV02.add(as07);
		asientosAV02.add(as08);
		asientosAV02.add(as09);
		asientosAV02.add(as10);
		
		Avion av02 = new Avion(002, "Boeing 747", "G-KELS", asientosAV02);
		assertEquals(002, av02.getIdAvion());
		assertEquals("Boeing 747", av02.getModelo());
		assertEquals("G-KELS", av02.getMatricula());
		assertEquals(as04, av02.getListaAsientos().get(3));
	}
	
	@Test
	void testCreaAvion2() {
		List<Asiento> asientosAV03 = new ArrayList<Asiento>();
		Asiento as01 = new Asiento(1, "A01");
		Asiento as02 = new Asiento(2, "A02");
		Asiento as03 = new Asiento(3, "A03");
		Asiento as04 = new Asiento(4, "A04");
		Asiento as05 = new Asiento(5, "A05");
		Asiento as06 = new Asiento(6, "B01");
		Asiento as07 = new Asiento(7, "B02");
		Asiento as08 = new Asiento(8, "B03");
		Asiento as09 = new Asiento(9, "B04");
		Asiento as10 = new Asiento(10, "B05");
		
		asientosAV03.add(as01);
		asientosAV03.add(as02);
		asientosAV03.add(as03);
		asientosAV03.add(as04);
		asientosAV03.add(as05);
		asientosAV03.add(as06);
		asientosAV03.add(as07);
		asientosAV03.add(as08);
		asientosAV03.add(as09);
		asientosAV03.add(as10);
		
		Avion av03 = new Avion(003, "Bombardier CRJ200", "F-GOAT", asientosAV03);
		assertEquals(003, av03.getIdAvion());
		assertEquals("Bombardier CRJ200", av03.getModelo());
		assertEquals("F-GOAT", av03.getMatricula());
		assertEquals(as02, av03.getListaAsientos().get(1));
	}
}
