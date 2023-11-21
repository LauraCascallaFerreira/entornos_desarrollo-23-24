package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio04 {

    /*Crea un array donde tú le indiques el tamaño por teclado y
    crear una función que rellene el array o arreglo con los múltiplos de un numero pedido
    por teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el
    array contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño del array:");
        int tamaño=sc.nextInt();
        int arr[] = new int[tamaño];

        System.out.println("Dame un número: ");
        int num=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            arr[i]=num*i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
