public class SelectionSort {
    private int[] vect;

    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public SelectionSort(int[] vect){
        int pos, aux; // variáveis auxiliares, Aux corresponde a variável para guarda o elemento da troca. 
                      // pos corresponde a variável que equivale para guarda o indice dos elementos de ordenação.
        for(int i=0;i<vect.length;i++){
            pos = i;
            for(int j=i+1; j<vect.length;j++){
                if(vect[j] < vect[pos]){
                    pos = j;
                }
            }
            aux = vect[i];
            vect[i] = vect[pos];
            vect[pos] = aux;
        }
    }
}
