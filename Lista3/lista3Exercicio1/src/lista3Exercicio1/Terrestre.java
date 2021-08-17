package lista3Exercicio1;

public abstract class Terrestre extends Animal {
	
	protected String quantidadePelos;
	
	public Terrestre() {

	}
	
	public Terrestre(String nome) {
		super(nome);
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getPelos() {
		return this.quantidadePelos;
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
        return this.getNome()+"\n" + "Pelos: " + this.getPelos() + "\t Pais Origem: " 
        		+ this.getPais() + "\t IdadeMedia: " + this.getIdade() + "\t VelocidadeMedia: " + this.getVelocidade();
	}

}
