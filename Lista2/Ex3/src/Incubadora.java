
public class Incubadora {
	
	private String nome;
	
	private StartupA stA;
	private StartupB stB;
	private StartupC stC;
	private StartupD stD;
	
	public Incubadora() {
		
	}
	
	public Incubadora(String n) {
		this.stA = new StartupA();
		this.stA.setNome(n);
	}
	
	public Incubadora(String n, int a) {
		this.stB = new StartupB();
		this.stB.setNome(n);
		
	}
	
	public Incubadora(String n, int a, int b) {
		this.stC = new StartupC();
		this.stC.setNome(n);
	}
	
	public Incubadora(String n, int a, int b, int c) {
		this.stD = new StartupD();
		this.stD.setNome(n);
	}
	
	public String toString() {
		return this.nome;
	}
	
	public Incubadora setNome(String n) {
		this.nome = n;
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}

}
