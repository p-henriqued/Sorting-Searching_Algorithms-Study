public class ShellSort {
    private int[] vect;


    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public ShellSort(int [] vect){
        int h =1;
        while(h<vect.length){
            h = h * 3 + 1;
        }
        //casting atribuindo o valor de double para int, Math.floor é responsável por retornar o menor número double
        h = (int) Math.floor(h/3);

        //variáveis Auxiliares.
        int elemento ,j;
        //Método:
        while(h > 0){
            for(int i = h; i<vect.length; i++){
                elemento = vect[i];
                j = i;
                while(j >= h && vect[j-h] > elemento){
                    vect[j] = vect[j-h];
                    j = j -h;
                }
                vect[j] = elemento;
            }
            h = h/2;
        }

    }
}
