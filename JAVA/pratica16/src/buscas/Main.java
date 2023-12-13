package buscas;

public class Main {
    public static void main(String[] args) throws Exception {

        Buscas busca = new Buscas();

        busca.addnum();
        busca.informeValor();
        busca.search_sentinel();
        int resultado = busca.search();
        int resultado_sentinela = busca.search();

        if (resultado != -1)
            System.out.println("O valor que procura está no " + (busca.getI() + 1) + "º slot.");
        else if (resultado_sentinela == -1)
            System.out.println("Sentinela encontrada!");
        else
            System.out.println("Não encontramos o resultado que busca.");

    }
}
