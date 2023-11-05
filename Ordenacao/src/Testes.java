import java.util.Random;

public class Testes {
    int tamanhoVetor;
    int vetorBubbleSort[];
    int vetorQuickSort[];
    int vetorShellSort[];

    public Testes(int tamanho) {
        this.tamanhoVetor = tamanho;
    }

    private void preencherVetor(int vetor[], int seed){
        Random random = new Random(seed);
        for(int i = 0; i <= this.tamanhoVetor - 1; i++){
            int numeroAleatorio = random.nextInt(this.tamanhoVetor);
            vetor[i] = numeroAleatorio;
        }
    }

    public void TesteBubbleSort(){
        int []vetor1 = new int[tamanhoVetor];
        int []vetor2 = new int[tamanhoVetor];
        int []vetor3 = new int[tamanhoVetor];
        int []vetor4 = new int[tamanhoVetor];
        int []vetor5 = new int[tamanhoVetor];
        preencherVetor(vetor1, 42);
        preencherVetor(vetor2, 13);
        preencherVetor(vetor3, 7);
        preencherVetor(vetor4, 18);
        preencherVetor(vetor5, 12);

        BubbleSort bubbleSort = new BubbleSort();
        long inicio1 = System.nanoTime();
        bubbleSort.Ordenar(vetor1, tamanhoVetor);
        long fim1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        bubbleSort.Ordenar(vetor1, tamanhoVetor);
        long fim2 = System.nanoTime();

        long inicio3 = System.nanoTime();
        bubbleSort.Ordenar(vetor1, tamanhoVetor);
        long fim3 = System.nanoTime();

        long inicio4 = System.nanoTime();
        bubbleSort.Ordenar(vetor1, tamanhoVetor);
        long fim4 = System.nanoTime();

        long inicio5 = System.nanoTime();
        bubbleSort.Ordenar(vetor1, tamanhoVetor);
        long fim5 = System.nanoTime();

        long inicio = (inicio1 + inicio2 + inicio3 + inicio4 + inicio5) / 5;
        long fim = (fim1 + fim2 + fim3 + fim4 + fim5) / 5;

        bubbleSort.tempo = fim - inicio;
        System.out.println("Resultado BubbleSort: ");
        bubbleSort.printarResultados();
    }

    public void TesteQuickSort(){
        int []vetor1 = new int[tamanhoVetor];
        int []vetor2 = new int[tamanhoVetor];
        int []vetor3 = new int[tamanhoVetor];
        int []vetor4 = new int[tamanhoVetor];
        int []vetor5 = new int[tamanhoVetor];


        preencherVetor(vetor1, 42);
        preencherVetor(vetor2, 13);
        preencherVetor(vetor3, 7);
        preencherVetor(vetor4, 18);
        preencherVetor(vetor5, 12);

        QuickSort quickSort = new QuickSort();
        long inicio1 = System.nanoTime();
        quickSort.Ordenar(vetor1,0, tamanhoVetor - 1);
        long fim1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        quickSort.Ordenar(vetor2,0, tamanhoVetor - 1);
        long fim2 = System.nanoTime();

        long inicio3 = System.nanoTime();
        quickSort.Ordenar(vetor3,0, tamanhoVetor - 1);
        long fim3 = System.nanoTime();

        long inicio4 = System.nanoTime();
        quickSort.Ordenar(vetor4,0, tamanhoVetor - 1);
        long fim4 = System.nanoTime();

        long inicio5 = System.nanoTime();
        quickSort.Ordenar(vetor5,0, tamanhoVetor - 1);
        long fim5 = System.nanoTime();

        long inicio = (inicio1 + inicio2 + inicio3 + inicio4 + inicio5) / 5;
        long fim = (fim1 + fim2 + fim3 + fim4 + fim5) / 5;

        quickSort.tempo = fim - inicio;
        System.out.println("Resultado QuickSort: ");
        quickSort.printarResultados();
    }

    public void TesteShellSort(){
        ShellSort shellSort = new ShellSort();
        int []vetor1 = new int[tamanhoVetor];
        int []vetor2 = new int[tamanhoVetor];
        int []vetor3 = new int[tamanhoVetor];
        int []vetor4 = new int[tamanhoVetor];
        int []vetor5 = new int[tamanhoVetor];


        preencherVetor(vetor1, 42);
        preencherVetor(vetor2, 13);
        preencherVetor(vetor3, 7);
        preencherVetor(vetor4, 18);
        preencherVetor(vetor5, 12);

        long inicio1 = System.nanoTime();
        shellSort.Ordenar(vetor1,tamanhoVetor / 2, tamanhoVetor - 1);
        long fim1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        shellSort.Ordenar(vetor2,tamanhoVetor / 2, tamanhoVetor - 1);
        long fim2 = System.nanoTime();

        long inicio3 = System.nanoTime();
        shellSort.Ordenar(vetor3,tamanhoVetor / 2, tamanhoVetor - 1);
        long fim3 = System.nanoTime();

        long inicio4 = System.nanoTime();
        shellSort.Ordenar(vetor4,tamanhoVetor / 2, tamanhoVetor - 1);
        long fim4 = System.nanoTime();

        long inicio5 = System.nanoTime();
        shellSort.Ordenar(vetor5,tamanhoVetor / 2, tamanhoVetor - 1);
        long fim5 = System.nanoTime();

        long inicio = (inicio1 + inicio2 + inicio3 + inicio4 + inicio5) / 5;
        long fim = (fim1 + fim2 + fim3 + fim4 + fim5) / 5;

        shellSort.tempo = fim - inicio;
        System.out.println("Resultado QuickSort: ");
        shellSort.printarResultados();
    }
}
