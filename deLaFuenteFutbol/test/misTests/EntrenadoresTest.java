package misTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Cargo;
import dominio.Entrenador;
import dominio.Equipo;
import dominio.excepciones.ExceptionPersona;

class EntrenadoresTest {

	@Test
	void testEntrenadoresPrincipales() throws ExceptionPersona {
		Equipo e= new Equipo("Nadis Team");
		Entrenador pr1= new Entrenador("Carlos","0303456", Cargo.PrimerEntrenador);
		Entrenador se1= new Entrenador("Pablo","0303457", Cargo.SegundoEntrenador);
		Entrenador se2= new Entrenador("Aurelio","0303458", Cargo.SegundoEntrenador);
		Entrenador pr2= new Entrenador("Carlos","0303456", Cargo.PrimerEntrenador);
		
		e.addEntrenador(pr1.getApellidoYNombre(), pr1.getDni(), pr1.getMiCargo());
		e.addEntrenador(pr2.getApellidoYNombre(), pr2.getDni(), pr2.getMiCargo());
		e.addEntrenador(se1.getApellidoYNombre(), se1.getDni(), se1.getMiCargo());
		e.addEntrenador(se2.getApellidoYNombre(), se2.getDni(), se2.getMiCargo());
		
		assertEquals(3, e.getCantidadDeEntrenadores());
	}

}
