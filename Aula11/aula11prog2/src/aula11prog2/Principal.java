package aula11prog2;

import java.util.ArrayList;

public class Principal {

	public static void main(String [ ] args ){

       ArrayList<EmissaoCarbono> lista = new ArrayList<>(); 
       Construcao construcao = new Construcao();
       Carro carro = new Carro();
       Bicicleta bicicleta = new Bicicleta();

       lista.add(construcao);
       lista.add(carro);
       lista.add(bicicleta);

       for ( EmissaoCarbono item : lista )
            System.out.println(item.getEmissaoCarbono());

	}

}
