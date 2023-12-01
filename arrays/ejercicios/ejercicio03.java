package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio03 {

    /*Crea un array o arreglo unidimensional con un tamaño de 10, inserta los valores
    numéricos que desees de la manera que quieras (manualmente o por consola) y muestra
    por pantalla la media de valores del array. */

    public static float mediaArray(int arr[]){
        float suma=0; 
        float count=0;
        float media=0;
        for(int i=0; i<arr.length; i++){
            suma+=arr[i];
            count++;
        }
        return media=suma/count;
    }

    public static void introducirValores(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores para el array: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
      }

    
    public static void main(String[] args) {
        float suma=0;
        float count=0;
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        introducirValores(arr);
        System.out.println("La media de los números dados es: "+mediaArray(arr));
    }
    
}
