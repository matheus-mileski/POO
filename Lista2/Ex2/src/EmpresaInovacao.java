
public class EmpresaInovacao extends Incubadora {
	
	private String produto;
	private int desenvolvedores;
	
	public EmpresaInovacao() {
		
	}
	
	public EmpresaInovacao(String n) {
		super(n);
	}
	
	public String toString() {
		return "EmpresaInovacao";
	}
	
	protected EmpresaInovacao setProduto(String s) {
		this.produto = s;
		return this;
	}
	
	protected String getProduto() {
		return this.produto;
	}
	
	protected EmpresaInovacao setDesenvolvedores(int n) {
		this.desenvolvedores = n;
		return this;
	}
	
	protected int getDesenvolvedores() {
		return this.desenvolvedores;
	}

}
