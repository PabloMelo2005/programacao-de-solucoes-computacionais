import javax.swing.JOptionPane;

public class atividade9Dialogo {

	public static void main(String[] args) {
		String conversao;
		
		double cat1, cat2, hip;
		
		conversao = JOptionPane.showInputDialog("Insira o valor de um cateto: ");
		cat1 = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira o valor de outro cateto: ");
		cat2 = Double.parseDouble(conversao);
		
		hip= Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		
		JOptionPane.showMessageDialog(null, "O valor da Hipotenusa é: " + hip);
	}

}
