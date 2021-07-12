
public class EmpresaPesquisa extends Incubadora {
	
	private String pesquisa;
	private int pesquisadores;
	
	private String cnpj;
	private String razaoSocial;
	
	public EmpresaPesquisa() {
		
	}
	
	public EmpresaPesquisa(String n) {
		super(n);
	}
	
	public String toString() {
		return "EmpresaPesquisa";
	}
	
	protected EmpresaPesquisa setPesquisa(String s) {
		this.pesquisa = s;
		return this;
	}
	
	protected String getPesquisa() {
		return this.pesquisa;
	}
	
	protected EmpresaPesquisa setPesquisadores(int n) {
		this.pesquisadores = n;
		return this;
	}
	
	protected int getPesquisadores() {
		return this.pesquisadores;
	}
	
	protected EmpresaPesquisa setCNPJ(String s) {
		this.cnpj = s;
		return this;
	}
	
	protected String getCNPJ() {
		return this.cnpj;
	}
	
	protected EmpresaPesquisa setRazaoSocial(String s) {
		this.razaoSocial = s;
		return this;
	}
	
	protected String getRazaoSocial() {
		return this.razaoSocial;
	}
	

}
