
public class Estagiario extends Empregado {
	
	private int id;
	
	public Estagiario() {

	}
	
	public Estagiario(int id, String nome, float salario) {
		super(nome, salario);
		this.id = id;
	}
	
	public int atendimento() {
		return 10;
	}
	
	public String toString() {
		return  "\nNome: " + getNome() +
				"\nSalario: " + getSalario() +
				"\nid: " + this.id;
	}
	
}
