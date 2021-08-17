
public class Placa extends Sinalizacao{
	
	private String tipo;
	protected String material;
	
	public Placa() {
		// TODO Auto-generated constructor stub
	}
	
	public Placa(String nome, String data, String local, String tipo) {
		setNome(nome);
		setData(data);
		setLocal(local);
		setTipo(tipo);
	}
	
	protected Placa setTipo(String tipo){
		this.tipo = tipo;
		return this;
	}
	
	protected String getTipo(){
		return this.tipo;
	}
	
	protected Placa setMaterial(String material){
		this.material = material;
		return this;
	}
	
	public String toString() {
		return "Nome Placa: " + getNome() +
				"\nData: " + getData() +
				"\nLocal: " + getLocal() +
				"\nTipo: " + getTipo();
	}

}
