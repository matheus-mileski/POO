
public class Fila {
	
	private String nome;
	private Data data;
	
	public Fila() {
		
	}
	
	public Fila(String n, int d, int m, int a) {
		setNome(n);
		setData(d, m, a);
	}
	
	public Fila setNome(String n) {
		this.nome = n;
		
		return this;
	}
	
	public Fila setData(int d, int m, int a) {
		this.data = new Data(d, m, a);
		
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
		
	public Data getData() {
		return this.data;
	}
	
	public String toString() {
		return this.nome + " | " + this.data;
	}

}
