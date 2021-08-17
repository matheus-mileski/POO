package aula12ex2;

public class Principal {

	public void meuMetodo(int num) throws MinhaExcecao {

		if ( num == 0 )
			throw new MinhaExcecao();

	}//fim meuMetodo

	public Principal(){

	    int num=0;
	    try {
	          meuMetodo(num);
	    } catch ( MinhaExcecao e ){
	           e.printStackTrace();
	           System.out.println(e.getMessage());
	    }
	}//fim construtor

	public static void main(String [] args){

		Principal principal = new Principal();

	}


}