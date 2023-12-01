package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio02 {

    /*Modifica el ejercicio anterior para que insertes los valores numéricos con leer
      mediante un bucle y los muestre por pantalla. */

      public static void introducirValores(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores para el array: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
      }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        introducirValores(arr);
        
        System.out.println(Arrays.toString(arr));
      }
    
}
