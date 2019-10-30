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
}
