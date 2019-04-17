package dominio.excepciones;

@SuppressWarnings("serial")
public class ExceptionPersonaNombreNulo extends ExceptionPersona {
	public ExceptionPersonaNombreNulo() {
		super("El nombre la persona no debe ser nulo");
	}
}
