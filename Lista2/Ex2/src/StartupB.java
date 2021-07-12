
public class StartupB extends EmpresaPesquisa {

	public StartupB() {
		
	}
	
	public StartupB(String s) {
		super(s);
	}
	
	public String toString() {
		return "StartupB (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tPesquisa: " + getPesquisa()
				+ "\n\tPesquisadores: " + getPesquisadores();
	}

}
