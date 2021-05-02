import java.util.Scanner;

public class Elecciones {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //variables
        int edad;
        System.out.println("------Hola bienvenido a la consulta para las elecciones------");
        System.out.println(" ¿Cuantos años tienes? ");
        edad = teclado.nextInt();

        if (edad > 0 && edad <= 100) {
            if (edad >= 18) {
                System.out.println("UD. puede votar ");
            } else {
                System.out.println("UD. NO puede votar ");
            }
        } else {
            System.out.println("por favor ponga su edad REAL ");
        }
    }
}
