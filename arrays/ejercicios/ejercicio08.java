package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio08 {

    /*Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis. Queremos
    mostrar todos los alumnos comunes en las dos asignaturas. Estos alumnos se guarden en
    un tercer arreglo y que sea el que se muestre. También indica el numero de alumnos que
    se repiten. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[5];
        int j=0;

        System.out.println("Dame los valores para la primera cadena: ");
        for(int i=0; i<arr1.length; i++){
            int num1=sc.nextInt();
            arr1[i]=num1;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Dame los valores para la segunda cadena: ");
        for(int i=0; i<arr2.length; i++){
            int num2=sc.nextInt();
            arr2[i]=num2;
        }
        System.out.println(Arrays.toString(arr2));

        for(int i=0; i<arr3.length; i++){
            arr3[j]=arr1[i]+arr2[i];
            j++;
        }
        System.out.println("La suma de las posiciones es: ");
        System.out.println(Arrays.toString(arr3));
    }
    
}
