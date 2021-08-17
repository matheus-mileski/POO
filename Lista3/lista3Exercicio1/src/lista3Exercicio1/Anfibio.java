package lista3Exercicio1;

public abstract class Anfibio extends Animal {
	
	protected String quantidadeEscamas;
	
	public Anfibio() {

	}
	
	public Anfibio(String nome) {
		super(nome);
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getEscamas() {
		return this.quantidadeEscamas;
	}
	
	public String getPais() {
		return this.pais;
	}

	
	public float getVelocidade() {
		return this.velocidade;
	}

	
	public int getIdade() {
		return this.idade;
	}
	
	public String toString() {
        return this.getNome()+"\n" + "Escamas: " + this.getEscamas()+ "\t Pais Origem: " 
        		+ this.getPais() + "\t IdadeMedia: " + this.getIdade() + "\t VelocidadeMedia: " + this.getVelocidade();
	}

}
