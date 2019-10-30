package Interactor;

import Exceptions.EquipoIncompletoException;
import Model.Equipo;
import Repositorio.IRepositorioCrearEquipo;

public class CrearEquipoUseCase {
	
	private IRepositorioCrearEquipo iRepositorioCrearEquipo;
	
	public CrearEquipoUseCase(IRepositorioCrearEquipo iRepositorioCrearEquipo) {
		this.iRepositorioCrearEquipo = iRepositorioCrearEquipo;
	}
	
	public boolean crearEquipo(Equipo equipoNuevo) throws EquipoIncompletoException{
		if(Equipo.instancia(equipoNuevo.getId(),equipoNuevo.getNombre(), null) != null) {
			return true;
		}
		throw new EquipoIncompletoException();
	}
		
	
}
