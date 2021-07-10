
public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		Celular celular = new Celular("Motorola", 500.0f);
		
		celular.setMarca("Samsung").setPreco(1000.0f);
		
		System.out.println(celular);
	}

}
