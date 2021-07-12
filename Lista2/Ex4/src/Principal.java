/* Lista 2
 * Exercicio 4
 * Autor: Matheus Mileski (1748653)
 * Data: 12/07/2021
*/

public class Principal {

	public static void main(String[] args) {
		StartupA1 objA = new StartupA1("StartupA1",
				"88.888/0001-8",
				"StartupA1 LTDA",
				"Pesquisa",
				15000.00f);
		
		StartupC1 objC = new StartupC1("StartupC1", "Sensor", "Eletronico");
		
		System.out.println(objA);
		System.out.println(objC);

	}

}
