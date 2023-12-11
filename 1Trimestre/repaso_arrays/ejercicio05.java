import java.util.Arrays;
import java.util.Scanner;

public class ejercicio05 {
    /*5) Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (se pedirá
    por teclado), en uno de ellos almacenarás nombres de personas como cadenas, en el otro
    array o arreglo ira almacenando la longitud de los nombres, para ello puedes usar la
    función que java ofrece para devolver la longitud de una cadena. Muestra por pantalla 
    el nombre y la longitud que tiene. Puedes usar funciones si lo deseas.*/

    public static void introducirValores(String[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco nombres:");
        for(int i=0; i<arr.length; i++){
            String nombre=sc.nextLine();
            arr[i]=nombre;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void longitudes(String arr[], int arr2[]){
        for(int i=0; i<arr2.length; i++){
            arr2[i]=arr[i].length();
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        int arr2[] = new int[5];

        introducirValores(arr);
        longitudes(arr, arr2);
    }
}
