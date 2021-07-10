
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Pendulo p = new Pendulo();
		
		int loops = 27000; // numero de loops while, 27000 => A:0    B:0    C:0
		
		while(loops>0) {
			p.setPendulo();
			System.out.println(p.getPendulo());
			loops--;
		}

	}

}
