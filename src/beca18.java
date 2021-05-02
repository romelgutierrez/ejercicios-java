import java.util.Scanner;

public class beca18 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    // varialbles.
    int edad;
    double promedio;
    System.out.println("Ingrese su edad");
    edad = teclado.nextInt();

    System.out.println("Ingrese su promedio");
    promedio = teclado.nextInt();

    if (edad <= 18) {
        if (promedio >=9) {
            System.out.println("UD. cuenta con la beca $3000");
        } else {
            if (promedio >= 8) {
                System.out.println("UD. cuenta con la beca $2000");
            } else {
                if (promedio >=6) {
                    System.out.println("UD. cuenta con la beca $100");
                } else {
                    System.out.println("A estudia mas para el proximo ciclo");
                }
            }
        }
    } else {
        if (promedio>=9) {
            System.out.println("UD. cuenta con la beca $2000");
        } else {
            if (promedio >=7.5) {
                System.out.println("UD. cuenta con la beca $1000");
            } else {
                if (promedio>=6) {
                    System.out.println("UD. cuenta con la beca $500");
                } else {
                    System.out.println("UD. necesita estudiar para el proximo ciclo");
                }
            }
        }
    }

    }
}
