package paquete00;

import java.time.LocalDate;
import java.util.List;

public class Vuelo {
	String codigoVuelo;
	Aeropuerto salida;
	LocalDate fechaHoraSalida;
	Aeropuerto arribo;
	LocalDate fechaHoraArribo;
	Aerolinea aerolinea;
	List<Piloto> pilotos;
	Avion avion;
	List<Asignacion> pasajeros;
}
