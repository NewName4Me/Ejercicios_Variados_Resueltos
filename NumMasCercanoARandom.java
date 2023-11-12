package ActividadesDuras_MasoMenos;
import java.util.Scanner;
import java.util.Random;

public class NumMasCercanoARandom {
    public static void main(String[] args) {
        /*
        Queremos un programa donde se genere un número aleatorio y el usuario
        empiece a introducir números hasta que introduzca el 0.
        Tenemos que indicar cuál de los números que ha introducido estaba más cerca del número aleatorio generado.
        */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables
        int rand;
        int num; // Número que el usuario introduce
        int cerca = Integer.MAX_VALUE; // Inicializamos con un valor muy grande
        int numSave = 0;
        int dist;//distancia entre el valor aleatorio y el introducido

        // Programa
        rand = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        System.out.println( rand); //para hacer trampitas y comprobar que funciona 

        do {
            num = scanner.nextInt();
            if (num != 0) {
                dist = Math.abs(rand - num);
                if (dist < cerca) {//cada vez que un num esta mas cerca tiene menos distancia y se guarda
                    cerca = dist;
                    numSave = num;//para guardar nuestro numero y poder imprimirlo al final
                }
            }
            if (num==rand){//en caso de que acierte por algun casual
                break;
            }
        } while (num != 0);
        
        
        //salida
        if (num==rand){
            System.out.println("Acertaste maquina ");
        }
        else{
            System.out.println("El número más cercano es: " + numSave);
        }

        
    }
}

