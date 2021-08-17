import java.util.ArrayList;

public class Principal {

    public static void main(String [ ] args ){
           ArrayList<IDados> vetor = new ArrayList<IDados>();
           vetor.add(new Economica(100.0f, "Joao", "Apucarana") );
           vetor.add(new Convencional(200.0f, "123.456.789-x", "Maria") );
           vetor.add(new PrimeiraClasse(300.0f, "16/08/2021", "Antonia") );
          
          // IDados [ ] vetor = new IDados[10];
          for( IDados item : vetor ){
                   System.out.println(item);
           }//fim for

    }

}
