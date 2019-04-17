package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dominio.excepciones.ExceptionPersona;

public class Equipo {
	
	private List<Jugador> misJugadores;
	private List<Entrenador> misEntrenadores;
	private final String nombre;
	private final int MAX_CANTIDAD_JUGADORES;
	private final int MAX_CANTIDAD_ENTRENADORES;
	
	public Equipo (String pNombre) {
		MAX_CANTIDAD_JUGADORES= 6;
		MAX_CANTIDAD_ENTRENADORES= 4;
		this.nombre= pNombre.toUpperCase();
		misJugadores = new ArrayList<Jugador>();
		misEntrenadores = new ArrayList<Entrenador>();
	}
	
	public Equipo () {
		MAX_CANTIDAD_JUGADORES= 6;
		MAX_CANTIDAD_ENTRENADORES= 4;
		this.nombre= "SIN NOMBRE";
		misJugadores = new ArrayList<Jugador>();
		misEntrenadores = new ArrayList<Entrenador>();
	}
	
	public String getNombre() {
		if(this.nombre.length() > 12) {
			return this.nombre.substring(0, 12);
		}else {
			return this.nombre;
		}
	}
	
	public List<Jugador> getMisJugadores() {
		Collections.sort(misJugadores);
		return misJugadores;
	}
	
	public List<Entrenador> getMisEntrenadores() {
		Collections.sort(misEntrenadores);
		return misEntrenadores;
	}
	
	public int getCantidadDeJugadores() {
		if(this.misJugadores == null) {
			return 0;
		}else {
			return misJugadores.size();
		}
	}
	
	public int getCantidadDeEntrenadores() {
		if(this.misEntrenadores == null) {
			return 0;
		}else {
			return misEntrenadores.size();
		}
	}
	
	public boolean addJugador(String nombre, String dni, Puesto p) throws ExceptionPersona {
		if(misJugadores.size() < MAX_CANTIDAD_JUGADORES) {
			Jugador j = new Jugador(nombre, dni, p);
			if(misJugadores.contains(j)) {
				return false;
			}else {
				return misJugadores.add(j);
			}
		}
		return false;
	}
	
	public boolean addEntrenador(String nombre, String dni, Cargo c) throws ExceptionPersona {

		if(misEntrenadores.size() < MAX_CANTIDAD_ENTRENADORES) {
			Entrenador dt = new Entrenador(nombre, dni, c);
			if(misEntrenadores.contains(dt)) {
				if(c.equals(Cargo.PrimerEntrenador))
					return false;
			}else
				return misEntrenadores.add(dt);
		}	
		return false;
	}
	
	public List<Jugador> getJugadores(Puesto p) {
		List<Jugador> listaJ = new ArrayList<Jugador>();
		for(Jugador j:misJugadores) {
			if(j.getMiPuesto().equals(p)) {
				listaJ.add(j);
			}
		}
		
		Collections.sort(listaJ);
		return listaJ;
	}
	
	public List<Entrenador> getEntrenadores(Cargo c) {
		List<Entrenador> listaDT = new ArrayList<Entrenador>();
		for(Entrenador dt:misEntrenadores) {
			if(dt.getMiCargo().equals(c)) {
				listaDT.add(dt);
			}
		}
		
		Collections.sort(listaDT);
		return listaDT;
	}
	
	public List<Jugador> getJugadores(String parteDelNombre) {
		List<Jugador> listaJ = new ArrayList<Jugador>();
		for(Jugador j:misJugadores) {
			if(j.getApellidoYNombre().contains(parteDelNombre)) {
				listaJ.add(j);
			}
		}
		Collections.sort(listaJ);
		return listaJ;
	}
	
	public List<Entrenador> getEntrenadores(String parteDelNombre) {
		List<Entrenador> listaDT = new ArrayList<Entrenador>();
		for(Entrenador dt:misEntrenadores) {
			if(dt.getApellidoYNombre().contains(parteDelNombre)) {
				listaDT.add(dt);
			}
		}
		Collections.sort(listaDT);
		return listaDT;
	}

	@Override
	public String toString() {
		return "Resumen Equipo: "+getJugadores(Puesto.Arquero).size()+" Arqueros - "
								 +getJugadores(Puesto.Defensor).size()+" Defensores - "
								 +getJugadores(Puesto.Delantero).size()+" Delanteros";
	}
	
}
