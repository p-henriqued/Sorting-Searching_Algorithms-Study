public class MergeSort {
    private int[] vect;
    private int[] vectAux;

    public int[] getVect() {
        return vect;
    }
    public int[] getVectAux() {
        return vectAux;
    }

    public void mergeSort(int[] vect, int[]vectAux, int initial, int end){
        if(initial < end){
            int center = (initial+end)/2;
            mergeSort(vect, vectAux, initial, center);
            mergeSort(vect, vectAux, center+1, end);
            merge(vect, vectAux, initial, center, end);
        }
    }
    private void merge(int[] vect, int[] vectAux, int initial,int center, int end) {
        for(int i=initial;i<=end;i++){
            vectAux[i] = vect[i];
        }

        int ini = initial;
        int half = center+1;

        for(int j=initial; j<=end; j++){
            if(ini > center){
                vect[j] = vectAux[half++];
            }else if(half > end){
                vect[j] = vectAux[ini++];
            }else if(vectAux[ini] < vectAux[half]){
                vect[j] = vectAux[ini++];
            }else{
                vect[j] = vectAux[half++];
            }
        }
    }
}
