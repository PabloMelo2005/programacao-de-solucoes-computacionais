import javax.swing.JOptionPane;

public class atividade3Dialogo {
	public static final double cotacaodolar = 4.88;
	
	public static void main(String[] args) {
		String conversao;
		
		double dolar, reais;
		
		conversao = JOptionPane.showInputDialog("Insira o valor em dólares: ");
		dolar = Double.parseDouble(conversao);
		
		reais = dolar * cotacaodolar;
		
		JOptionPane.showMessageDialog(null, "Seu valor em reais é: " + reais);
		
	}

}
