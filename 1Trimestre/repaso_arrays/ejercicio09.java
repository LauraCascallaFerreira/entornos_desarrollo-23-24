import java.util.Arrays;
import java.util.Scanner;

public class ejercicio09 {
    /*9) Pedir por teclado el tamaño de un arreglo de números y pedir los valores numéricos
    con los que se rellena. Los valores no se pueden repetir. Mostrar el arreglo con los
    valores al final. */
    
    public static int pedirTamaño(){
        Scanner sc = new Scanner(System.in);
        int tamaño;
        System.out.println("Dime el tamaño del array:");
        tamaño=sc.nextInt();
        return tamaño;
    }

    public static void introducirValores(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[pedirTamaño()];
        System.out.println("Dame valores para el array:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        introducirValores();
    }

}
