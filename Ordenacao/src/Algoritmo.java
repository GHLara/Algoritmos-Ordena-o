import java.text.DecimalFormat;

public class Algoritmo {
    public double tempo;
    public int trocas;
    public int iteracoes;

    public void printarResultados(){

        System.out.println(
                "Tempo de execução: " + this.tempo / 1000000 + "ms\n" +
                "Quantidade de trocas: " + this.trocas / 5 + "\n" +
                "Quantidade de iteraçoes: " + this.iteracoes / 5 + "\n"
        );
    }
}
