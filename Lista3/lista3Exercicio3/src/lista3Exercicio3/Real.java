package lista3Exercicio3;

public class Real implements ConversorMoedaInterface {
	
	private int criacao;
	private float carteira;
	
	public Real() {
		this.criacao = 1994;
		this.carteira = 1;
	}
	
	public Real(float c) {
		this.criacao = 1994;
		this.carteira = c;
	}
	
	public int getCriacao() {
		return this.criacao;
	}
	
	public float getCarteira() {
		return this.carteira;
	}

	public float getConversaoDolar() {
		return getCarteira() * 0.19f;
	}
	
	public String toString() {
		return "Real R$";
	}

}
