package testClases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import paquete00.Aerolinea;
import paquete00.Aeropuerto;
import paquete00.Asiento;
import paquete00.Asignacion;
import paquete00.Avion;
import paquete00.Pasajero;
import paquete00.Piloto;
import paquete00.Vuelo;

class TestVuelo {

	@Test
	void testVuelo() {
		Aeropuerto salida = new Aeropuerto(001, "Ezeiza", "Buenos Aires", "EZ-01");
		Aeropuerto arribo = new Aeropuerto(002, "Aeropuerto Anguinan", "Anguinan", "EZ-02");
		Aerolinea aerolinea= new Aerolinea(001, "Fly Bondi");
		//Asientos de avion
		List<Asiento> asientosAV01 = new ArrayList<Asiento>();
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
		asientosAV01.add(as01);
		asientosAV01.add(as02);
		asientosAV01.add(as03);
		asientosAV01.add(as04);
		asientosAV01.add(as05);
		asientosAV01.add(as06);
		asientosAV01.add(as07);
		asientosAV01.add(as08);
		asientosAV01.add(as09);
		asientosAV01.add(as10);
		//Avion
		Avion av01 = new Avion(001, "Boeing 747", "G-KELS", asientosAV01);
		//Fechas salida-arribo
		LocalDateTime fechaHoraSalida = LocalDateTime.of(2019, 05, 15, 15, 00, 00);
		LocalDateTime fechaHoraArribo = LocalDateTime.of(2019, 05, 15, 18, 00, 00);
		//Piloto
		List<Piloto> pilotos = new ArrayList<Piloto>();
		LocalDate fechaNac = LocalDate.of(1990, Month.FEBRUARY, 19);
		Piloto pi01 = new Piloto(001, "Kowalcky", "Edmund", "13130400", fechaNac);
		//Copiloto
		LocalDate fechaNac2 = LocalDate.of(1989, Month.MAY, 14);
		Piloto pi02 = new Piloto(002, "Andres", "Iniesta", "34701223", fechaNac2);
		//Pasajeros - Asignacion
		List<Asignacion> pasajeros = new ArrayList<Asignacion>();
		Pasajero p01 = new Pasajero("0001", "20-0303456-8","Diaz", "Bruno", "03825003312");
		Asignacion asig01 = new Asignacion(p01, as01, "AS001");
		Pasajero p02 = new Pasajero("0002", "20-0303457-8","Diaz", "Alan", "03825003313");
		Asignacion asig02 = new Asignacion(p02, as02, "AS002");
		Pasajero p03 = new Pasajero("0003", "20-0303458-8","Diaz", "Romina", "03825003314");
		Asignacion asig03 = new Asignacion(p03, as03, "AS003");
		Pasajero p04 = new Pasajero("0004", "20-0303459-8","Diaz", "Laura", "03825003315");
		Asignacion asig04 = new Asignacion(p04, as04, "AS004");
		Pasajero p05 = new Pasajero("0005", "20-0303460-8","Diaz", "Pablo", "03825003316");
		Asignacion asig05 = new Asignacion(p05, as05, "AS005");
		Pasajero p06 = new Pasajero("0006", "20-0303461-8","Diaz", "Pedro", "03825003317");
		Asignacion asig06 = new Asignacion(p06, as06, "AS006");
		Pasajero p07 = new Pasajero("0007", "20-0303462-8","Diaz", "Ernesto", "03825003318");
		Asignacion asig07 = new Asignacion(p07, as07, "AS007");
		Pasajero p08 = new Pasajero("0008", "20-0303463-8","Diaz", "Mirtha", "03825003319");
		Asignacion asig08 = new Asignacion(p08, as08, "AS008");
		Pasajero p09 = new Pasajero("0009", "20-0303464-8","Diaz", "Monica", "03825003320");
		Asignacion asig09 = new Asignacion(p09, as09, "AS009");
		Pasajero p10 = new Pasajero("0010", "20-0303465-8","Diaz", "Teresa", "03825003321");
		Asignacion asig10 = new Asignacion(p10, as10, "AS010");
		pasajeros.add(asig01);
		pasajeros.add(asig02);
		pasajeros.add(asig03);
		pasajeros.add(asig04);
		pasajeros.add(asig05);
		pasajeros.add(asig06);
		pasajeros.add(asig07);
		pasajeros.add(asig08);
		pasajeros.add(asig09);
		pasajeros.add(asig10);
		
		Vuelo vu0001= new Vuelo("0001", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, av01, pasajeros); 
		assertEquals(0001, vu0001.getCodigoVuelo());
		assertEquals("15-05-2019 15:00:00", vu0001.getFechaHoraSalidaFormato());
		assertEquals("15-05-2019 18:00:00", vu0001.getFechaHoraArriboFormato());
		assertEquals("Buenos Aires", vu0001.getSalida().getCiudadSalida());
		assertEquals("Anguinan", vu0001.getArribo().getCiudadArribo());
		assertEquals("Fly Bondi", vu0001.getAerolinea().getNombre());
		assertEquals("001", vu0001.getPiloto().getIdPiloto());
		assertEquals("001", vu0001.getAvion().getIdAvion());
		assertEquals("20-0303459-8", vu0001.getPasajeros().get(3).getCuil());
		
	}

}
