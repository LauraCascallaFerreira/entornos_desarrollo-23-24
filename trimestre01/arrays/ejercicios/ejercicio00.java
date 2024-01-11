package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio00 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la longitud del array: ");
        int longitud = sc.nextInt();

        int arr[] = new int[longitud];

        System.out.println("Dame los valores de las posiciones: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Los valores son: "+Arrays.toString(arr));
    }
    
}
