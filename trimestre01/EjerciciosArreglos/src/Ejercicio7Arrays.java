import javax.swing.JOptionPane;

public class Ejercicio7Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miArray= {3,4,5,1,8,9,10,2,9,6};
		boolean numCorrecto=false;
		int valorInt = 0;
		String mensaje="";
		do {
		try {
			
				String valor=JOptionPane.showInputDialog("Introduce un valor");
				valorInt=Integer.parseInt(valor);
				numCorrecto=true;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El valor introducido no es un entero");
			}
		}
		while(!numCorrecto);
		boolean encontrado=false;
		for(int i=0;i<miArray.length;i++) {
			if(miArray[i]==valorInt) {
				encontrado=true;
				mensaje="El valor "+valorInt+" se encuentra en la posicion "+i;
				JOptionPane.showMessageDialog(null, mensaje);
			}
		}
		if(!encontrado) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el elemento en el array");

		}
		
		
		
		
		

	}

}
