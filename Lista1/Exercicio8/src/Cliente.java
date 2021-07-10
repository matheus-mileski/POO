
public class Cliente {
	
	private String nome;
	private Data dataNascimento;
	
	public Cliente() {
		
	}
	
	public Cliente(String n, int d, int m, int a) {
		setNome(n);
		setDataNascimento(d, m, a);
	}
	
	public Cliente setNome(String n) {
		this.nome = n;
		
		return this;
	}
	
	public Cliente setDataNascimento(int d, int m, int a) {
		this.dataNascimento = new Data(d, m, a);
		
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
		
	public Data getData() {
		return this.dataNascimento;
	}
	
	public String toString() {
		return this.nome + " | " + this.dataNascimento;
	}

}
