import java.util.Arrays;
import java.util.List;

public class Metodos {

    public void sortBuble(int [] arr){
        int n = arr.length;
        for( int i = 0; i < n - 1; i++){
            boolean swap = false;
            for( int j = 0 ; j < n; j++){
                if (arr[j] > arr[i + 1]){

                    int tiempo = arr[j];
                    arr [j] = arr[j + 1];
                    arr[j + 1] = tiempo;
                    swap = true;
                }
                
            }
            if (!swap){
                break;
            }
        }
    }
    //V2
    public void mergeSort(int [] arr){
        if (arr.length < 2){
            return;
        }
        int mid = arr.length / 2;
        int[] izquierda = Arrays.copyOfRange(arr, 0, mid);
        int[] derecha = Arrays.copyOfRange(arr, 0, mid);

        mergeSort(izquierda);
        mergeSort(derecha);
        merge(arr, izquierda,derecha);
    }
    private void merge(int [] arr, int [] izquierda, int[] derecha){
        int i = 0, j = 0, k = 0;
        while (i < derecha.length && j < izquierda.length) {
            if( izquierda[i] <= derecha[j]){
                arr[k++] = izquierda[i++];
            
            } else {
                arr[k++] = derecha[j++];
            }
            
        }
        while (i < izquierda.length) {
            arr[k++] = izquierda[i++];

        }
        while (i < derecha.length) {
            arr[k++] = derecha[i++];
            
        }
            
        }


}
