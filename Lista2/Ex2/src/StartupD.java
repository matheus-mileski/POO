
public class StartupD extends EmpresaInovacao {

	public StartupD() {
		
	}
	
	public StartupD(String s) {
		super(s);
	}
	
	public String toString() {
		return "StartupD (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tProduto: " + getProduto()
				+ "\n\tDesenvolvedores: " + getDesenvolvedores();
	}

}
