package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio07 {

    /*Buscar un elemento dentro de un arreglo que nosotros le pedimos por teclado. Indicar
    la posición donde se encuentra. Si hay más de uno, indicar igualmente la posición. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Dame valores para el array:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }

        System.out.println("Dame un número: ");
        int num2=sc.nextInt();

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(num2==arr[i]){
                System.out.println("El valor de la posicion "+i+" coincide con el nº: "
                +arr[i]);
            }
        }
    }
    
}
