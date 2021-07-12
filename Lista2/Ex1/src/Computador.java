
public class Computador {

	private String nome;
	private String modelo;
	private DataCompra dataCompra; 
	
	public Computador() {
		
	}
	
	public Computador(String n) {
		setNome(n);
	}
	
	public Computador setNome(String n) {
		this.nome = n;
		return this;
	}
	
	public Computador setModelo(String n) {
		this.modelo = n;
		return this;
	}
	
	public Computador setDataCompra(int d, int m, int a) {
		this.dataCompra = new DataCompra(d, m , a);
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public DataCompra getDataCompra() {
		return this.dataCompra;
	}

}
