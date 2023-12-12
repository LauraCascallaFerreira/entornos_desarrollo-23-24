import java.util.Arrays;
import java.util.Scanner;

public class ArrayInvertido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arrInvertido[]=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arrInvertido[arr.length-i-1]=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrInvertido));
    }
    
}
