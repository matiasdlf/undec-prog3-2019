package dominio;

import java.security.GeneralSecurityException;

@SuppressWarnings("unused")
public class Gestor {
	private static Gestor g;
	
	private Gestor() {
		
	}
	
	public static Gestor getInstancia() {
		if(g == null) {
			return g= new Gestor();
		}else
			return g;
	}
}
