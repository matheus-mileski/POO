
public class Principal {

	public static void main(String[] args) {
		
		Supermercado sm = new Supermercado("Supermercado Nome Antigo");
		System.out.println(sm.getNome());
		sm.setNome("Supermercado Nome Novo");
		
		for(int i = 0; i < 3; i++) {
			sm.cadastraCliente(i, "Cliente " + (i+1));
		}
		
		System.out.println(sm.getNome());
		for(int i = 0; i < 3; i++) {
			System.out.println(sm.getCliente(i));
		}
		
		sm.limpaClientes();
		
		System.gc();
				
	}
	

}
