
public class Caixa {
	
	private Validador val;
	private float saldo;
	private int hora;
	private float limite = 1000.0f;
	private String tipoConta = "Conta Corrente";
	
	public Caixa() {
		
	}
	
	public Caixa(String conta, String senha) {
		this.val = new Validador(conta, senha);
		setSaldo(0.0f);
	}
	
	public Caixa(String conta, String senha, float entradaDeposito) {
		this.val = new Validador(conta, senha);
		setSaldo(entradaDeposito);
	}
	
	public Caixa(String conta, String senha, float entradaSaque, int h) {
		this.val = new Validador(conta, senha);
		setSaldo(-entradaSaque);
		setHora(h);
	}
	
	public Caixa setSaldo(float saldo) {
		if(this.val.getAcesso() == true) {
			this.saldo += saldo;
			return this;
		}
		return null;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public Caixa setDeposito(float saldo) {
		setSaldo(saldo);
		return this;
	}
	
	public Caixa setSaque(float saldo) {
		setSaldo(-saldo);
		return this;
	}
	
	public Caixa setHora() {
		this.hora = 0;
		return this;
	}
	
//	sobrecarga acessor
	public Caixa setHora(int h) {
		this.hora = h;
		return this;
	}
	
	public int getHora() {
		return this.hora;
	}
	
//	sobrecarga mutador
	public int getHora(Boolean am) {
		if(this.hora>12)
			return this.hora - 12;
		else
			return this.hora;
	}
	
	public Boolean getAcesso() {
		return this.val.getAcesso();
	}
	
	public float getLimite() {
		return this.limite;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}
	
	public String toString() {
		return "Conta: " + this.val.getConta() +
				"\t Saldo: R$ " + this.saldo +
				"\nTipo de Conta: " + this.tipoConta + "\tLimite: R$ " + this.limite;
	}
	
}
