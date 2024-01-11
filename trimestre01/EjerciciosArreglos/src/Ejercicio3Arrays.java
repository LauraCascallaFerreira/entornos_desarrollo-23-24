
public class Ejercicio3Arrays {

	public static void main(String[] args) {
		int [] numeros= {7,1,3,11,6,5,8,9,11,0};
		double suma=0;
		
		for(int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
		}
		double media=suma/numeros.length;
		System.out.println("La media de los elementos del array es "+media);

	}

}
