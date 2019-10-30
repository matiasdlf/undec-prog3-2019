package Model;



import java.time.LocalDate;
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

	public Integer getId() {
		return idEquipo;
	}
	
    public String getNombre() {
		return nombre;
	}

	public Collection<Jugador> getJugadores() {
		return jugadores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Equipo other = (Equipo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public double obtenerPromedioEdad() {
		double suma= 0;
		for (Jugador jugador : jugadores) {
			suma+= jugador.getEdad();		
		}
		return suma/jugadores.size();
	}
    
}
