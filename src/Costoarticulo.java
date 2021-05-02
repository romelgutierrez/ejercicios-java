import java.util.Scanner;

public class Costoarticulo {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
         //varialbles
         int precio;
         double descueto;
         double total;
         System.out.println("cuanto cuesta el articulo");
         precio = teclado.nextInt();

         if (precio >= 200) {
             descueto = precio * .15;
             System.out.println("El precio es: " + precio);
             System.out.println("El decuento es: " + descueto);
             total = precio - descueto ;
             System.out.println("El prescio  a pagar es : " + total);
            } else {
             if (precio>100) {
                descueto = precio * .12;
                total = precio - descueto ;
                System.out.println("El precio es: " + precio);
                 System.out.println("El decuento es: " + descueto);
                 System.out.println("El prescio  a pagar es : " + total);
             } else {
                if (precio<100) {
                    descueto = precio * .10;
                    total = precio - descueto ;
                    System.out.println("El precio es: " + precio);
                    System.out.println("El decuento es: " + descueto);
                    System.out.println("El prescio  a pagar es : " + total);
                }
                
              }
         } 
    }
}
