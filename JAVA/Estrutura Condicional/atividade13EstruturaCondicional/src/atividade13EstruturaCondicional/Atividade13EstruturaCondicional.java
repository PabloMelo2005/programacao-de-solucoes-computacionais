package atividade13EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade13EstruturaCondicional {

	public static void main(String[] args) {
		
		int tipo_apartamento, diaria;
		double total;
		String conversao;
		
		conversao = JOptionPane.showInputDialog("Informe o tipo de apartamento(1 - Simples/2 - Duplo):");
		tipo_apartamento = Integer.parseInt(conversao);
		
		switch (tipo_apartamento) {
		case 1:
			conversao = JOptionPane.showInputDialog("Informe o número de diárias que quer comprar:");
			diaria = Integer.parseInt(conversao);
			
			
			if (diaria < 10)
				{
				total = 100.00 * diaria;
				JOptionPane.showMessageDialog(null, "Total - R$" + total);
				}
			
			else if (diaria >= 10 && diaria <= 15)
				{
				total = 90.00 * diaria;
				JOptionPane.showMessageDialog(null, "Total - R$" + total);
				}
			
			else if (diaria > 15)
			{
			total = 80.00 * diaria;
			JOptionPane.showMessageDialog(null, "Total - R$" + total);
			}
				
			break;
		
			
			
		case 2:
			conversao = JOptionPane.showInputDialog("Informe o número de diárias que quer comprar:");
			diaria = Integer.parseInt(conversao);
			
			
			if (diaria < 10)
				{
				total = 140.00 * diaria;
				JOptionPane.showMessageDialog(null, "Total - R$" + total);
				}
			
			else if (diaria >= 10 && diaria <= 15)
				{
				total = 120.00 * diaria;
				JOptionPane.showMessageDialog(null, "Total - R$" + total);
				}
			
			else if (diaria > 15)
			{
			total = 100.00 * diaria;
			JOptionPane.showMessageDialog(null, "Total - R$" + total);
			}
				
			break;
			
		}
	
			
		
		
		
		
		
	
		

	}

}
