import java.util.Scanner;

public class ejemplo01 {

    public static void main(String[] args) {

        int suma=0;
        int [] arr = new int[5];

        for (int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un valor:");
            arr[i]=sc.nextInt();
            suma+=arr[i];
        }

        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("La suma de estos números es: "+suma);

    }
    
}
