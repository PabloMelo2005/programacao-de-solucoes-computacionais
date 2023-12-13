package atividade3EstruturaCondicional;

import javax.swing.JOptionPane;

public class atividade3EstruturaCondicional {

	public static void main(String[] args) {
		String conversao;
		
		double nota1, nota2, nota3, media;
		
		conversao = JOptionPane.showInputDialog("Insira a primeira nota:");
		nota1 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira a segunda nota:");
		nota2 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira a terceira nota:");		
		nota3 = Double.parseDouble(conversao);
		
		
		media = (nota1 + nota2 + nota3) / 3;
		
		
		if (media >= 0 && media < 3)
			JOptionPane.showMessageDialog(null, "REPROVADO!");
		else if (media >= 3 && media < 7)
			JOptionPane.showMessageDialog(null, "EXAME!");
		else if (media >= 7 && media <= 10)
			JOptionPane.showMessageDialog(null, "APROVADO!");
			
		
		
		}
}