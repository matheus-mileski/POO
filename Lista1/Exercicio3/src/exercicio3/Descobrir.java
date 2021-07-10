package exercicio3;

import java.util.Random;

public class Descobrir {
//	intervalo do número aleatório
	private int max = 10;
	private int min = 1;
	
	private int n;
	
	public Descobrir() {
		Random r = new Random();
		this.n = r.nextInt(this.max) + this.min;
	}
	
	public int acertou(int x) {
		if(this.n == x) {
			return 0;
		}else if(this.n > x) {
			return 1;
		}else {
			return -1;
		}
	}

}
