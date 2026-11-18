import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        long nanoTime = System.nanoTime();

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


        List<Integer> list = g.generate(100000);
        System.out.println(list);

        Results benGenList = b.medir(() -> g.generate(100000), "Generacion de listado", "100");
        System.out.println(benGenList);
    }
}
// nanoTimme es mas preciso al momento de saber el tiempo exacto