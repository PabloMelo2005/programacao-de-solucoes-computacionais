package pessoa;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica() {

		super();
		cnpj = "";
	}

	public PessoaJuridica(String nome, String cnpj) {

		super(nome);
		this.cnpj = cnpj;

	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public String exibe() {

		return "\n[Pessoa Jurídica]\n\n" + super.exibe() + "\n| CNPJ: " + cnpj;
	}

}
