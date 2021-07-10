import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Fila f1[] = new Fila[5];
		String s;
		int d, m, a;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Item " + (i+1));
			System.out.print("\tNome: ");
			s = entrada.next();
			System.out.print("\tData: ");
			d = entrada.nextInt();
			System.out.print("\tMes: ");
			m = entrada.nextInt();
			System.out.print("\tAno: ");
			a = entrada.nextInt();
			
			f1[i] = new Fila();
			f1[i].setNome(s).setData(d, m, a);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(f1[i]);
			f1[i] = null;
		}
		
		System.gc();
		
		entrada.close();
		
	}

}
