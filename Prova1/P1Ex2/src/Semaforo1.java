
public class Semaforo1 extends Semaforo {

	public Semaforo1() {

	}
	
	public Semaforo1(String nome, String data, String local, float temporizador, float altura) {
		setNome(nome);
		setData(data);
		setLocal(local);
		setTemporizador(temporizador);
		setAltura(altura);
	}
	
	public String toString() {
		return  getClass() +
				"Nome Semaforo: " + getNome() +
				"\nData: " + getData() +
				"\nLocal: " + getLocal() +
				"\nTemporizador: " + getTemporizador() + "s" +
				"\nAltura: " + this.altura + "m";
	}

}
