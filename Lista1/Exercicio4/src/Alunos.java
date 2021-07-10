import java.util.Scanner;

public class Alunos {
	
	private float notas[][] = new float[4][4];
	
	public Alunos() {
		
	}
	
	public void recebeNotas() {
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Aluno " + (i+1));
			for(int j = 0; j < 4; j++) {
				
				do {
					System.out.print("\tNota " + (j+1) + ": ");
					this.notas[i][j] = entrada.nextFloat();
					
					if(this.notas[i][j] < 0 || this.notas[i][j] > 10) {
						System.out.println("Nota invalida. Apenas notas de 0 - 10\nInforme novamente.");
					}
				}while(this.notas[i][j] < 0 || this.notas[i][j] > 10);
								
			}
		}
		
		entrada.close();
	}
	
	public float maiorNota(int n) {
		float maior = this.notas[n][0];
		
		for(int i = 0; i < 4; i++) {
			if(maior < this.notas[n][i])
				maior = this.notas[n][i];
		}
		
		return maior;
	}
	
	public float menorNota(int n) {
		float menor = this.notas[n][0];
		
		for(int i = 0; i < 4; i++) {
			if(menor > this.notas[n][i])
				menor = this.notas[n][i];
		}
		
		return menor;
	}
	
	public float media(int n) {
		float media = 0.0f;
		
		for(int i = 0; i < 4; i++) 
			media += this.notas[n][i];
		
		return media/4;
	}

}
