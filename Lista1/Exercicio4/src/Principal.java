
public class Principal {

	public static void main(String[] args) {
		
		Alunos a = new Alunos();
		
		a.recebeNotas();
		
		System.out.println("\nRelatorio de Notas\n");
		for(int i = 0; i < 4; i++) {
			System.out.println("Aluno" + (i+1));
			System.out.println("\tMaior Nota: " + a.maiorNota(i));
			System.out.println("\tMenor Nota: " + a.menorNota(i));
			System.out.println("\tMedia: " + a.media(i));
		}

	}

}
