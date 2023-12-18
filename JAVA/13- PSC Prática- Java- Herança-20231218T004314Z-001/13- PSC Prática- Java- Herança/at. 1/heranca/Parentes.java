package heranca;
import javax.swing.JOptionPane;


public class Parente extends PF {
    private String email;

    public Parente() {
        super();
        email = "";
    }

    public Parente(String nome, String telefone, String endereco, String RG, String CPF, String email) {
        super(nome, telefone, endereco, RG, CPF);
        this.email = email;
    }

    
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "Email: " + email);
    }
}