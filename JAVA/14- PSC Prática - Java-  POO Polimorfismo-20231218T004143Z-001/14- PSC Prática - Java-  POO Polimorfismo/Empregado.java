package Pratica14;

public class Empregado {
	private String nome;
    private double salario;
    private int anoContratacao;
    public final int ANO_BASE = 2023;

    public Empregado(String nome, double salario, int anoContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.anoContratacao = anoContratacao;
    }

    public void reajustaSalario(double porcentagem) {
        setSalario(getSalario() + (porcentagem / 100 * getSalario()));
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public String toString() {
        return "\n" + nome + " - " + getSalario() + " - " + getAnoContratacao();
    }
}

class Gerente extends Empregado {
    private String nomeSecretaria;

    public Gerente(String nome, double salario, int anoContratacao) {
        super(nome, salario, anoContratacao);
        setNomeSecretaria("");
    }

    public void reajustaSalario(double porcentagem) {
        // Adiciona 1% de bônus para cada ano de serviço
        double bonus = (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }

	public String getNomeSecretaria() {
		return nomeSecretaria;
	}

	public void setNomeSecretaria(String nomeSecretaria) {
		this.nomeSecretaria = nomeSecretaria;
	}
}

class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, double salario, int anoContratacao, String departamento) {
        super(nome, salario, anoContratacao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}

class Empresa {
    private static final int MAX_EMPS = 1000;
    private int numEmps;
    private Empregado[] emps;

    public Empresa() {
        emps = new Empregado[MAX_EMPS];
        numEmps = 0; // número de empregados na lista
    }

    public void adicionaEmpregado(Empregado emp) {
        if (numEmps == MAX_EMPS)
            return; // lista cheia
        emps[numEmps] = emp;
        numEmps++;
    }

    public void reajustaSalarios(double perc) {
        for (int i = 0; i < numEmps; i++)
            emps[i].reajustaSalario(perc);
    }

    public String mostrEmpregados() {
        String result = "\n";
        for (int i = 0; i < numEmps; i++)
            result = result + emps[i];
        return result;
    }
}

class TesteEmpresa {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Jonas", 3000.0, 2020);
        Gerente gerente = new Gerente("Marta", 5000.0, 2018);
        Diretor diretor = new Diretor("Carlos", 8000.0, 2015, "TI");

        Empresa empresa = new Empresa();

        empresa.adicionaEmpregado(empregado);
        empresa.adicionaEmpregado(gerente);
        empresa.adicionaEmpregado(diretor);

        System.out.println("Empregados antes do reajuste:");
        System.out.println(empresa.mostrEmpregados());

        empresa.reajustaSalarios(10.0);

        System.out.println("\nEmpregados após o reajuste de 10% nos salários:");
        System.out.println(empresa.mostrEmpregados());
    }
}


