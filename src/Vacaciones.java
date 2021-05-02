import java.util.Scanner;

public class Vacaciones {
     static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variable
        double precio;
        double presupuesto;
        double kilometro;
        String vieaje;
        System.out.println("Ingrese el precio por Kilometro");
        precio = teclado.nextInt();

        System.out.println("Ingrese el presupuesto para el viaje");
        presupuesto = teclado.nextInt();

        kilometro = presupuesto / precio;
        if (kilometro <750) {
            System.out.println("considere quedarse en casa mejor");
        } else {
            if (kilometro<800) {
                vieaje = "México";
            } else {
                if (kilometro<1200) {
                    vieaje = "P.V";
                } else {
                    if (kilometro<1800) {
                        vieaje= "Acapulco";
                    } else {
                        vieaje = "Cancún";
                    }
                }
            }
            System.out.println("Con ese presupuesto puede viajar a" + vieaje);
        }

    }
}
