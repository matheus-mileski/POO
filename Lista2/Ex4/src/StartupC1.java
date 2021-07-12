
public class StartupC1 extends StartupC {

	public StartupC1() {
		// TODO Auto-generated constructor stub
	}
	
	public StartupC1(String nome, String nomeInovacao, String tipoInovacao) {
		super(nome, nomeInovacao, tipoInovacao);
	}
	
	private String getNomeInovacao() {
		return this.nomeInovacao;
	}
	
	private String getTipoInovacao() {
		return this.tipoInovacao;
	}
	
	public String toString() {
		return "Empresa\n"
				+ "\tNome: " + getNome() + "\n"
				+ "\tNome Inovacao: " + getNomeInovacao() + "\n"
				+ "\tTipo Inovacao: " + getTipoInovacao() + "\n";
	}

}
