import java.util.Arrays;
import java.util.Scanner;

public class ejercicio02 {
    /*2)Modifica el ejercicio anterior para que insertes los valores numéricos con leer
        mediante un bucle y los muestre por pantalla. */

    public static void introducirValores(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame "+arr.length+" números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        introducirValores(arr);
    }
}
