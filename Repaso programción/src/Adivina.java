import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivina {


    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 11);
        int numeroIntento = -1;
        int intentos = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduzca un numero");
                numeroIntento = teclado.nextInt();
                if (numeroIntento == numeroAleatorio) {
                    System.out.println("Numero pillado");
                } else {
                    System.out.println("Try again bro");
                }
                intentos++;
            }catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                teclado.next();
            }
        } while (numeroAleatorio!= numeroIntento);
    }
}

