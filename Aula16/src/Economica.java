public class Economica extends Passagem implements IDados {
    private float valor;
    private String destino;
    private String nome;
    public Economica(){
    }
    public Economica(float valor, String nome, String destino){
            this.valor = valor;
           this.nome = nome;
           this.destino = destino;
    }
    public float getValor(){
          return this.valor;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDestino(){
          return this.destino;
    }
    public String getDados(){
         return this.nome;
    }
    public String toString(){
          return this.getClass().getSimpleName() + " Valor: " + getValor();
    }
}