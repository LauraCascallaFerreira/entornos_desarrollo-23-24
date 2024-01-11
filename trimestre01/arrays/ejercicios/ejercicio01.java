package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio01 {

    /*Crea un array o arreglo unidimensional con un tamaño de 5, asígnale los valores
      numéricos manualmente (los que tú quieras) y muestralos por pantalla */

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        arr[0]=0;
        arr[1]=32;
        arr[2]=22;
        arr[3]=12;
        arr[4]=20;
        
        System.out.println(Arrays.toString(arr));
      }
    
}
