import java.util.Arrays;
import java.util.Scanner;

public class ejercicio01 {
    /*Crear un array de 10 int y asignar valores manualmente. Escribir un programa que sume
     * todos los elementos y muestre el resultado
     */

    public static void sumarValores(int arr[]){
        int suma=0;
        for(int i=0; i<arr.length; i++){
            suma+=arr[i];
        }
        System.out.println("La suma de los valores introducidos es: "+suma);
    }

     public static void main(String[] args) {
        int suma=0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr));
        sumarValores(arr);
     }
}
