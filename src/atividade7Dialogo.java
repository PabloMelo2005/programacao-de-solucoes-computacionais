import javax.swing.JOptionPane;

public class atividade7Dialogo {
	public static final double salariominimo = 1320;

	
	public static void main(String[] args) {
		String conversao;
		
		double salario, qtdesalario;
		
		conversao = JOptionPane.showInputDialog("Informe o seu valor salarial: ");
		salario = Double.parseDouble(conversao);
		
		qtdesalario = salario / salariominimo;
		
		JOptionPane.showMessageDialog(null, "O seu salário equivale à essa quantidade de salários mínimos: " + qtdesalario);

	}

}
