public class BubbleSort extends Algoritmo{

    public void Ordenar(int[] vetor, int tamanhoVetor) {
        int temp = 0;
        long inicio = System.nanoTime();
        for(int i = 0; i < tamanhoVetor; i++){
            for(int j = 1; j < (tamanhoVetor - i); j ++){
                if(vetor[j-1] > vetor[j]){
                    temp = vetor[j -1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    this.trocas += 1;
                }
                this.iteracoes += 1;
            }
        }
        long fim = System.nanoTime();
        this.tempo = fim - inicio;
    }
}
