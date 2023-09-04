import javax.swing.JOptionPane;

public class atividade11Dialogo {

	public static void main(String[] args) {
		String conversao;
		
		int num, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;
		
		conversao = JOptionPane.showInputDialog("Informe um número: ");
		num = Integer.parseInt(conversao);
		
		x0 = num * 0;
		x1 = num * 1;
		x2 = num * 2;
		x3 = num * 3;
		x4 = num * 4;
		x5 = num * 5;
		x6 = num * 6;
		x7 = num * 7;
		x8 = num * 8;
		x9 = num * 9;
		x10 = num * 10;
		
		JOptionPane.showMessageDialog(null, num + " x 0 = " + x0);
		JOptionPane.showMessageDialog(null, num + " x 1 = " + x1);
		JOptionPane.showMessageDialog(null, num + " x 2 = " + x2);
		JOptionPane.showMessageDialog(null, num + " x 3 = " + x3);
		JOptionPane.showMessageDialog(null, num + " x 4 = " + x4);
		JOptionPane.showMessageDialog(null, num + " x 5 = " + x5);
		JOptionPane.showMessageDialog(null, num + " x 6 = " + x6);
		JOptionPane.showMessageDialog(null, num + " x 7 = " + x7);
		JOptionPane.showMessageDialog(null, num + " x 8 = " + x8);
		JOptionPane.showMessageDialog(null, num + " x 9 = " + x9);
		JOptionPane.showMessageDialog(null, num + " x 10 = " + x10);
		
		
		
		

	}

}
