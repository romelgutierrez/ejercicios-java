import java.util.Scanner;

public class Edadetres {
    static Scanner teclado = new Scanner(System.in);
    static Scanner teclado2 = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        String nombre1;
        String nombre2;
        String nombre3;
        int edad1,edad2,edad3;
        System.out.println("Ingrese su Nombre");
        nombre1 = teclado.nextLine();

        System.out.println("Ingrese su Edad");
        edad1 = teclado2.nextInt();

        System.out.println("Ingrese su Nombre");
        nombre2 = teclado.nextLine();

        System.out.println("Ingrese su Edad");
        edad2 = teclado2.nextInt();

        System.out.println("Ingrese su Nombre");
        nombre3 = teclado.nextLine();

        System.out.println("Ingrese su Edad");
        edad3 = teclado2.nextInt();
        if (edad1 < edad2) {
            if (edad1<edad3) {
                System.out.println("la Edad menor es de: " + nombre1+" " + edad1 + " años ");
            } else {
                System.out.println("la Edad menor es de: " + nombre3+" " + edad3 + " años");
            }
        } else {
            if (edad2 < edad3) {
                System.out.println("la Edad menor es de: " + nombre2+" " + edad2 + " años");
            } else {
                System.out.println("la Edad menor es de: " + nombre3+" " + edad3 + " años");
            }
        }
    }
}
