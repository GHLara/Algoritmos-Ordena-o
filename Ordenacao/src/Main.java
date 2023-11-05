import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Testes teste = new Testes(10000); //Insira o tamanho da base de dados
        teste.TesteShellSort();
        teste.TesteQuickSort();
        teste.TesteBubbleSort();

    }
}