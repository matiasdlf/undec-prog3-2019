package gestores;

import java.util.ArrayList;
import java.util.List;

import dominio.Producto;
import paquete00.Aeropuerto;

public class GestorAeropuerto {
	List<Aeropuerto> listaAeropuerto = new ArrayList<Aeropuerto>();
	static private GestorAeropuerto ga;
	
	private GestorAeropuerto(ArrayList<Aeropuerto> arrayList) {
		listaAeropuerto= arrayList;
	}
	
	static public GestorAeropuerto getInstance() {
		if (ga == null) {
			ga = new GestorAeropuerto(new ArrayList<Aeropuerto>());
		}
		return ga;
	}

	public boolean createAeropuerto(Aeropuerto p) {
		return listaAeropuerto.add(p);
	}

	public boolean traerUno(Integer i) {
		int contador = 0;
		for (Aeropuerto a : listaAeropuerto) {
			if (a.getCodigo().equals(i)) {
				break;
			}
			return false;
		}	
		return true;
	}
	
}
