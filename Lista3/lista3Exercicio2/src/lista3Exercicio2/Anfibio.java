package lista3Exercicio2;

public abstract class Anfibio implements Animal {
	
	protected String quantidadeEscamas;
	protected String nome;
	protected String pais;
	protected float comprimento;
	protected float velocidade;
	protected int idade;
	
	public Anfibio() {

	}
	
	public Anfibio(String nome) {
		this.nome = nome;
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
	
	public float getComprimento() {
		return this.comprimento;
	}
	
	public String toString() {
        return this.getNome()+"\n" + "Escamas: " + this.getEscamas()+ "\t Pais Origem: " 
        		+ this.getPais() + "\t IdadeMedia: " + this.getIdade() + "\t VelocidadeMedia: " + this.getVelocidade() 
        		+ "\t ComprimentoMedio: " + this.getComprimento();
	}


}
