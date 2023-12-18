package heranca;
import javax.swing.JOptionPane;


public class PJ extends Pessoa {
    private String CNPJ;
    private String IE;

    public PJ() {
        super();
        CNPJ = "";
        IE = "";
    }

    public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
        super(nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }

    
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "CNPJ: " + CNPJ + "\nIE: " + IE);
    }
}