package atividade4EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade4EstruturaCondicional {

	public static void main(String[] args) {
		String conversao;
		
		double peso, altura, imc;
		
		conversao = JOptionPane.showInputDialog("Insira seu peso:");
		peso = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira sua altura:");
		altura = Double.parseDouble(conversao);
		
		imc = peso / Math.pow(altura, 2);
		
		if (imc < 20)
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso.");
		else if (imc < 20 && imc < 25)
			JOptionPane.showMessageDialog(null, "Você está com o peso normal.");
		else if (imc >= 25 && imc < 30)
			JOptionPane.showMessageDialog(null, "Você está acima do peso.");
		else if (imc >= 30 && imc <= 40 )
			JOptionPane.showMessageDialog(null, "Você está sofrendo de obesidade.");
		

	}

}
