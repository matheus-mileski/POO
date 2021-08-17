
public class Sinalizacao {
	
	private String nome;
	private String data;
	private String local;
	
	public Sinalizacao() {
		// TODO Auto-generated constructor stub
	}
	
	protected Sinalizacao setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	protected Sinalizacao setData(String data) {
		this.data = data;
		return this;
	}
	
	protected Sinalizacao setLocal(String local) {
		this.local = local;
		return this;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected String getData() {
		return this.data;
	}
	
	protected String getLocal() {
		return this.local;
	}

}
