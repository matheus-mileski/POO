
public class StartupA extends EmpresaPesquisa {
	
	protected String tipoAtividade;
	protected float capitalInicial;
	
	public StartupA() {

	}
	
	public StartupA(String s) {
		super(s);
	}
	
	public StartupA(String nome, 
			String cnpj, 
			String razao, 
			String atv,
			float f) {
		super(nome);
		this.setTipoAtividade(atv);
		this.setCapitalInicial(f);
		this.setCNPJ(cnpj);
		this.setRazaoSocial(razao);
	}
	
	protected StartupA setTipoAtividade(String s) {
		this.tipoAtividade = s;
		return this;
	}
	
	protected StartupA setCapitalInicial(float f) {
		this.capitalInicial = f;
		return this;
	}

	public String toString() {
		return "StartupA (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tPesquisa: " + getPesquisa()
				+ "\n\tPesquisadores: " + getPesquisadores();
	}

}
