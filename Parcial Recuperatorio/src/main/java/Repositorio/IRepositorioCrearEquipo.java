package Repositorio;

import Model.Equipo;

public interface IRepositorioCrearEquipo {
	public Equipo findByNombre(String elNombre);
	public boolean guardar(Equipo equipoNuevo);
}
