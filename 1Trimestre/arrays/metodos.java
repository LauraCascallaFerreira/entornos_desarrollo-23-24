import java.util.Random;

public class metodos {

      public static void main(String[] args) {

        //array aleatorio
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Genera números entre 1 y 100
        }

        //numero aleatorio
        int randomNumber = random.nextInt(50) + 1; // Genera un número aleatorio entre 1 y 50

        System.out.println("Número aleatorio entre 1 y 50: " + randomNumber);
      }
}
