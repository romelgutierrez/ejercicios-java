package repetitive_structure;

import java.util.Scanner;

/*
PROBLEMA 07
Resuelva el problema 02, mediante: 
a) un ciclo Mientras. while
b) un ciclo Desde. do while
*/
public class Ejercicio_7 {
    static  Scanner teclado = new Scanner(System.in);

    public static void mientras() {
        // variables
        int cuantasHA, tarjta, hamburguesas, incremento;
        double total = 0;
        System.out.println("cuantas hamburguesas Quieres comprar ");
        cuantasHA = teclado.nextInt();
        incremento =1;
        while (incremento <= cuantasHA) {
            incremento++;
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
    public static void desde() {
        // variables
        int cuantasHA, tarjta, hamburguesas, incremento;
        double total = 0;
        System.out.println("cuantas hamburguesas Quieres comprar ");
        cuantasHA = teclado.nextInt();
        incremento = 1;
        do {
            incremento++;
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
            
        } while (incremento <= cuantasHA);{
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
    public static void main(String[] args) {
       // mientras();
        desde();
    }
}
