
public class StartupC extends EmpresaInovacao {

	public StartupC() {
		
	}
	
	public StartupC(String s) {
		super(s);
	}
	
	public StartupC(String s, String inovacao, String tipo) {
		setNome(s);
		
		this.nomeInovacao = inovacao;
		this.tipoInovacao = tipo;
		
	}

	public String toString() {
		return "StartupC (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tProduto: " + getProduto()
				+ "\n\tDesenvolvedores: " + getDesenvolvedores()
				+ "\n" + this.nomeInovacao 
				+ "\n" + this.tipoInovacao;
	}

}
