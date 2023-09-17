package atividade6EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade6EstruturaCondicional {

	public static void main(String[] args) {
		
		String conversao;
		double x, y, z;
		
		conversao = JOptionPane.showInputDialog("X :");
		x = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Y :");
		y = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Z :");
		z = Double.parseDouble(conversao);
		
		if (x > Math.abs(y - z) && x < (y + z))
			JOptionPane.showMessageDialog(null, "É um triângulo!");
		
		else if (y > Math.abs(x - z) && y < (x + z))
			JOptionPane.showMessageDialog(null, "É um triângulo!");
		
		else if (z > Math.abs(y - z) && z < (y + z))
			JOptionPane.showMessageDialog(null, "É um triângulo!");
		
		else
			JOptionPane.showMessageDialog(null, "Não é um triângulo!");
		
			
		
		
		
		

	}

}
