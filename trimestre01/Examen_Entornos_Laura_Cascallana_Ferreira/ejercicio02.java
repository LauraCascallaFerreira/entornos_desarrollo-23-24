import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio02 {
    /*Crear array de números reales de tamaño indicado por el usuario. Darle valores
     * random y hacer y mostrar la media de estos.
     */

    public static int pedirTamaño(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño para el array: ");
        int tamaño=sc.nextInt();
        return tamaño;
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        float arr[] = new float[pedirTamaño()];
        float suma=0; float count=0; float media=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=random.nextFloat(10);
            suma+=arr[i];
            count++;
        }

        media=suma/count;
        System.out.println(Arrays.toString(arr));
        System.out.println("La media de los valores generados es: "+media);
        
     }
}
