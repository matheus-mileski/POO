
public class Incubadora {
	
	private String nome;
	
	public Incubadora() {

	}
	
	public Incubadora(String n) {
		setNome(n);
	}
	
	public String toString() {
		return "Incubadora";
	}
	
	public Incubadora setNome(String n) {
		this.nome = n;
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}

}
