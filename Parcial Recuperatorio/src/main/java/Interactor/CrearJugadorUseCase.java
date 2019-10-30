package Interactor;

import Exceptions.JugadorExisteException;
import Exceptions.JugadorIncompletoException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;

public class CrearJugadorUseCase {
	
	private IRepositorioCrearJugador iRepositorioCrearJugador;
	
	public CrearJugadorUseCase(IRepositorioCrearJugador iRepositorioCrearJugador) {
		this.iRepositorioCrearJugador = iRepositorioCrearJugador;
	}
	
	public boolean crearJugador(Jugador jN) throws JugadorIncompletoException, JugadorExisteException {
		if(jN.getDocumento() )
		throw new JugadorIncompletoException();
		if(Jugador.instancia(null, jN.getNombre(), jN.getFechaNacimiento(), jN.getEstatura(), jN.getDocumento()) != null){
			if()
		}
		
	}
}
