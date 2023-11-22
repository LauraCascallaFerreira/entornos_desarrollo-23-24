package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio06 {

    /*Pedir valores numéricos en dos arrays distintos y almacenar el resultado de los
    valores de cada posición (posición 0 del arreglo 1 + posición 0 del arreglo 2) y 
    mostrar el contenido de los 3 arreglos de esta forma. valor pos 0 arreglo 1 + valor 
    pos 0 arreglo 2 = valor pos 0 arreglo 3 valor pos 1 arreglo 1 + valor pos 1 
    arreglo 2 = valor pos 1 arreglo 3 ... */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        int arr3[]=new int[5];

        System.out.println("Dame los valores para la primera cadena: ");
        for(int i=0; i<arr1.length; i++){
            int num1=sc.nextInt();
            arr1[i]=num1;
        }

        System.out.println("Dame los valores para la segunda cadena: ");
        for(int i=0; i<arr2.length; i++){
            int num2=sc.nextInt();
            arr1[i]=num2;
        }

        for(int i=0; i<arr3.length; i++){
            arr3[i]=arr1[i]+arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
    
}
