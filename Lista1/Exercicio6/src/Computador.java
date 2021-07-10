
public class Computador {

	private String nome;
	private String marca;
	private Data data;
	
	public Computador() {
		
	}
	
	public Computador(String nome, String marca, int d, int m, int a) {
		setNome(nome);
		setMarca(marca);
		setData(d, m , a);
	}
	
	public Computador setNome(String n) {
		this.nome = n;
		
		return this;
	}
	
	public Computador setMarca(String m) {
		this.marca = m;
		
		return this;
	}
	
	public Computador setData(int d, int m, int a) {
		this.data = new Data(d, m, a);
		
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public Data getData() {
		return this.data;
	}
	
	public String toString() {
		return this.nome + " | " + this.marca + " | " + this.data;
	}

}
