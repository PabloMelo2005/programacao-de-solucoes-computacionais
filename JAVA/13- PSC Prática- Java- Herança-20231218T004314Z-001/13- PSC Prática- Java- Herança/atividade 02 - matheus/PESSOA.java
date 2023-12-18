package herança;

public class PESSOA {
	public class Pessoa {
	    private String nome;
	    private int idade;
	    private double altura;
	    private double peso;

	    public Pessoa(String nome, int idade, double altura, double peso) {
	        this.nome = nome;
	        this.idade = idade;
	        this.altura = altura;
	        this.peso = peso;
	    }

	}

	public class Empregado extends Pessoa {
	    private int numeroSecao;
	    private double salarioBase;
	    private double inss;

	    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss) {
	        super(nome, idade, altura, peso);
	        this.numeroSecao = numeroSecao;
	        this.salarioBase = salarioBase;
	        this.inss = inss;
	    }

	    public double calcularSalario() {
	        return salarioBase - (salarioBase * (inss / 100));
	    }

	}

	public class Cliente extends Pessoa {
	    private double credMax;
	    private double valorEmDivida;

	    public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida) {
	        super(nome, idade, altura, peso);
	        this.credMax = credMax;
	        this.valorEmDivida = valorEmDivida;
	    }

	    public double obterSaldo() {
	        return credMax - valorEmDivida;
	    }

	}

	public class Administrador extends Empregado {
	    private double ajudaDeCusto;

	    public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double ajudaDeCusto) {
	        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
	        this.ajudaDeCusto = ajudaDeCusto;
	    }

	    @Override
	    public double calcularSalario() {
	        return super.calcularSalario() + ajudaDeCusto;
	    }

	   
	}

	
	public class TesteClasses {
	    public static void main(String[] args) {
	        
	    }
	}
