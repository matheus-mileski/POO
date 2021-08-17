
public class Placa1 extends Placa {
	
	
	public Placa1() {

	}
	
	public Placa1(String nome, String data, String local, String tipo, String material) {
		setNome(nome);
		setData(data);
		setLocal(local);
		setTipo(tipo);
		setMaterial(material);
	}
	
	public String toString() {
		return  getClass() +
				"Nome Placa: " + getNome() +
				"\nData: " + getData() +
				"\nLocal: " + getLocal() +
				"\nTipo: " + getTipo() +
				"\nMaterial: " + this.material;
	}
	
}
