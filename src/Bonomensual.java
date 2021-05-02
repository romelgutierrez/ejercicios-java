import java.util.Scanner;

public class Bonomensual {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //variables
        double sueldo, bono1, bono2;
        int antiguedad;
        System.out.println("ingrese el sueldo");
        sueldo = teclado.nextInt();

        System.out.println("ingrese la antiguedad");
        antiguedad = teclado.nextInt();
        bono1 = 0;
        bono2 = 0;

        if (antiguedad > 2 && antiguedad < 5) {
            bono1 = sueldo * .20;
        } else {
            if (antiguedad >=5) {
                bono1 = sueldo * .30;
            }
        }

        if (sueldo <1000) {
            bono2 = sueldo* .25;
        } else {
            if (sueldo>=100 && sueldo <=3500) {
                bono2 = sueldo * .15;
            } else {
                bono2 = sueldo * .10;
            }
        }

        System.out.println("Tu sueldo es :" + sueldo);
        System.out.println("el bono por antiguedad es :" + bono1);
        System.out.println("el bono por sueldo es :" + bono2);

        if (bono1>bono2) {
            System.out.println("tu bono correspindiente es: " + bono1);
        } else {
            System.out.println("tu bono correspindiente es: " + bono2);
        }
    }
}
