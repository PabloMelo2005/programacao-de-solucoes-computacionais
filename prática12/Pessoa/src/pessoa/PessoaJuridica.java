package pessoa;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;

	public PessoaJuridica() {

		super();
		CNPJ = "";
	}

	public PessoaJuridica(String CNPJ, String nome) {

		super(nome);
		this.CNPJ = CNPJ;

	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

}
