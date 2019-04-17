package dominio;

import java.text.DecimalFormat;

import dominio.excepciones.ExceptionPersona;
import dominio.excepciones.ExceptionPersonaDniNulo;
import dominio.excepciones.ExceptionPersonaNombreNulo;

public class Persona implements Comparable<Persona>{
	
	private String apellidoYNombre;
	private String dni;
	
	public Persona(String apellidoYNombre, String dni) throws ExceptionPersona {
		if(apellidoYNombre == null) {
			throw new ExceptionPersonaNombreNulo();
		}else {
			this.apellidoYNombre= apellidoYNombre;
		}
		if(dni == null) {
			throw new ExceptionPersonaDniNulo();
		}else {
			this.dni= dni;
		}
	}
	
	public String getDniConFormato() {
		DecimalFormat formato= new DecimalFormat("###,###.##");
		return formato.format(Integer.parseInt(this.dni));
	}

	public String getApellidoYNombre() {
		return this.apellidoYNombre;
	}

	public String getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Persona [apellidoYNombre=" + apellidoYNombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoYNombre == null) ? 0 : apellidoYNombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Persona other = (Persona) obj;
		if (!apellidoYNombre.equalsIgnoreCase(other.apellidoYNombre))
			return false;
		else
			return true;		
	}

	public int compareTo(Persona arg0) {
		return apellidoYNombre.compareTo(arg0.apellidoYNombre);
	}
	
}
