
public class StartupA1 extends StartupA {
		
	public StartupA1() {
		// TODO Auto-generated constructor stub
	}
	
	public StartupA1(String nome, 
			String cnpj, 
			String razao, 
			String atv,
			float f) {
		super(nome, cnpj, razao, atv, f);
	}
	
	private String getTipoAtividade() {
		return this.tipoAtividade;
	}
	
	private float getCapitalInicial() {
		return this.capitalInicial;
	}
	
	public String toString() {
		return "Empresa\n"
				+ "\tNome: " + getNome() + "\n"
				+ "\tCNPJ: " + getCNPJ() + "\n"
				+ "\tRazao Social: " + getRazaoSocial() + "\n"
				+ "\tTipo Atividade: " + getTipoAtividade() + "\n"
				+ "\tCapital Inicial: R$ " + getCapitalInicial();
	}

}
