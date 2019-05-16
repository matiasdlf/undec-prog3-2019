package testClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paquete00.Piloto;

import java.time.LocalDate;
import java.time.Month;


class TestPiloto {
	
	@Test
	void testCreaPiloto() {
		LocalDate fechaNac = LocalDate.of(1990, Month.FEBRUARY, 19);
		LocalDate fechaNac2 = LocalDate.of(1990, Month.FEBRUARY, 19);
		Piloto pi01 = new Piloto(001, "Kowalcky", "Edmund", "13130400", fechaNac);
		assertEquals(001, pi01.getIdPiloto());
		assertEquals("Kowalcky", pi01.getApellido());
		assertEquals("Edmund", pi01.getNombres());
		assertEquals("13130400", pi01.getDocumento());
		assertEquals(fechaNac2, fechaNac);
	}
	
	@Test
	void testCreaPiloto2() {
		LocalDate fechaNac = LocalDate.of(1989, Month.MAY, 14);
		LocalDate fechaNac2 = LocalDate.of(1989, Month.MAY, 14);
		Piloto pi02 = new Piloto(002, "Alarcon", "Nadia", "34701223", fechaNac);
		assertEquals(002, pi02.getIdPiloto());
		assertEquals("Nadia", pi02.getNombres());
		assertEquals("Alarcon", pi02.getApellido());
		assertEquals("34701223", pi02.getDocumento());
		assertEquals(fechaNac2, fechaNac);
	}

}
