import java.util.Arrays;
import java.util.Scanner;

public class ejercicio06 {

    /*6)Pedir valores numéricos en dos arrays distintos y almacenar el resultado de los
        valores de cada posición (posición 0 del arreglo 1 + posición 0 del arreglo 2) y 
        mostrar el contenido de los 3 arreglos de esta forma. valor pos 0 arreglo 1 + 
        valor pos 0 arreglo 2 = valor pos 0 arreglo 3 valor pos 1 arreglo 1 + valor pos 
        1 arreglo 2 = valor pos 1 arreglo 3 ... */

    public static void introducirValores(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Primera cadena:");
        System.out.println(Arrays.toString(arr));
    }

    public static void introducirValores2(int arr2[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame otros cinco números");
        for(int i=0; i<arr2.length; i++){
            int num=sc.nextInt();
            arr2[i]=num;
        }
        System.out.println("Segunda cadena:");
        System.out.println(Arrays.toString(arr2));
    }

    public static void introducirValores3(int arr[], int arr2[], int arr3[]){
        for(int i=0; i<arr3.length; i++){
            arr3[i]=arr[i]+arr2[i];
        }
        System.out.println("Tercera cadena:");
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        int arr2[]=new int[5];
        int arr3[]=new int[5];

        introducirValores(arr);
        introducirValores2(arr2);
        introducirValores3(arr, arr2, arr3);
    }
}
