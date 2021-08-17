package lista3Exercicio3;

public class BitCoin implements ConversorMoedaInterface {
	
	private String administracao;
	private float carteira;
	
	public BitCoin() {
		this.administracao = "Descentralizada";
		this.carteira = 1;
	}
	
	public String getAdministracao() {
		return this.administracao;
	}
	
	public float getCarteira() {
		return this.carteira;
	}

	public float getConversaoDolar() {
		return getCarteira() * 46520;
	}
	
	public String toString() {
		return "BitCoin ₿";
	}

}
