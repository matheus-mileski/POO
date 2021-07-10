import java.util.Random;

public class Cliente {
	
	private String nome;
	private int cod;
	private Random r = new Random();
	
	public Cliente() {
		this.cod = this.r.nextInt(999) + 1;
	}
	
	public Cliente(String n) {
		setNome(n);
		this.cod = this.r.nextInt(999) + 1;
	}
	
	public Cliente setNome(String n) {
		this.nome = n;
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCod() {
		return this.cod;
	}
	
	public String toString() {
		return this.nome + " | " + this.cod;
	}

}
