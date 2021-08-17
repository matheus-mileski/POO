package aula11prog3;

public abstract class Forma3D extends Forma {
	
	protected float volume;
	
	public Forma3D(float area, float volume) {
		super(area);
		this.volume = volume;
	}
	
	public abstract float getVolume();
	
	public String toString() {
		return this.getClass() + "\nArea: " + area + "\nVolume: " + this.volume;
	}
	
}
