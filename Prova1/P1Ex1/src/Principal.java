/* Prova 1
 * Exercicio 1
 * Autor: Matheus Mileski (1748653)
 * Data: 13/07/2021
*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String conta = "012345-6";
		String senha = "abcdef";
		int hora = 16;
		
		float entradaDeposito = 0, entradaSaque = 0;
		
		Caixa operacao = new Caixa(conta, senha);
		
		Scanner entrada = new Scanner(System.in);
		
		if(operacao.getAcesso()==true){
			System.out.println("\tLogin realizado\n");
			System.out.print("Informe o valor para o Deposito (zero para pular): R$ ");
			entradaDeposito = entrada.nextFloat();
			System.out.print("Informe o valor para o Saque (zero para pular): R$ ");
			entradaSaque = entrada.nextFloat();
			
			operacao.setDeposito(entradaDeposito).setSaque(entradaSaque);
			
			System.out.println(operacao);
			
		}
		
		System.out.println("\nOperação Finalizada\n***************************");
		
		System.out.println("\nConsulta");
		Caixa consulta = new Caixa(conta, senha);
		System.out.println(consulta);
		
		System.out.println("\nDeposito");
		Caixa deposito = new Caixa(conta, senha, entradaDeposito);
		System.out.println(deposito);
		
		System.out.println("\nSaque");
		Caixa saque = new Caixa(conta, senha, entradaSaque, hora);
		System.out.println(saque);
		
		System.out.println("\nSaque");
		Caixa saque2 = new Caixa(conta, senha, entradaSaque, hora);
		System.out.println(saque2);
		System.out.print("Hora do Saque: " + saque2.getHora(true) + "h");
								
		entrada.close();

	}

}
