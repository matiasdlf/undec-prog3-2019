package paquete00;

public class Asiento {
	Integer idAsiento;
	String numeroAsiento;
	
	public Asiento(Integer idAsiento, String numeroAsiento) {
		this.idAsiento = idAsiento;
		this.numeroAsiento = numeroAsiento;
	}

	public Integer getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(Integer idAsiento) {
		this.idAsiento = idAsiento;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	
}
