
public class StartupA extends EmpresaPesquisa {

	public StartupA() {

	}
	
	public StartupA(String s) {
		super(s);
	}

	public String toString() {
		return "StartupA (" + getClass()
				+ ")\n\tNome: " + getNome()
				+ "\n\tPesquisa: " + getPesquisa()
				+ "\n\tPesquisadores: " + getPesquisadores();
	}

}
