package pessoa;

import java.util.Scanner;

public class CadastroPessoas {

    private String opcao, nome;
    Scanner sc;
    int qtde;
    Pessoa[] pessoas;

    public CadastroPessoas() {
        sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você quer cadastrar?");
        qtde = sc.nextInt();
        sc.nextLine();

        pessoas = new Pessoa[qtde];

        for (int i = 0; i < qtde; i++) {
            System.out.println("\nEscolha uma opção: \n1- Pessoa Física \n2- Pessoa Jurídica \nOpção escolhida: ");
            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                PessoaFisica pf = new PessoaFisica();

                System.out.println("Digite o nome: ");
                nome = sc.nextLine();
                System.out.println("Digite o CPF: ");
                String cpf = sc.nextLine();

                int qtde_num_cpf = cpf.length();

                pf.setNome(nome);
                pf.setcpf(cpf);

                if (qtde_num_cpf != 11) {
                    System.out.println("Isso não é um CPF!");
                    i--;
                }
                else {
                    pessoas[i] = pf;
                }

                

            }

            else if (opcao.equals("2")) {
                PessoaJuridica pj = new PessoaJuridica();

                System.out.println("Digite o nome: ");
                nome = sc.nextLine();
                System.out.println("Digite o CNPJ: ");
                String cnpj = sc.nextLine();

                int qtde_num_cnpj = cnpj.length();

                pj.setNome(nome);
                pj.setCNPJ(cnpj);

                if (qtde_num_cnpj != 14) {
                    System.out.println("Isso não é um CNPJ!");
                    i--;
                }
                else {
                    pessoas[i] = pj;
                }
            }

            else {
                System.out.println("Essa não é uma opção aceitável");
                i--;
            }
        }

        sc.close();
    }

    public void exibe() {
        System.out.println("\nDados das pessoas cadastradas:\n");
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.exibe() + "\n");
            }
        }
    }
}
