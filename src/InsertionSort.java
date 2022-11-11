public class InsertionSort {
    private int[] vect;

    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    /* Neste método o algoritmo começa a ordenar do ínicio ao fim.
    public InsertionSort(int vect[]){
        int aux;
        int tam = 0;
        while(tam < vect.length - 1){
            if(vect[tam] > vect[tam+1]){
                aux = vect[tam];
                vect[tam] = vect[tam+1]; 
                vect[tam+1] = aux;
            }
            tam++;
        }
    }
    */
    // Neste método o algoritmo começa a ordenar do fim para o ínicio.
    public InsertionSort(int[] vect){


        int aux;
        int tam = vect.length - 1;
        while(tam > 0){
            if(vect[tam] < vect[tam -1]){
                aux = vect[tam];
                vect[tam] = vect[tam -1];
                vect[tam - 1] = aux;
            }
            tam--;
        }
    }
}
