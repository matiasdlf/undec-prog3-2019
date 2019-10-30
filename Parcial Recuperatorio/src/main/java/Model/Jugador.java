package Model;

import java.time.LocalDate;

import Exceptions.JugadorIncompletoException;

public class Jugador {


    private Integer idJugador;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double estatura;
    private String documento;
	
    public Jugador(Integer idJugador, String nombre, LocalDate fechaNacimiento, double estatura, String documento) {
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.estatura = estatura;
		this.documento = documento;
	}
    
    public static Jugador instancia(Integer idJugador, String nombre, LocalDate fechaNacimiento, double estatura, String documento) throws JugadorIncompletoException {
    	if(documento == null || nombre == null || fechaNacimiento == null || estatura == 0)
    		throw new JugadorIncompletoException();
    	return new Jugador(idJugador, nombre, fechaNacimiento, estatura, documento);
    }

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getEstatura() {
		return estatura;
	}

	public String getDocumento() {
		return documento;
	}
	
	public double getEdad() {
		return LocalDate.now().getYear()-this.getFechaNacimiento().getYear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		return true;
	}
    
}
