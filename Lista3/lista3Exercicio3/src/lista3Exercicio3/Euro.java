package lista3Exercicio3;

public class Euro implements ConversorMoedaInterface {
	
	private int qtdPaises;
	private float carteira;
	
	public Euro() {
		this.qtdPaises = 19;
		this.carteira = 1;
	}
	
	public Euro(float c) {
		this.qtdPaises = 19;
		this.carteira = c;
	}
	
	public int getQtdpaises() {
		return this.qtdPaises;
	}
	
	public float getCarteira() {
		return this.carteira;
	}

	public float getConversaoDolar() {
		return getCarteira() * 1.18f;
	}
	
	public String toString() {
		return "Euro €";
	}
	
}
