



public class Benchmark {
    

    public static Results medir(Runnable accion, String nombre, String sample){

        System.out.println("Funcion: " + nombre);
        //Metodo para medir el tiempo de duracion 
        //Tiempo actual
        long tiempoActual = System.nanoTime();

        //accion
        accion.run();

        //tiempo final
        long tiempoFinal = System.nanoTime();
     

        Results results = new Results(nombre, (tiempoActual - tiempoFinal), sample);
        //retornar el tiempo de duracion
        return results;   //solo nos devuelve 1 argumento


    }

}
