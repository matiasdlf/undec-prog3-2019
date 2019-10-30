package Repositorio;

import Model.Equipo;
import Model.Jugador;

public interface IRepositorioAsignarJugador {
	public boolean AsignarJugadorUseCase(Jugador elJugador, Equipo elEquipo);
	public boolean findByDNI();
}
