package cadastramento;

public class Veiculo {
private String marca, modelo, placa, cor, num_chassi;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNum_chassi() {
		return num_chassi;
	}

	public void setNum_chassi(String num_chassi) {
		this.num_chassi = num_chassi;
	}
	
	public String exibe() {
		return ("Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Cor: " + getCor() + " | Número do Chassi: " + getNum_chassi());
	}

}