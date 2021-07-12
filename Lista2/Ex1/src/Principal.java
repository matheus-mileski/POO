/* Lista 2
 * Exercicio 1
 * Autor: Matheus Mileski (1748653)
 * Data: 12/07/2021
*/

public class Principal {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("comp1");
		Celular c = new Celular("cel1");
		
		d.setModelo("Intel").setDataCompra(1, 1, 2021);
		c.setModelo("Samsung").setDataCompra(1, 1, 2021);
		
		System.out.println(d);
		System.out.println(c);
		
	}

}
