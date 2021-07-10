
public class Supermercado {
	
	private String nome;
	private Cliente clientes[] = new Cliente[3];
	
	public Supermercado() {
		
	}
	
	public Supermercado(String s) {
		setNome(s);
	}
	
	public Supermercado setNome(String n) {
		this.nome = n;
		
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void cadastraCliente(int i, String n) {
		clientes[i] = new Cliente(n);		
	}
	
	public Cliente getCliente(int i) {
		return this.clientes[i];
	}
	
	public void limpaClientes() {
		for(int i = 0; i < 3; i++)
			this.clientes[i] = null;
	}
	
	public String toString() {
		return this.nome;
	}

}
