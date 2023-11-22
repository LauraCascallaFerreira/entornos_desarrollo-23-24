package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12 {

    /*Suponga un array que contiene N notas de 0 a 10 generados aleatoriamente y
    mostradas en pantalla, de acuerdo con la nota contenida, indique cuántos estudiantes
    son:
    Suspensos 0-4
    Aprobados 5-6
    Notables 7-8
    Sobresalientes 9-10 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float arr[] = new float[10];
        int suspensos=0;
        int aprobados=0;
        int notables=0;
        int sobresalientes=0;

        System.out.println("Dame 10 notas: ");
        for(int i=0; i<arr.length; i++){
            float num=sc.nextInt();
            
            if(num>=0 && num<5){
                suspensos++;
            } else if(num>=5 && num<7){
                aprobados++;
            } else if(num>=7 && num<9){
                notables++;
            } else sobresalientes++;

            arr[i]=num;
        }

        System.out.println("Las notas son: "+Arrays.toString(arr));
        System.out.println("Suspensos: "+suspensos);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Notables: "+notables);
        System.out.println("Sobresalientes: "+sobresalientes);
    }
    
}
