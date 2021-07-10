
public class Celular extends Computador {
	
	private float valor;
	
	public Celular() {

	}
	
	public Celular(String marca, float valor) {
		super(marca);
		this.valor = valor;
	}
	
	public Celular setMarca(String marca) {
		setMarcaComp(marca);
		return this;
	}
	
	public Celular setPreco(float valor) {
		this.valor = valor;
		return this;
	}
	
	public String toString(){
		return "Celular" +
				"\nMarca: " + getMarca() +
				"\nPreco: " + this.valor;
				
	}

}
