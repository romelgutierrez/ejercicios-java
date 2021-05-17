package repetitive_structure;

import java.util.Scanner;

/*
PROBLEMA 09

Un cliente de un banco deposita equis cantidad de pesos cada mes en una cuenta de ahorros. La cuenta percibe un interés fijo durante un año de 10 % anual. Realice un algoritmo para determinar el total de la inversión final de cada año en los próximos N años. Represente la solución mediante el diagrama de flujo, el pseudocódigo y diagrama N/S.

*/
public class Ejercicio_9 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        double  ahorro=0,total = 0,intereses =0;
        int n_annos;
         System.out.println("Ingrese n añso de ahorro");
         n_annos = teclado.nextInt();
         while (n_annos > 0) {
             for (int i = 1; i <= 12; i++) {
                 System.out.println("Ingrese el ahorro del mes :" +i);
                 ahorro = teclado.nextInt();
                 total += ahorro; 
             }
             intereses +=total*.10;
             n_annos-=1;
             System.out.println("EL enteres anual es: " +intereses+"\n"+ "con una inversion final de: "+ (total+intereses));
         }
    }
}
