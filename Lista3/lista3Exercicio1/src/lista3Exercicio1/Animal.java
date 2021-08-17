package lista3Exercicio1;

public abstract class Animal {
	
	protected String nome; 
	protected String pais; 
	protected float velocidade; 
	protected int idade; 
	
	public Animal() {
		
	}
	
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public abstract String getNome();
	
	public abstract String getPais();

	public abstract float getVelocidade();

	public abstract int getIdade();

	
	public String toString() {
        return this.getNome()+"";
	}


}
