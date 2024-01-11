import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejericicio5Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tamanho=0;
		
		
			do {
				try {
					System.out.println("Introduce el número de nombres");
					tamanho=sc.nextInt();
					if(tamanho<1) {
						System.out.println("El número de nombres no puede ser menor de 1");
					}
					sc.nextLine();
				}catch(InputMismatchException e) {
					System.out.println("ERROR, dato inválido");
					tamanho=0;
					sc.nextLine();
				}
			}while(tamanho<1);
			
		
		
		
		
		String [] nombres=new String[tamanho];
		int [] longNombres=new int[tamanho];

		for(int i=0;i<nombres.length;i++) {
			System.out.println("Introduce el nombre "+(i+1));
			nombres[i]=sc.nextLine();
			longNombres[i]=nombres[i].length();
		}
		
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Nombre "+(i+1)+": "+nombres[i]+" longitud: "+longNombres[i]);
		}
	}

}
