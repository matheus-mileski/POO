public class Convencional extends Passagem implements IDados{
    private float valor;
    private String nome;
    private String CPF;
    public Convencional(){
    }
    public Convencional(float valor, String CPF, String nome){
            this.valor = valor;
            this.CPF = CPF;
            this.nome = nome;
    }
    public float getValor(){
          return this.valor;
    }
    public String getCPF(){
         return this.CPF;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDados(){
         return this.nome;
    }
    public String toString(){
          return this.getClass().getSimpleName() + 
              " Valor: " + getValor() +
              " CPF: " + getCPF();
    }
}

