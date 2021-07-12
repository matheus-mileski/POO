
public class Principal {

	public static void main(String[] args) {
		Tela tela = new Tela(100, "azul");
		System.out.println(tela.setTelaRegistro("Banana", 1, 3.5f));
		System.out.println(tela.getTelaRegistro().getPreco());
	}

}
