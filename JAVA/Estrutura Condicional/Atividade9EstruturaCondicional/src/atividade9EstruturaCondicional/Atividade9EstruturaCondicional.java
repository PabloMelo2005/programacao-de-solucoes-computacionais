package atividade9EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade9EstruturaCondicional {

	public static void main(String[] args) {
		
		String conversao;
		int planeta;
		double g, v0, h, v, t;
		
		conversao = JOptionPane.showInputDialog("Escolha um número referente a um planeta(1 - Mercurio, 2 - Venus, 3 - Terra, 4 - Marte, 5 - Júpiter, 6 - Saturno, 7 - Urano, 8 - Netuno, 9 - Plutao");
		planeta = Integer.parseInt(conversao);
		
		switch (planeta) {
		
		
		case 1: 
			JOptionPane.showMessageDialog(null, "Planeta Escolhido: Mercúrio");
			
			g = 3.7;
				
			conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
			v0 = Double.parseDouble(conversao);
				
			conversao = JOptionPane.showInputDialog("Informe o instante t: ");
			t = Double.parseDouble(conversao);
				
			v = v0 - g * t;
				
			h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
			JOptionPane.showMessageDialog(null, "h(t):" + h);
			JOptionPane.showMessageDialog(null, "v(t):" + v);
				
			break;
			
			
		case 2: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Vênus");
				
				g = 8.8;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			
			case 3:
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Terra");
				
				g = 9.8; 
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			
			case 4: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Marte");
				
				g = 3.8;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			
			case 5: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Júpiter");
				
				g = 26.4;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
				
			
			case 6: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Saturno");
				
				g = 11.5;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			
			case 7: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Urano");
				
				g = 9.3;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			
			case 8: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Netuno");
				
				g = 12.2;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
			
			case 9: 
				JOptionPane.showMessageDialog(null, "Planeta Escolhido: Plutão");
				
				g = 0.6;
				
				conversao = JOptionPane.showInputDialog("Informe a velocidade inicial: ");
				v0 = Double.parseDouble(conversao);
				
				conversao = JOptionPane.showInputDialog("Informe o instante t: ");
				t = Double.parseDouble(conversao);
				
				v = v0 - g * t;
				
				h = (v0 * t) - (g * Math.pow(t, 2) / 2);
				
				JOptionPane.showMessageDialog(null, "h(t):" + h);
				JOptionPane.showMessageDialog(null, "v(t):" + v);
				
				break;
		
				
		
		}
		
	
	}

}
