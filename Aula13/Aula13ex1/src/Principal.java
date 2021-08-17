//import java.util.Scanner;
//
//public class Principal {
//	
//	public static void divisao(int num) throws TratamentoExcecao1{
//		if (num == 0)
//			throw new TratamentoExcecao1();
//	}
//	
//	public static void main(String[] args) {
//		Scanner obj = new Scanner(System.in);
//		System.out.print("\nDigite o numerador: ");
//		int numerador = obj.nextInt();
//
//	
//		int denominador;
//		do {
//      		System.out.println("Digite o denominador: ");
//			denominador = obj.nextInt();
//			
//			try {
//				 divisao(denominador);
//			} catch (TratamentoExcecao1 e) {
//				e.printStackTrace();
//				 System.out.println("Informe o denominador novamente\n");
//			}
//	    } while ( denominador == 0 );
//		
//		double resultado = (double) numerador / denominador;
//		System.out.println("\nResultado: " + resultado);
//		obj.close();
//
//	}
//
//}
import java.util.Scanner;

public class Principal {

	public Principal() {}
        
        public static void meuMetodo(int num) throws ArithmeticException, RuntimeException, Exception {
            if(num==0){
                throw new ArithmeticException();
            } else 
                  if (num==1)
                     throw new RuntimeException();
                  else
                      throw new Exception();
        }   

	public static void main(String[] args) {             
                        
		
            Scanner obj = new Scanner(System.in);
            System.out.print("\nDigite o numerador: ");
            int numerador = obj.nextInt();
            System.out.print("\nDigite o denominador: ");
            int denominador = obj.nextInt();
            
            //Aritmetica de inteiros: nao eh permitida divisao por zero
            
            

            try{
                meuMetodo(denominador);
            }
            catch (ArithmeticException exec){
                exec.printStackTrace();
                System.out.print(exec.getMessage());
            }
            catch (RuntimeException exec){
                exec.printStackTrace();
                //System.out.print(obj.getMessage());
            }
            catch (Exception exec){
                exec.printStackTrace();
                //System.out.print(obj.getMessage());
            }
            
            int resultado = numerador / denominador;
            //double resultado = (double) numerador / denominador;
            System.out.println("\nResultado: " + resultado);

	}

}



