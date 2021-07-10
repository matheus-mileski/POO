
public class Computador {
	
	private String marca;
	
	public Computador() {

	}
	
	public Computador(String marca) {
		this.marca = marca; 
	}
	
	public String toString() {
		return "Computador";
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarcaComp(String marca) {
		this.marca = marca;
	}

}
