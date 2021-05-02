import java.util.Scanner;

public class Sueldotrabajador {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //variables
        int horastrabajadas;
        int pagoporhora;
        int total, doble;
        System.out.println("Pago por hora");
        pagoporhora = teclado.nextInt();

        System.out.println("Ponga las horas que ha trabajado");
        horastrabajadas = teclado.nextInt();

        if (horastrabajadas <=40 ) {
            total = pagoporhora*horastrabajadas;
        } else {
            doble = horastrabajadas - 40;
            total = (40 * pagoporhora) + (doble * pagoporhora *2); 
        }

        System.out.println("El pago semanal por "+ horastrabajadas +" horas es: " + total);

    }
}
