public class BubbleSort {
    private int[] vect;

    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public BubbleSort(int[] vect) {
        int aux; 
        for (int i = 0; i < vect.length; i++) {
            for (int j = i+1; j < vect.length; j++) {
                if(vect[i] > vect[j]){
                    aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }
    }
}
