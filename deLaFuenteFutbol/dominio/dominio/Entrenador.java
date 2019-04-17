package dominio;

import dominio.excepciones.ExceptionPersona;

public class Entrenador extends Persona{

	private Cargo miCargo;
	
	public Entrenador(String apellidoYNombre, String dni, Cargo c) throws ExceptionPersona  {
		super(apellidoYNombre, dni);
		this.miCargo= c;
	}
	
	public Cargo getMiCargo() {
		return this.miCargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((miCargo == null) ? 0 : miCargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrenador other = (Entrenador) obj;
		if (miCargo != other.miCargo)
			return false;
		return true;
	}
	
	
}
