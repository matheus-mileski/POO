package aula11prog3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		 
		Circulo circulo = new Circulo(123.45f);
		Triangulo triangulo = new Triangulo(456.78f);
        Esfera esfera = new Esfera(123.45f, 456.34f);
        Cubo cubo = new Cubo(123.45f, 456.78f);
        
        ArrayList<Forma> lista = new ArrayList<>();
        
        lista.add(triangulo);
        lista.add(circulo);
        lista.add(esfera);
        lista.add(cubo);
        
        for( Forma item : lista)
        	System.out.println(item);

	}

}
