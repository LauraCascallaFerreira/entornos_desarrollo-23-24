package ejercicios;

import java.util.Scanner;

public class ejercicio08 {

    /*Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis. Queremos
    mostrar todos los alumnos comunes en las dos asignaturas. Estos alumnos se guarden en
    un tercer arreglo y que sea el que se muestre. También indica el numero de alumnos que
    se repiten. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        int arr3[]= new int[5];

        System.out.println("Dame los ID de los alumnos de álgebra: ");
        for(int i=0; i<arr1.length; i++){
            int id1=sc.nextInt();
            arr1[i]=id1;
        }

        System.out.println("Dame los ID de los alumnos de análisis: ");
        for(int i=0; i<arr2.length; i++){
            int id2=sc.nextInt();
            arr2[i]=id2;
        }
        
        
    }
    
}
