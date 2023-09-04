import javax.swing.JOptionPane;

public class atividade1Dialogo {

	public static void main(String[] args) {
		String conversao;
		
		double num1, num2, num3, media;
		
		conversao = JOptionPane.showInputDialog("Insira a primeira nota: ");
		num1 = Double.parseDouble(conversao);
		
	    conversao = JOptionPane.showInputDialog("Insira a segunda nota: ");
	    num2 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira a terceira nota: ");
		num3 = Double.parseDouble(conversao);
		
		media = (num1 + num2 + num3) / 3;
		
		JOptionPane.showMessageDialog(null, "A média é: " + media);
	}

}
