
public class Principal {

	public static void main(String[] args) {

		Placa p = new Placa("Placa1", "13/07/2021", "Centro", "Pare");
		Semaforo s = new Semaforo("Semaforo1", "12/07/2021", "Rodovia", 3.0f);
		
		System.out.println(p);
		System.out.println("\n");
		System.out.println(s);
		
		System.out.println("********************************\n");
		
		Placa1 p1 = new Placa1("Placa1", "13/07/2021", "Centro", "Pare", "Ferro");
		Semaforo1 s1 = new Semaforo1("Semaforo1", "12/07/2021", "Rodovia", 3.0f, 4.2f);
		
		System.out.println(p1);
		System.out.println("\n");
		System.out.println(s1);
		
		System.out.println("********************************\n");
		
		Sinalizacao sinal = new Placa1("Placa1", "13/07/2021", "Centro", "Pare", "Ferro");
		
		System.out.println("Sinal é um Placa? " + (sinal instanceof Placa));
		System.out.println("Sinal é um Placa1? " + (sinal instanceof Placa1));
		System.out.println("Sinal é um Semaforo? " + (sinal instanceof Semaforo));
		System.out.println("Sinal é um Semaforo1? " + (sinal instanceof Semaforo1));
		
		p1 = null;
		p = null;
		s1 = null;
		s = null;
		
		System.gc();

	}

}
