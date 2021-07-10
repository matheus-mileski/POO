
public class Pendulo {
	
	private int displayA;
	private int displayB;
	private int displayC;
	
	private int min = 0;
	private int max = 30;
	
	public Pendulo() {
		resetPendulo(1); // display A: 1
		resetPendulo(0); // display B: 0
		resetPendulo(-1); // display C: -1
	}
	
	public void resetPendulo(int n) {
		if(n == 1) {
			this.displayA = this.min;
		}else if(n == 0) {
			this.displayB = this.min;
		}else {
			this.displayC = this.min;
		}
	}
	
	public void setPendulo() {
		this.displayC++;
		
		if(this.displayC == this.max) {
			resetPendulo(-1); // reseta C
			this.displayB++;
		
			if(this.displayB == this.max) {
				resetPendulo(0); // reseta B
				this.displayA++;
				
				if(this.displayA == this.max) {
					resetPendulo(1); // reseta A
				}
			}
		}
	}
	
	public String getPendulo() {
		return  "A: " + this.displayA + 
				"\tB: " + this.displayB +
				"\tC: " + this.displayC;
	}


}
