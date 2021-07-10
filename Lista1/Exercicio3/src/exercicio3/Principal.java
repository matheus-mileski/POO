package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Descobrir aleatorio = new Descobrir();
		int chute, acertou;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Informe o numero de 0 a 10");
			
			chute = (int)entrada.nextInt();
			acertou = aleatorio.acertou(chute);
			
			if(acertou == 0) {
				System.out.println("Voce acertou!!");
			}else if(acertou > 0) {
				System.out.println("O numero e maior");
			}else {
				System.out.println("O numero e menor");
			}
			
		}while(acertou != 0);
		
		entrada.close();
	}

}
