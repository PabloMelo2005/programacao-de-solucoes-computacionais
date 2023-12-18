package heranca;
import javax.swing.JOptionPane;


public class CadastraPessoa {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n1. Pessoa física\n2. Pessoa Jurídica"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        if (opcao == 1) {
            PF objPF = new PF();
            String RG = JOptionPane.showInputDialog("Digite o RG");
            String CPF = JOptionPane.showInputDialog("Digite o CPF");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Amigos\n2. Parentes"));
            
            if (opcao == 1) {
                String blog = JOptionPane.showInputDialog("Digite o blog");
                Amigo objAmigo = new Amigo(nome, telefone, endereco, RG, CPF, blog);
                objAmigo.exibe();
            }
            
            if (opcao == 2) {
                String email = JOptionPane.showInputDialog("Digite o e-mail");
                Parente objParente = new Parente(nome, telefone, endereco, RG, CPF, email);
                objParente.exibe();
            }
        }

        if (opcao == 2) {
            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
            PJ objPJ = new PJ(nome, telefone, endereco, CNPJ, IE);
            objPJ.exibe();
        }
    }
}