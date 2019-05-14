package testClases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import paquete00.Piloto;

class TestPiloto {
	
	void testCreaPiloto() {
		LocalDate fechaNac = LocalDate.of(1990, Month.FEBRUARY, 19);
		LocalDate fechaNac2 = LocalDate.of(1990, Month.FEBRUARY, 19);
		Piloto pi01 = new Piloto(001, "Kowalcky", "Edmund", "13130400", fechaNac);
		assertEquals(001, pi01.getIdPiloto());
		assertEquals("Kowalcky", pi01.getNombre());
		assertEquals("Edmund", pi01.getApellido());
		assertEquals("13130400", pi01.getDocumento());
		assertEquals(fechaNac2, fechaNac);
	}
	
	void testCreaPiloto2() {
		LocalDate fechaNac = LocalDate.of(1989, Month.MAY, 14);
		LocalDate fechaNac2 = LocalDate.of(1989, Month.MAY, 14);
		Piloto pi02 = new Piloto(002, "Nadia", "Alarcon", "34701223", fechaNac);
		assertEquals(002, pi02.getIdPiloto());
		assertEquals("Nadia", pi02.getNombre());
		assertEquals("Alarcon", pi02.getApellido());
		assertEquals("34701223", pi02.getDocumento());
		assertEquals(fechaNac2, fechaNac);
	}

}
