package Repositorio;

import Model.Jugador;

public interface IRepositorioCrearJugador {
	Jugador findByDocumento(String documento);
	boolean guardar(Jugador elJugador);
}
