package paquete00;

import excepciones.AerolineaNombreNullEx;

public class Aerolinea {
	Integer idAerolinea;
	String nombre;
	
	public Aerolinea(Integer idAerolinea, String nombre) throws AerolineaNombreNullEx {
		if(nombre == null)
			throw new AerolineaNombreNullEx("El nombre no puede ser nulo.");
		else {
			this.idAerolinea = idAerolinea;
			this.nombre = nombre;
		}
	}

	public Integer getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Integer idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
