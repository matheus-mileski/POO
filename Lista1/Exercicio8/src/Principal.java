import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c[] = new Cliente[5];
		String s;
		int d, m, a;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Cliente " + (i+1));
			System.out.print("\tNome: ");
			s = entrada.next();
			System.out.print("\tData: ");
			d = entrada.nextInt();
			System.out.print("\tMes: ");
			m = entrada.nextInt();
			System.out.print("\tAno: ");
			a = entrada.nextInt();
			
			c[i] = new Cliente();
			c[i].setNome(s).setDataNascimento(d, m, a);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(c[i]);
			c[i] = null;
		}
		
		System.gc();
		
		entrada.close();
		
	}

}
