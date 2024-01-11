import java.util.Scanner;
public class Ejercicio8Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numAlgebra,numAnalisis;
		
		System.out.println("Introduce el número de alumnos de Álgebra");
		numAlgebra=sc.nextInt();
		System.out.println("Introduce el número de alumnos de análisis");
		numAnalisis=sc.nextInt();
		
		int [] alumnosAlgebra =new int[numAlgebra];
		int [] alumnosAnalisis=new int[numAnalisis];
		int [] alumnosComunes;
		
		//Guardar los IDS de Álgebra
		alumnosAlgebra=crearYrellenar(numAlgebra);
		//Guardar los IDS de Análisis
		alumnosAnalisis=crearYrellenar(numAnalisis);
		alumnosComunes=alumnosComunes(alumnosAlgebra,alumnosAnalisis);
		
		System.out.println("HAY "+alumnosComunes.length+" alumnos en común");
		for(int idAlumno:alumnosComunes) {
			System.out.println(idAlumno);
		}
		
	}
	
	public static int [] crearYrellenar(int tamanho) {
		Scanner sc=new Scanner(System.in);
		int [] alumnos=new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Introduzca al alumno "+(i+1));
			alumnos[i]=sc.nextInt();
		}
		return alumnos;
	}
	
	public static int[] alumnosComunes(int [] algebra,int [] analisis) {
		int numComunes=0;
		for(int i=0;i<algebra.length;i++) {
			for(int j=0;j<analisis.length;j++) {
				if(algebra[i]==analisis[j]) {
					numComunes++;
				}
			}
		}
		int [] comunes= new int[numComunes];
				

		int pos=0;
		for(int i=0;i<algebra.length;i++) {
			for(int j=0;j<analisis.length;j++) {
				if(algebra[i]==analisis[j]) {
					comunes[pos]=algebra[i];
					pos++;
				}
			}
		}
		return comunes;
		
	}
}
