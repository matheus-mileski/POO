
public class EmpresaPesquisa extends Incubadora {
	
	private String pesquisa;
	private int pesquisadores;
	
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
	

}
