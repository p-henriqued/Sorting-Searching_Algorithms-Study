public class HeapSort {
    private int[] vect;

    public int[] getVect() {
        return vect;
    }

    public HeapSort(int[] vect) {
        int tam = vect.length;
        for(int i=tam/2-1;i>=0; i--){
            heap(vect, tam, i);
        }

        for(int i=tam-1;i>=0;i--){
            int aux = vect[0];
            vect[0] = vect[i];
            vect[i] = aux;
            
            heap(vect, i, 0);
        }
    }

    private void heap(int[] vect, int tam, int i) {
        int bigger = i;
        int leftNoSon = 2*i+1;
        int rigthNoSon = 2*i+2;

        if(leftNoSon < tam && vect[leftNoSon] < vect[bigger]){
            bigger = leftNoSon;
        }
        if(rigthNoSon<tam && vect[rigthNoSon] < vect[bigger]){
            bigger = rigthNoSon;
        }

        if(bigger != i){
            int aux = vect[i];
            vect[i] = vect[bigger];
            vect[bigger] = aux; 

            heap(vect, tam, bigger);
        }
    }
}
