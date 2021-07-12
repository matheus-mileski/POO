
public class TelaRegistro extends TelaConsulta {
	
	private int id;
	private String nome;
	
	public TelaRegistro() {
		
	}

	public TelaRegistro(String s, int i, float f) {
		setNome(s);
		setId(i);
		setPreco(f);
	}

	protected TelaRegistro setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected TelaRegistro setId(int id) {
		this.id = id;
		return this;
	}
	
	protected int getId() {
		return this.id;
	}
	
	public String toString() {
		return getId() + "\t" + getNome() + "\t" + getPreco();
	}
	
	
}
