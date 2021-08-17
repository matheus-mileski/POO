package aula11prog2;

public class Bicicleta extends EmissaoCarbono {
	
    private float emissaoBicicleta;
    
    public Bicicleta(){
    	this.emissaoBicicleta = 0;
    }
    
	public float getEmissaoCarbono(){
        return this.emissaoBicicleta;
	}
}
