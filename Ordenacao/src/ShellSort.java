public class ShellSort extends Algoritmo{

    public void InsertionSort(int vetor[], int tamanhoVetor){
        for(int i = 1; i < tamanhoVetor; i++){
            int chave = vetor[i];
            int j;

            for(j = i - 1; j >= 0 && vetor[j] > chave; j--){
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = chave;
        }
    }

    public void Ordenar(int vetor[], int incremento, int tamanhoVetor){
        if(incremento > 1){
            for(int i = incremento; i < tamanhoVetor; i++){
                int chave = vetor[i];
                int j;

                for(j = i - incremento; j >= 0 && vetor[j] > chave; j -= incremento){
                    vetor[j + incremento] = vetor[j];
                    this.iteracoes ++;
                }
                vetor[j + incremento] = chave;
                this.trocas++;
            }
            Ordenar(vetor, incremento /2, tamanhoVetor);
        }
    }
}
