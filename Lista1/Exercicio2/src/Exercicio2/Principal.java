package Exercicio2;

import javax.swing.*;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {
		
		String f1="", f2="", result="";
		float n1=0, n2=0;
		int opcao=0;
		
		Operacoes op = new Operacoes();
		
		f1 = JOptionPane.showInputDialog("Entre o primeiro número: ");
		f2 = JOptionPane.showInputDialog("Entre o segundo número: ");
		
		JComboBox jcb = new JComboBox();
		
		jcb.addItem(new ComboItem("1 - Soma", 1));
		jcb.addItem(new ComboItem("2 - Subtração", 2));
		jcb.addItem(new ComboItem("3 - Divisão", 3));
		jcb.addItem(new ComboItem("4 - Multiplicação", 4));
		
		JOptionPane.showMessageDialog(null, jcb, "Selecione a operação", JOptionPane.QUESTION_MESSAGE);
		
		n1 = Float.parseFloat(f1);
		n2 = Float.parseFloat(f2);
		
		Object item = jcb.getSelectedItem();
		opcao = ((ComboItem)item).getValor();
		
		if (opcao == 1)
			result = "Resultado: " + op.soma(n1, n2);
		
		if (opcao == 2)
			result = "Resultado: " + op.subtracao(n1, n2);
		
		if (opcao == 3) {
			if(n2 == 0)
				result = "Erro! Divisão por 0";
			else
				result = "Resultado: " + op.divisao(n1, n2);
		}
					
		if (opcao == 4)
			result = "Resultado: " + op.multiplicacao(n1, n2);
		
		
		JOptionPane.showMessageDialog(null, result,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
				
	}

}