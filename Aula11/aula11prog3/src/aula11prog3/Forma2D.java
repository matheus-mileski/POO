package aula11prog3;

public abstract class Forma2D extends Forma {
	
	public Forma2D(float area) {
		super(area);
	}
	
	public String toString() {
		return this.getClass() + "\nArea: " + area;
	}
	
}
