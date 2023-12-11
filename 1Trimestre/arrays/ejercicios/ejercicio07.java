package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio07 {

    /*Buscar un elemento dentro de un array que nosotros le pedimos por teclado. Indicar
    la posición donde se encuentra. Si hay más de uno, indicar igualmente la posición. */

    public static void introducirValores(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores para el array: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numero(int arr[]){

        introducirValores(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        int num2=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(num2==arr[i]){
                System.out.println("El valor de la posicion "+i+" coincide con el nº: "
                +arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        numero(arr);
    }
}
