
public class Tela {
	
	private int tamanho;
	private String cor;
	private TelaRegistro telaRegistro;
	
	public Tela() {
		
	}
	
	public Tela(int t, String s) {
		setTamanho(t);
		setCor(s);
	}
	
	protected Tela setTamanho(int t) {
		this.tamanho = t;
		return this;
	}
	
	protected int getTamanho() {
		return this.tamanho;
	}
	
	protected Tela setCor(String s) {
		this.cor = s;
		return this;
	}
	
	protected String getCor() {
		return this.cor;
	}
	
	protected Tela setTelaRegistro(String s, int i, float f) {
		this.telaRegistro = new TelaRegistro(s, i, f);
		return this;
	}
	
	protected TelaRegistro getTelaRegistro() {
		return this.telaRegistro;
	}
	
	public String toString() {
		return "" + getClass();
	}

}
