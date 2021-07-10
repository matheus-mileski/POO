package Exercicio2;

public class ComboItem {
	
	private String operacao;
	private int valor;
	
	public ComboItem(String op, int v) {
		this.operacao = op;
		this.valor = v;
	}
	
	public String toString() {
        return operacao;
    }
	
	public int getValor() {
        return valor;
    }
	
	public String getOp() {
		return operacao;
	}

}
