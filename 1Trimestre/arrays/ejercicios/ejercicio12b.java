package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float arr[] = new float[10];

        arr = introducirValores(arr);
        notas(arr);
    }

    public static float[] introducirValores(float[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 notas: ");
        for (int i = 0; i < arr.length; i++) {
            float num = sc.nextFloat();
            arr[i] = num;
        }
        return arr;
    }

    public static void notas(float[] arr) {
        int suspensos = 0, aprobados = 0, notables = 0, sobresalientes = 0;

        for (float num : arr) {
            if (num>= 0 && num < 5) {
                suspensos++;
            } else if (num >= 5 && num < 7) {
                aprobados++;
            } else if (num >= 7 && num < 9) {
                notables++;
            } else {
                sobresalientes++;
            }
        }

        System.out.println("Las notas son: " + Arrays.toString(arr));
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
    }
}


    

    
    

