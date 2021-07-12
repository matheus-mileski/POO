
public class EmpresaInovacao extends Incubadora {
	
	private String produto;
	private int desenvolvedores;
	
	protected String nomeInovacao;
	protected String tipoInovacao;
	
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
	
	protected EmpresaInovacao setNomeInovacao(String s) {
		this.nomeInovacao = s;
		return this;
	}
	
	protected EmpresaInovacao setTipoInovacao(String s) {
		this.tipoInovacao = s;
		return this;
	}

}
