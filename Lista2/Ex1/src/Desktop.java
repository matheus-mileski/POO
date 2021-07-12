
public class Desktop extends Computador {

	public Desktop() {
		
	}
	
	public Desktop(String n) {
		super(n);
	}
	
	public String toString() {
		return "Desktop\n"
				+ "\tNome: " + getNome()
				+ "\n\tModelo: " + getModelo()
				+ "\n\tData Compra: " + getDataCompra();
	}

}
