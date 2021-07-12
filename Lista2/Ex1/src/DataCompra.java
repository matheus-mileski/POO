
public class DataCompra {

	private int dia;
	private int mes;
	private int ano;
	
	public DataCompra(int d, int m, int a) {
		
		this.dia = ( (d>=1 && d<=31)? d:1);
		this.mes = ( (m>=1 && m<=12)? m:1);
		this.ano = ( (a>=1)? a:1); 
		
	}
	
	public String toString(){
		
		return this.dia + "/" 
				+ this.mes + "/" 
				+ this.ano;
	}
}
