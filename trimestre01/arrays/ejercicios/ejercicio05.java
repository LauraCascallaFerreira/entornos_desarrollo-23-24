package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio05 {

    /*Crea dos arrays que tengan el mismo tamaño (se pedirá
    por teclado), en uno de ellos almacenarás nombres de personas como cadenas, en el otro
    array ira almacenando la longitud de los nombres, para ello puedes usar la
    función que java ofrece para devolver la longitud de una cadena. Muestra por pantalla 
    el nombre y la longitud que tiene. Puedes usar funciones si lo deseas. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr1[] = new String[5];
        int arr2[] = new int[5];

        System.out.println("Dame cinco nombres: ");
        for(int i=0; i<arr1.length; i++){
            String nombre=sc.nextLine();
            arr1[i]=nombre;
        }

        for(int i=0; i<arr2.length; i++){
            arr2[i]=arr1[i].length();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
    }
    
}
