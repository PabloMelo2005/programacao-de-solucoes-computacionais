package pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica() {
		super();
		cpf = " ";

	}

	public PessoaFisica(String nome, String cpf) {

		super(nome);
		this.cpf = cpf;

	}

	public String getCPF() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public String exibe() {

		return "\n[Pessoa Física]\n\n" + super.exibe() + "\n| CPF: " + cpf;
	}
}
