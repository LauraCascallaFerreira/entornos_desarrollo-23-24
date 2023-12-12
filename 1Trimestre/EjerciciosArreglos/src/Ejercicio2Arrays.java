import java.util.Scanner;
public class Ejercicio2Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] numeros=new int[5];
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce la posición "+(i+1));
			numeros[i]=sc.nextInt();
		}
		
		for(int num:numeros) {
			System.out.println(num);
		}
		System.out.println(numeros);
		sc.close();
	}
	
}
