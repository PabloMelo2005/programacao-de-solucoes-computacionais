package atividade10EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade10EstruturaCondicional {

	public static void main(String[] args) {
		
		String conversao;
		int operacao;
		double num1, num2, soma, subtracao, multiplicacao, divisao;
		
		conversao = JOptionPane.showInputDialog(":");
		num1 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog(":");
		num2 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Escolha o tipo de operação(1 - Soma, 2 - Multiplicar, 3 - Subtração, 4 - Divisão:");
		operacao = Integer.parseInt(conversao);
		
		switch(operacao) {
		
		case 1:
			soma = num1 + num2;
			JOptionPane.showMessageDialog(null, "Operação escolhida: Soma ");
			JOptionPane.showMessageDialog(null, "Resultado=" + soma);
			
			break;
			
			
		case 2:
			multiplicacao = num1 * num2;
			JOptionPane.showMessageDialog(null, "Operação escolhida: Multiplicação ");
			JOptionPane.showMessageDialog(null, "Resultado=" + multiplicacao);
			
			break;
		
			
		case 3:
			subtracao = num1 - num2;
			JOptionPane.showMessageDialog(null, "Operação escolhida: Subtração ");
			
			if (num1 != num2)
				JOptionPane.showMessageDialog(null, "Resultado=" + subtracao);
			else
				JOptionPane.showMessageDialog(null, "0");
			
			break;
			
		
		case 4:
			divisao = num1 / num2;
			
			JOptionPane.showMessageDialog(null, "Operação escolhida: Divisão ");
			
			if (num2 != 0)
				JOptionPane.showMessageDialog(null, "Resultado=" + divisao);
			else
				JOptionPane.showMessageDialog(null, "Não existe divisão por 0!");
			
			break;
		
			
			
		}
		

	}

}
