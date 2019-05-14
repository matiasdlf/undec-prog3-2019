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
		Asiento as01 = new Asiento("A01", "001");
		Asiento as02 = new Asiento("A02", "002");
		Asiento as03 = new Asiento("A03", "003");
		Asiento as04 = new Asiento("A04", "004");
		Asiento as05 = new Asiento("A05", "005");
		Asiento as06 = new Asiento("B01", "006");
		Asiento as07 = new Asiento("B02", "007");
		Asiento as08 = new Asiento("B03", "008");
		Asiento as09 = new Asiento("B04", "009");
		Asiento as10 = new Asiento("B05", "010");
		
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
		assertEquals(002, av02.getIdAvion);
		assertEquals("Airbus A320", av02.getModelo());
		assertEquals("A-ROLS", av02.getMatricula());
		assertEquals(as04, getListaAsientos().get(3));
	}
	
	@Test
	void testCreaAvion2() {
		List<Asiento> asientosAV03 = new ArrayList<Asiento>();
		Asiento as01 = new Asiento("A01", "001");
		Asiento as02 = new Asiento("A02", "002");
		Asiento as03 = new Asiento("A03", "003");
		Asiento as04 = new Asiento("A04", "004");
		Asiento as05 = new Asiento("A05", "005");
		Asiento as06 = new Asiento("B01", "006");
		Asiento as07 = new Asiento("B02", "007");
		Asiento as08 = new Asiento("B03", "008");
		Asiento as09 = new Asiento("B04", "009");
		Asiento as10 = new Asiento("B05", "010");
		
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
		
		Avion av03 = new Avion(003, "Bombardier CRJ200", "F-GOAT", asientosAV02);
		assertEquals(003, av03.getIdAvion);
		assertEquals("Bombardier CRJ200", av03.getModelo());
		assertEquals("A-ROLS", av03.getMatricula());
		assertEquals(as02, getListaAsientos().get(1));
	}
}
