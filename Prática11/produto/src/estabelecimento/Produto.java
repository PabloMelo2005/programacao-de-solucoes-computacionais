package estabelecimento;

public class Produto {
	private String nome;
	private double preco;
	private int id;
	private static int ultimo_id = 0;

	
	public Produto(){
		id = ++ultimo_id;
		nome = "Nome não informado";
		preco = 0;
	}
	
	public Produto(String nome, double preco) {
		this();
		this.nome = nome;
		setPreco(preco);
		}


	public String getNome() {
		return nome;
	}


	public int getId() {
		return id;
	}
	
	public static int getUltimoId() {
        return ultimo_id;
    }
	
	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if (preco > 0)
			this.preco = preco;
		else 
			this.preco = 0;
	}
	
	public void exibe() {
		System.out.println("\n Produto " + getId() + ": \n Nome:" + getNome() + "\n Id:" + getId() + "\n Preço:"  + getPreco());
	}
	
	public void reajustaPreco(double percentual) {
		double reajuste = preco * (percentual / 100);
		preco += reajuste;
	}
	
	
	

}
