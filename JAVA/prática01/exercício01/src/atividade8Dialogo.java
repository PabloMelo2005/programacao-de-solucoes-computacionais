import javax.swing.JOptionPane;

public class atividade8Dialogo {
	public static final double engordar15 = 0.15, emagrecer20 = 0.2;

	public static void main(String[] args) {
		String conversao;
		
		double peso, pesoemagrecer, pesoengordar;
		
		conversao = JOptionPane.showInputDialog("Informe o seu peso(kg): ");
		peso = Double.parseDouble(conversao);
		
		pesoemagrecer = peso - (peso * emagrecer20);
		pesoengordar = peso + (peso * engordar15);
		
		JOptionPane.showMessageDialog(null, "20% de emagrecimento: " + pesoemagrecer );
		JOptionPane.showMessageDialog(null, "15% de ganho de peso: " + pesoengordar );
		
		

	}

}
