import java.util.Arrays;
import java.util.Scanner;

public class ejercicio08 {
    /*8) Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis. 
    Queremos mostrar todos los alumnos comunes en las dos asignaturas. Estos alumnos se 
    guarden en un tercer arreglo y que sea el que se muestre. También indica el numero 
    de alumnos que se repiten. */

    public static void introducirValores(float[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los IDs de la clase de álgebra:");
        for(int i=0; i<arr.length; i++){
            float num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void introducirValores2(float arr2[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los IDs de la clase de análisis:");
        for(int i=0; i<arr2.length; i++){
            float num=sc.nextInt();
            arr2[i]=num;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void introducirValores3(float arr[], float arr2[], float arr3[]){
        int j=0;
        for(int i=0; i<arr3.length/2; i++){
            arr3[i]=arr[i];
            arr3[i]=arr2[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        float arr[] = new float[5];
        float arr2[] = new float[5];
        float arr3[] = new float[5];
        introducirValores(arr);
        introducirValores2(arr2);
        introducirValores3(arr, arr2, arr3);
    }
}
