
public class Semaforo extends Sinalizacao {
	
	private float temporizador;
	protected float altura;
	
	public Semaforo() {
		// TODO Auto-generated constructor stub
	}
	
	public Semaforo(String nome, String data, String local, float temporizador) {
		setNome(nome);
		setData(data);
		setLocal(local);
		setTemporizador(temporizador);
	}
	
	protected Semaforo setTemporizador(float temporizador){
		this.temporizador = temporizador;
		return this;
	}
	
	protected float getTemporizador(){
		return this.temporizador;
	}
	
	protected Semaforo setAltura(float altura){
		this.altura = altura;
		return this;
	}
	
	public String toString() {
		return "Nome Semaforo: " + getNome() +
				"\nData: " + getData() +
				"\nLocal: " + getLocal() +
				"\nTemporizador: " + getTemporizador() + "s";
	}

}
