/* Lista 2
 * Exercicio 2
 * Autor: Matheus Mileski (1748653)
 * Data: 12/07/2021
*/

public class Principal {

	public static void main(String[] args) {
		StartupA objA = new StartupA("EmpresaA");
		StartupB objB = new StartupB("EmpresaB");
		StartupC objC = new StartupC("EmpresaC");
		StartupD objD = new StartupD("EmpresaD");
		
		objA.setPesquisa("IA").setPesquisadores(3);
		objB.setPesquisa("Redes").setPesquisadores(5);
		objC.setProduto("Sensor").setDesenvolvedores(2);
		objD.setProduto("App Mobile").setDesenvolvedores(6);
		
		System.out.println(objA);
		System.out.println(objB);
		System.out.println(objC);
		System.out.println(objD);
		
		Incubadora inc = new Incubadora();
		System.out.println(inc);
		
		EmpresaPesquisa pesq = new EmpresaPesquisa();
		System.out.println(pesq);
		
		EmpresaInovacao ino = new EmpresaInovacao();
		System.out.println(ino);

	}

}
