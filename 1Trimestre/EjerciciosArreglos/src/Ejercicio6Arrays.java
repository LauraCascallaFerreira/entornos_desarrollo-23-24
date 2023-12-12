
public class Ejercicio6Arrays {
	
	public static void main(String [] args) {
		int [] numeros1= {4,5,7,8,98,3,5,6};
		int [] numeros2= {6,7,1,2,3,4,3,5};
		
		if(numeros1.length!=numeros2.length) {
			System.out.println("Los arrays iniciales no son del mismo tamaño");
		}else {
			int [] suma=new int[numeros1.length];
			
			for(int i=0;i<suma.length;i++) {
				suma[i]=numeros1[i]+numeros2[i];
				System.out.println("La suma de "+numeros1[i]+" + "+numeros2[i]+"="+suma[i]);
			}
		}
		
		
		
	}
	


}
