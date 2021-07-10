package aula5exercicio1;
 
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Conversor objeto = new Conversor();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		System.out.println(objeto.celsiusFa(celsius));
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fa = entrada.nextDouble();
		System.out.println(objeto.faCelsius(fa));
		
		entrada.close();
	}

}
