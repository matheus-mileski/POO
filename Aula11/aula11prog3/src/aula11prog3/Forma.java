package aula11prog3;

public abstract class Forma {
	
	protected float area;
	
	public Forma(float area) {
		this.area = area;
	}
	
	public abstract float getArea();
	
	public String toString() {
		return this.getClass()+"";
	}
}
