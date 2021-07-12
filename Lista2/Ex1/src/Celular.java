
public class Celular extends Computador {

	public Celular() {
		
	}
	
	public Celular(String n) {
		super(n);
	}
	
	public String toString() {
		return "Celular\n"
				+ "\tNome: " + getNome()
				+ "\n\tModelo: " + getModelo()
				+ "\n\tData Compra: " + getDataCompra();
	}

}
