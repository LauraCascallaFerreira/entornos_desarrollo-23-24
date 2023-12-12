import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio03 {
    /*Array de numeros random, el usuario te dará un número. Buscar ese número y devolver
     * el índice en que se encuentra, si no hay devolver -1
     */

     public static void introducirValores(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores para el array: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numero(int arr[]){
        introducirValores(arr);
        boolean encontrarNumero=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        int num=sc.nextInt();
        
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				encontrarNumero=true;
				System.out.println("El valor"+num+"se encuentra en la posición: "+i);
			}
		}
		if(encontrarNumero==false) {
			System.out.println("-1");

		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        numero(arr);
    }
}
