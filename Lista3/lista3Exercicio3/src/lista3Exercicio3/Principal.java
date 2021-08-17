package lista3Exercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<ConversorMoedaInterface> lista = new ArrayList<>(); 
        BitCoin b = new BitCoin();
        Euro e = new Euro();
        Real r = new Real();

        lista.add(b);
        lista.add(e);
        lista.add(r);

        for ( ConversorMoedaInterface item : lista )
             System.out.println(item + " " + item.getConversaoDolar());

	}

}
