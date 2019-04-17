package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Cargo;
import dominio.Entrenador;
import dominio.Jugador;
import dominio.Persona;
import dominio.Puesto;
import dominio.excepciones.ExceptionPersona;

class JugadorEntrenadorTest {

	@Test
	void testJugadorEntrenador()  {
		try {
			Persona p = new Jugador("Luis D.","12345678",Puesto.Arquero);
			Jugador j = (Jugador) p;
			assertEquals(Puesto.Arquero,j.getMiPuesto());
			
			p = new Jugador("Luis D.","12345678",Puesto.Defensor);
			j = (Jugador) p;
			assertEquals(Puesto.Defensor,j.getMiPuesto());
			
			p = new Jugador("Luis D.","12345678",Puesto.Delantero);
			j = (Jugador) p;
			assertEquals(Puesto.Delantero,j.getMiPuesto());
			
			
			p = new Entrenador("Luis D.","12345678",Cargo.PrimerEntrenador);
			Entrenador e = (Entrenador) p;
			assertEquals(Cargo.PrimerEntrenador,e.getMiCargo());
			
			p = new Entrenador("Luis D.","12345678",Cargo.SegundoEntrenador);
			e = (Entrenador) p;
			assertEquals(Cargo.SegundoEntrenador,e.getMiCargo());
			
			p = new Entrenador("Luis D.","12345678",Cargo.Ayudante);
			e = (Entrenador) p;
			assertEquals(Cargo.Ayudante,e.getMiCargo());
			
		}catch(ExceptionPersona ex) {
			fail("ExceptionPersona No Esperada.");
		}
	}

}
