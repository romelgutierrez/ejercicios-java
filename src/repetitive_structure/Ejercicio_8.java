package repetitive_structure;

import java.util.Scanner;

/*
PROBLEMA 08:
Realice el algoritmo para determinar cuánto pagará una persona que adquiere N artículos, los cuales están de promoción. Considere que si su precio es mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100 pero menor a $200, el descuento es de 12%; de lo contrario, sólo se le aplica 10%. Se debe saber cuál es el costo y el descuento que tendrá cada uno de los artículos y finalmente cuánto se pagará por todos los artículos obtenidos. Represente la solución mediante el diagrama de flujo, el pseudocódigo y el diagrama N/S.
*/
public class Ejercicio_8 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // varibles
        double N_articulos;
        double precio_articulos,descuento =0, total =0;
        System.out.println("Cuanto es el número de arcticulos que comprO");
        N_articulos = teclado.nextInt(); 
         while (N_articulos>0) {
             precio_articulos = 0;
             System.out.println("-----Precio del "+ Math.round(N_articulos) + " Articulo-----");
             precio_articulos = teclado.nextInt();

             if (precio_articulos >=200) {
                descuento = precio_articulos*.15;

             } else {
                 if (precio_articulos >100) {
                    descuento = precio_articulos*.12;
                 } else {
                    descuento = precio_articulos*.10;
                 }
             }
             System.out.println(" el precio con " +descuento + " de descuento de: "+ Math.round(N_articulos)+ " Articulo es: "+ (precio_articulos-descuento));
             total +=(precio_articulos-descuento);
             N_articulos-=1;

         }
         System.out.println(" total a pagar de todo los artículos es:" +total);


         /*
        for (int i = 1; i <= N_articulos; i++) {
            System.out.println("-----Precio del "+ i+ " Articulo-----");
            precio_articulos = teclado.nextInt();

            total =total1+total2+total3; // suma tprecio
            if (precio_articulos >=200) {
                descuento = precio_articulos*.15;
                precio1 = precio_articulos-descuento;

                total1 = total1 + (precio_articulos - descuento);
                System.out.println(" tu descuento de: "+ i +  " Articulo es: "+ descuento+ " un 15% de descuento");
                System.out.println(" Precio final del Articulo es: " +precio1);

            } else {
                if (precio_articulos >100) {
                    descuento = precio_articulos*.12;
                    precio2 = precio_articulos-descuento;
                    total2 = total2 + (precio_articulos - descuento);

                    System.out.println(" tu descuento de: "+ i + " Articulo es: "+ descuento +" un 12% de descuento");
                    System.out.println(" Precio final del Articulo es: " +precio2);
                } else {
                    if (precio_articulos >0) {
                        descuento = precio_articulos*.10;
                        precio3 = precio_articulos-descuento;
                        total3 = total3 + (precio_articulos - descuento);
                      System.out.println(" tu descuento de: "+ i + " Articulo es: "+ descuento +" 10% de descuento");
                      System.out.println(" Precio final del Articulo es: " +precio3);
                    } 
                }
               // System.out.println(" tu descuento de: "+ i + " Articulo es: "+ descuento +" porque el precio no oscila los $100 ");
            }
        }  
        System.out.println(" total a pagar de todo los artículos es:" +total);
        */
    }
}
