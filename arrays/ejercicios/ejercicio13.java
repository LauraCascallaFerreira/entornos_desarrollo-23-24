package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio13 {

    /*13) Realizar un programa con el siguiente menú:
    1. Llenar Vector A de manera aleatoria.
    2. Llenar Vector B de manera aleatoria.
    3. Realizar C=A+B
    4. Realizar C=B-A
    5. Mostrar (Permitiendo al usuario elegir entre el Vector A, B, o C).
    6. Salir. NOTA.
    El rango de los números aleatorios para los Vectores será de [-100 a 100].
    La longitud de los Vectores es la misma, por lo tanto, solo se solicitará una vez. */

    public static int randomA(){
        Random rand = new Random();
        int min = -100;
        int max = 100;

        // Genera un número aleatorio entre min (inclusive) y max (exclusive)
        int vectorA = rand.nextInt(max-min) + min;
        return vectorA;
    }

    public static int randomB(){
        Random rand = new Random();
        int min = -100;
        int max = 100;

        // Genera un número aleatorio entre min (inclusive) y max (exclusive)
        int vectorB = rand.nextInt(max-min) + min;
        return vectorB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ultimo="";

        int arr[] = new int[5];
        arr[0]=randomA();
        arr[1]=randomB();
        arr[2]=arr[0]+arr[1];
        arr[3]=arr[0]-arr[1];
    }
    
}
