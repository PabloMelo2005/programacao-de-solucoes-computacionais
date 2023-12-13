package cadastro;

public class Funcionario {

	private int idade;
	private double salario;
	private String nome, endereco, telefone, cargo;

	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String exibe() {
		return (" | Nome: " + getNome() + "\n" + " | Idade: " + getIdade() + "\n" + " | Endereço: " + getEndereco() + "\n" + " | Telefone: " + getTelefone() + "\n" + " | Salário: R$" + getSalario() + "\n" + " | Cargo: " + getCargo());
	}
	
}
