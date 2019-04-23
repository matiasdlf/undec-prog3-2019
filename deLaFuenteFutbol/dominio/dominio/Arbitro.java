package dominio;

import dominio.excepciones.ExceptionPersona;

public class Arbitro extends Persona{
	private RolArbitro miRol;
	
	public Arbitro(String apellidoYNombre, String dni, RolArbitro r) throws ExceptionPersona{
		super(apellidoYNombre, dni);
		this.miRol = r;
	}

	public RolArbitro getMiRol() {
		return miRol;
	}

	public void setMiRol(RolArbitro miRol) {
		this.miRol = miRol;
	}
	
	
}
