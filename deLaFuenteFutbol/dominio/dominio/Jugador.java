package dominio;

import dominio.excepciones.ExceptionPersona;

public class Jugador extends Persona{
	
	private Puesto miPuesto;
	
	public Jugador(String apellidoYNombre, String dni, Puesto p) throws ExceptionPersona  {
		super(apellidoYNombre,dni);
		this.miPuesto = p;
	}
	
	public Puesto getMiPuesto() {
		return this.miPuesto;
	}

	
}
