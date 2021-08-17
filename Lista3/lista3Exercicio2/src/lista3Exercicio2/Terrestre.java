package lista3Exercicio2;

public abstract class Terrestre implements Animal {
	
	protected String quantidadePelos;
	protected String nome;
	protected String pais;
	protected float comprimento;
	protected float velocidade;
	protected int idade;
	
	public Terrestre() {

	}
	
	public Terrestre(String nome) {
		this.nome = nome;
	}
	
	public String getPelos() {
		return this.quantidadePelos;
	}
	
	public String getNome() {
		return nome;
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
        return this.getNome()+"\n" + "Escamas: " + this.getPelos()+ "\t Pais Origem: " 
        		+ this.getPais() + "\t IdadeMedia: " + this.getIdade() + "\t VelocidadeMedia: " + this.getVelocidade() 
        		+ "\t ComprimentoMedio: " + this.getComprimento();
	}


}
