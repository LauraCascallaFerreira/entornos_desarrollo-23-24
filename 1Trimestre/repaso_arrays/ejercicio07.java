import java.util.Arrays;
import java.util.Scanner;

public class ejercicio07 {
    /*7) Buscar un elemento dentro de un arreglo que nosotros le pedimos por teclado. 
    Indicar la posición donde se encuentra. Si hay más de uno, indicar igualmente la 
    posición.*/
    public static void introducirValores(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int count=0;
        introducirValores(arr);
        System.out.println("Dame un número:");
        int num=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
                System.out.println("El número coincide con la posición: "+i);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("El número se ha repetido un total de "+count+" veces.");
    }
}
