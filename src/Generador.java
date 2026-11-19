
import java.util.ArrayList;
import java.util.List;

public class Generador {

    //genera un listado de tamaño size
    // con numeros aleatroio de 0 a size
    /*
    Codigo parA PODER HACER UNA COPIA CON EL NEW ArrayList<>();
    public static List<Integer> generate(int size){

        List<Integer> list = new ArrayList<>();
        for ( int i = 0; i < size; i++){

            list.add((int)(Math.random() * size));

        }

        return list;
    
    }*/
    //CODIGO PARA Hacer una copia de una lista pero de arrglosa de enteros
        public static int[] generate(int size){
            int[] list = new int[size];
        for ( int i = 0; i < size; i++){

            list[i] = (int) (Math.random() * size);

        }

        return list;
    
    }
}
