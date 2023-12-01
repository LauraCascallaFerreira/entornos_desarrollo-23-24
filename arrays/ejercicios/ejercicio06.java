package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio06 {

    /*Pedir valores numéricos en dos arrays distintos y almacenar el resultado de los
    valores de cada posición (posición 0 del arreglo 1 + posición 0 del arreglo 2) y 
    mostrar el contenido de los 3 arreglos de esta forma. valor pos 0 arreglo 1 + valor 
    pos 0 arreglo 2 = valor pos 0 arreglo 3 valor pos 1 arreglo 1 + valor pos 1 
    arreglo 2 = valor pos 1 arreglo 3 ... */

    public static void sumaValores(int arr[]){
        
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
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[5];
        int j=0;

        introducirValores(arr1);
        System.out.println(Arrays.toString(arr1));

        introducirValores (arr2);
        System.out.println(Arrays.toString(arr2));

        for(int i=0; i<arr3.length; i++){
            arr3[j]=arr1[i]+arr2[i];
            j++;
        }
        System.out.println("La suma de las posiciones es: ");
        System.out.println(Arrays.toString(arr3));
    }
    
}
