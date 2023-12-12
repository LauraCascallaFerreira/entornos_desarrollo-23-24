import java.util.Scanner;
public class Ejercicio4Arrays {

	public static void main(String[] args) {

		int tamanho=0;
		int numInicial=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		tamanho=sc.nextInt();
		
		System.out.println("Introduce el número inicial");
		numInicial=sc.nextInt();
		
		int [] multiplos=new int[tamanho];
		rellenarArray(multiplos, numInicial);
		
		for(int i=0;i<multiplos.length;i++) {
			System.out.println(multiplos[i]);
		}
		
		
	
	}
	
	public static void rellenarArray(int [] multiplos, int numInicial) {
		for(int i=0;i<multiplos.length;i++) {
			multiplos[i]=numInicial*(i+1);
		}
	}

}
