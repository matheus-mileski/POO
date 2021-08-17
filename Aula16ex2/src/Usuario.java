public class Usuario extends Firewall implements IUsuario {
    
     public Usuario(){
          super();
     }
     public Usuario(float valor){
          setValor(valor);
     }
     
    public float getValor(){
          return super.getValorAcima();
    }

    public void setValor(){
          super.setValorAcima();
    }

}

