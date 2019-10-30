package Model;



import java.util.ArrayList;
import java.util.Collection;

import Exceptions.EquipoIncompletoException;
import Exceptions.JugadorAsignadoException;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Collection<Jugador> jugadores;
	
    public Equipo(Integer idEquipo, String nombre) {
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		jugadores = new ArrayList<Jugador>();
	}
    
    public static Equipo instancia(Integer idEquipo, String nombre, ArrayList<Jugador> jugadores) throws EquipoIncompletoException {
    	if(nombre == null)
    		throw new EquipoIncompletoException();
    	return new Equipo(idEquipo, nombre);
    }
   
    public boolean asignarJugador(Jugador elJugador) throws JugadorAsignadoException {
    	if(jugadores.contains(elJugador))
    		throw new JugadorAsignadoException();
    	return jugadores.add(elJugador);
    }
}
