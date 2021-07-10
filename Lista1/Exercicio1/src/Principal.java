import java.util.Scanner;
import java.lang.Math;

public class Principal {

	public static void menu() {
		System.out.println("*********** MENU ***********");
		System.out.println("1   -  Abs    |  6   -  Log");
		System.out.println("2   -  Ceil   |  7   -  Max");
		System.out.println("3   -  Cos    |  8   -  Min");
		System.out.println("4   -  Exp    |  9   -  Pow");
		System.out.println("5   -  Floor  |  10  -  Sqrt");
		System.out.println("0   -  Fechar");
		System.out.print("Escolha uma das opções: ");
	}
		
	public static void main(String[] args) {
		int op;
		float n, n2;
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			menu();
			op = (int)entrada.nextInt();
			
			switch(op) {
			case 1:
				
				System.out.println("Função Abs");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.abs(n));
				System.out.println();
				
				break;
			case 2:
				
				System.out.println("Função Ceil");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.ceil(n));
				System.out.println();
				
				break;
			case 3:
				
				System.out.println("Função Cos");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.cos(n));
				System.out.println();
				
				break;
			case 4:
				
				System.out.println("Função Exp");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.exp(n));
				System.out.println();
				
				break;
			case 5:
				
				System.out.println("Função Floor");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.floor(n));
				System.out.println();
				
				break;
			case 6:
				
				System.out.println("Função Log");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.log(n));
				System.out.println();
				
				break;
			case 7:
				
				System.out.println("Função Max");
				System.out.print("Informe o primeiro número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Informe o segundo número real: ");
				n2 = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.max(n, n2));
				System.out.println();
				
				break;
			case 8:
				
				System.out.println("Função Min");
				System.out.print("Informe o primeiro número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Informe o segundo número real: ");
				n2 = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.min(n, n2));
				System.out.println();
				
				break;
			case 9:
				
				System.out.println("Função Pow");
				System.out.print("Informe o primeiro número real: ");
				n = (float)entrada.nextFloat();
				System.out.print("Informe o segundo número real: ");
				n2 = (float)entrada.nextFloat();
				System.out.print("Resultado: ");
				System.out.println(Math.pow(n, n2));
				System.out.println();
				
				break;
			case 10:
				
				System.out.println("Função Sqrt");
				System.out.print("Informe um número real: ");
				n = (float)entrada.nextFloat();;
				System.out.print("Resultado: ");
				System.out.println(Math.sqrt(n));
				System.out.println();
				
				break;
			case 0:
				
				System.out.println("FIM !");
				
				break;
			default:
				System.out.println("Opção Inválida");
			}
			
		}while(op != 0);
		
		entrada.close();
		
	}
	
}
