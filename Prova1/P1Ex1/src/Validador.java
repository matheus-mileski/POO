
public class Validador {
	
	private String conta = "012345-6";
	private String senha = "abcdef";
	private Boolean acesso;
	
	public Validador() {
		
	}
	
	public Validador(String conta, String senha) {
		setAcesso(conta, senha);
	}
	
	public Validador setAcesso(String conta, String senha) {
		if(conta == this.conta && senha == this.senha) {
			this.acesso = true;
		}else {
			System.out.println("Conta ou senha incorretos");
			this.acesso = false;
		}
		return this;
	}
	
	public Boolean getAcesso() {
		return this.acesso;
	}
	
	public String getConta() {
		return this.conta;
	}

}
