public class PrimeiraClasse extends Passagem implements IDados{
    private float valor;
    private String nome;
    private String data;
    public PrimeiraClasse(){
    }
    public PrimeiraClasse(float valor, String data, String nome){
            this.valor = valor;
            this.data = data;
          this.nome = nome;
    }
    public float getValor(){
          return this.valor;
    }
    public String getData(){
          return this.data;
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
          " Data: " + getData();
    }
}
