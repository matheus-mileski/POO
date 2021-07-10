
public class Empregado {
	
	private String nome;
	private float salario;
	
	public Empregado() {

	}

	public Empregado(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public float venda() {
		return 100.0f;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getSalario() {
		return this.salario;
	}

}
