package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio03 {

    /*Crea un array o arreglo unidimensional con un tamaño de 10, inserta los valores
    numéricos que desees de la manera que quieras (manualmente o por consola) y muestra
    por pantalla la media de valores del array. */

    public static void main(String[] args) {
        float suma=0;
        float count=0;
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];

        System.out.println("Dame valores para el array:");

        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
            suma+=num;
            count++;
        }

        float media=suma/count;
        System.out.println(Arrays.toString(arr));
        System.out.println("La media de los números introducidos es: "+media);
    }
    
}
