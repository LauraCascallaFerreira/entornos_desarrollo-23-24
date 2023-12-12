import java.util.Scanner;
public class Ejercicio9Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número de elementos");
		int tamanho=sc.nextInt();
		int [] miArray=new int[tamanho];
		int elemento;
		boolean repetido;
		for(int i=0;i<miArray.length;i++) {
			do {
				System.out.println("Introduce el valor "+(i+1));
				elemento=sc.nextInt();
				repetido=esRepetido(miArray,i,elemento);
				if(repetido) {
					System.out.println("ELEMENTO REPETIDO");
				}
			}while(repetido);
			miArray[i]=elemento;
		}
		
	}
	
	public static boolean esRepetido(int [] valores,int posActual,int valorNuevo)
	{
		for(int i=0;i<posActual;i++) {
			if(valorNuevo==valores[i]) {
				return true;
			}
		}
		return false;
	}
}
