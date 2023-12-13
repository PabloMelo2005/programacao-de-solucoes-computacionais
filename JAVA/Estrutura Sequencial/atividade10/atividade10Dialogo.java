import javax.swing.JOptionPane;

public class atividade10Dialogo {

	public static void main(String[] args) {
		String conversao;
		
		double raio, area, comprimento, volume;
		
		conversao = JOptionPane.showInputDialog("Informe o raio da circunferência: ");
		raio = Double.parseDouble(conversao);
		
		area = 2 * Math.PI * raio;
		comprimento = Math.PI * Math.pow(raio, 2);
		volume = (3 / 4) * Math.PI * Math.pow(raio, 3);
		
		JOptionPane.showMessageDialog(null, "A área é:" + area);
		JOptionPane.showMessageDialog(null, "O volume é:" + volume);
		JOptionPane.showMessageDialog(null, "O comprimento é:" + comprimento);
		

	}

}
