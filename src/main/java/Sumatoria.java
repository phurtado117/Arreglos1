import java.util.Arrays;

public class Sumatoria {
    public void suma(){
        int[] numeros = {87,68,94,100,83,78,85,91,76,87};
        int[] ordenados = numeros;
        int sumatoria = 0;




        for (int i = 0; i < numeros.length; i++){
            sumatoria +=numeros[i];
            System.out.println("Se sumaron" + numeros.length + " elementos.");
            System.out.println("La suma de los elementos dela rreglo es: " + sumatoria);
            System.out.println("Los elementos del arreglo ordenados son: " + Arrays.toString(ordenados));



        }
    }

}

