package repetitive_structure;

import java.util.Scanner;
/*
PROBLEMA 02
"El náufrago satisfecho" ofrece hamburguesas sencillas (S), dobles (D) y triples (T), 
las cuales tienen un costo de $20, $25 y $28 respectivamente. 
La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. 
Suponiendo que los clientes adquieren N hamburguesas, las cuales pueden ser de diferente tipo, 
realice un algoritmo para determinar cuánto deben pagar. Represéntelo en diagrama de flujo, pseudocódigo y diagrama N/S.

*/
public class Ejercicio_2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int cuantasHA, tarjta, hamburguesas ;
        double total = 0;
        System.out.println("cuantas hamburguesas Quieres comprar ");
        cuantasHA = teclado.nextInt();

        for (int i = 1; i <= cuantasHA; i++){
            System.out.println("selecciona el tipo de hamburguesa :"+"\n"+ " 1 = SENCILLLA DE $20"+"\n"+ " 2 = DOBLE DE $25"+"\n"+ " 3 = TRIPLE DE $28");
            hamburguesas = teclado.nextInt();
            switch (hamburguesas) {
                case 1:
                    total = total + 20;
                    break;
                case 2:
                    total = total + 25;
                    break;
                case 3:
                    total = total + 28;
                    break;
                default: System.out.println("El numero no exsite.");
            }
        }
        System.out.println("Elige el tipo de pago:"+ "\n"+ "[ 1 ] Efectivo"+"\n"+" [ 2 ] Tarejeta ");
        tarjta = teclado.nextInt();
        if (tarjta ==1) {
            System.out.println("El total a pagar es de: "+ total+ " soles");
        } else {
            if (tarjta ==2) {
                total = total + (total * .05);
                System.out.println("El total a pagar es de: "+ total+ " soles");
            } else {
                System.out.println("Por favor eligin el numero correcto");
            }
        }
    }
}
