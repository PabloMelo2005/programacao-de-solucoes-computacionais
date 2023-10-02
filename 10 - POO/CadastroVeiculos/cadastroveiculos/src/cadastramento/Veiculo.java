package cadastramento;

public class Veiculo {
	private String marca, modelo, placa, cor, num_chaci;
	
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

	public String getNum_chaci() {
		return num_chaci;
	}

	public void setNum_chaci(String num_chaci) {
		this.num_chaci = num_chaci;
	}
	
	public String exibe() {
		return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Placa: " + getPlaca();
	}

}
