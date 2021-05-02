import java.util.Scanner;

public class estacionamiento {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int horasEsta;
        System.out.println("cuantas horas se va a estacionar");
         horasEsta = teclado.nextInt();

         if (horasEsta >=10) {
            System.out.println("UD. paga $2.00 ");
         } else {
             if (horasEsta >=5) {
                System.out.println("UD. paga $3.00 ");
             } else {
                 if (horasEsta >=3) {
                    System.out.println("UD. paga $4.00 ");
                 } else {
                     if (horasEsta <=2) {
                        System.out.println("UD. paga $5.00 ");
                     }
                 }
             }
         }
    }
}
