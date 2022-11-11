
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vect = new int[10];
        System.out.println("Vetor:");
        for(int i=0; i<vect.length; i++){
            vect[i] = (int) (Math.random()*100);
            System.out.print(vect[i]+", ");
        }
        System.out.println("");
        
        System.out.println("\nVetor Organizado Heap Sort: ");
        HeapSort heapSort = new HeapSort(vect);
        System.out.println(Arrays.toString(vect));
        

    }
}
