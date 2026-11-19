import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Metodos m = new Metodos();


        /*long nanoTime = System.nanoTime();

        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("Nano Time: " + nanoTime);
        System.err.println("currentTimeMillis: " + currentTimeMillis);


        //Es una funcion ejecutable es decir ->
        //en la variable funcion 
        /*Runnable funcion = () -> {
             System.out.println("Ejecutando tarea1");
             System.out.println("Ejecutando Tarea 2");
            };

            List<Integer> list = new ArrayList<>();
            MetodosDeOrd mO = new MetodosDeOrd();
            mO.burbuja(list);
            Runnable burbujaOrden
            */

        //() runnable no devuelve nada
        // Callable<T> x me retorna algo
        //System.out.println("Ejecucion de la funcion runnable:");

        //funcion.run();

        Generador g = new Generador();
        Benchmark b = new Benchmark();


        int[] list = g.generate(100000);
        System.out.println(list);

        Results benGenList = b.medir(() -> g.generate(100000), "Generacion de listado", "100");
        System.out.println(benGenList);

            // los 3 arreglos base
            //1000
            //List<Integer> list1 = g.generate(1000);

            //List<Integer> list2 = g.generate(5000);

            //List<Integer> list3 = g.generate(10000);

    
            
            //1->List<List<Integer>> lista = List.of(lista1, lista2, lista3);
           //2-> List<List<Integer>[] listas =  new List<Integer>[]{lista1};

           //2* Copia de listas si no funciona con el List<Integer> listc1 = list.clone();
                /*List<Integer> copialista1 = new ArrayList<>(list1);
                List<Integer> copialista2 = new ArrayList<>(list2);
                List<Integer> copialista3 = new ArrayList<>(list3);
                */

            int[] list1 = g.generate(1000);

            int[] list2 = g.generate(5000);

            int[] list3 = g.generate(10000);
            


               int[] listC1 = list1.clone();
               int[] listC2 = list2.clone();
               int[] listC3 = list3.clone();

            Results resultaM1S1 = Benchmark.medir(
                 () -> m.sortBuble(list1), "Burbuja", "10.000");

            Results resultaM1S2 = Benchmark.medir(
                 () -> m.sortBuble(list2), "Burbuja", "50.000");
                
            Results resultaM1S3 = Benchmark.medir(
                () ->  m.sortBuble(list3), "Burbuja", "100.000");
        }
}
// nanoTimme es mas preciso al momento de saber el tiempo exacto