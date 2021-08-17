package lista3Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Sapo s = new Sapo( );
		Rã r = new Rã( );
		Leão l = new Leão( );
		Macaco m = new Macaco( );
		Animal [ ] a = { s, r, l, m };
		
		for( Animal item : a )
            System.out.println(item);


	}

}
