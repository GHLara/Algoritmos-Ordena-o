public class QuickSort extends Algoritmo{

    public void Ordenar(int vetor[], int inferior, int superior) {
        int pivo;
        if (inferior >= superior)
            return;

        pivo = particiona(vetor, inferior, superior);

        Ordenar(vetor, inferior, pivo - 1);
        Ordenar(vetor, pivo + 1, superior);
    }

    public int particiona(int vetor[], int inferior, int superior){
        int inicio = inferior - 1;
        int pivo = vetor[superior];

        for(int i = inferior; i <= superior - 1; i++){
            this.iteracoes++;
             if(vetor[i] < pivo){
                 inicio++;
                 int aux = vetor[inicio];
                 vetor[inicio] = vetor[i];
                 vetor[i] = aux;
                 this.trocas++;
             }
        }
        int aux = vetor[inicio + 1];
        vetor[inicio + 1] = vetor[superior];
        vetor[superior] = aux;
        this.trocas++;
        return inicio + 1;
    }
}
