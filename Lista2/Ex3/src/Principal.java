/* Lista 2
 * Exercicio 3
 * Autor: Matheus Mileski (1748653)
 * Data: 12/07/2021
*/

public class Principal {

	public static void main(String[] args) {
		Incubadora objA = new Incubadora("StartupA");
		Incubadora objB = new Incubadora("StartupB", 1);
		Incubadora objC = new Incubadora("StartupC", 1, 2);
		Incubadora objD = new Incubadora("StartupD", 1, 2, 3);
		
		System.out.println(objA + "\n" + objB + "\n" + objC + "\n" + objD);
		
	}

}
