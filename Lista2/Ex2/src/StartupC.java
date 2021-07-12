
public class StartupC extends EmpresaInovacao {

	public StartupC() {
		
	}
	
	public StartupC(String s) {
		super(s);
	}
	
	public String toString() {
		return "StartupC (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tProduto: " + getProduto()
				+ "\n\tDesenvolvedores: " + getDesenvolvedores();
	}

}
