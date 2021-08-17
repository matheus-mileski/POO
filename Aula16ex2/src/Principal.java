
public class Principal {

    public static void main(String [ ] args){
             Usuario usuario = new Usuario();

           try {
               usuario.setValor(100.0f);           //metodo mutador   
               System.out.println("Valor: " + usuario.getValor() );  //metodo acessor
               //new throw(MinhaExcecao);
              throws MinhaExcecao();
           }  catch (MinhaExcecao e){
                   System.out.println(e.getMessage() );
           }
            catch (Exception e){
                   System.out.println(e.getMessage() );
           }
           finally {
                System.out.println("Terminou o tratamento de excecoes.");
           }
 
    }

}

