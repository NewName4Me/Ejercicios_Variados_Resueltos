package ActividadesDuras_MasoMenos;
import java.util.Scanner;

public class Es_Palindromo {

    public static void main(String[] args) {
        /*
        Insertamos una palabra y nos dice si es o no un palindromo 
        (se lee igual del derecho que del reves)
         */
        Scanner scanner = new Scanner(System.in);

        //variables
        String original;
        String reversed = "";

        //programa
        System.out.print("Inserte una palabra y le indico si es palindromo: ");
        original = scanner.nextLine();

        for (int i = 0; i < original.length(); i++) {
            reversed = original.charAt(i) + reversed;//intercambia el orden de las letras de mi frase o palabra
        }
        //System.out.println(reversed); //para ver si funciona

        
        //salida
        if (reversed.equals(original)) {//comprueba si son iguales para ver si son palindromo
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo, " + reversed + " no es igual que " + original);
        }

    }
}
