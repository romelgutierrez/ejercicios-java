package repetitive_structure;

import java.util.Scanner;
/*
PRBLEMA 04
Una compañía fabrica focos de colores (verdes, blancos y rojos). Se desea contabilizar, de un lote de N focos, el número de focos de cada color que hay en existencia. Desarrolle un algoritmo para determinar esto y represéntelo mediante el diagrama de flujo, el pseudocódigo y el diagrama N/S, utilizando el ciclo apropiado.

*/
public class Ejercicio_4 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int nfocos,tipocolor,verde =0, blanco =0 , rojo=0;

        System.out.println("Ud. cuantos focos tiene"); 
        nfocos = teclado.nextInt();

        for (int i = 1; i <= nfocos; i++) {
            System.out.println("Celeciona "+i+" el color: "+ "\n"+"[ 1 ] VERDE "+"\n"+"[ 2 ] BLANCO"+"\n"+"[ 3 ] ROJO");
            tipocolor = teclado.nextInt();
            switch (tipocolor) {
                case 1:
                    verde = verde + 1;
                    break;
                case 2:
                    blanco = blanco +1;
                    break;
                case 3:
                    rojo = rojo +1;
                    break;
                default: System.out.println("El numero no exsite.");
            }
        }
        System.out.println("EL TOTAL DE COLOR  VERDE ES: " + verde);
        System.out.println("EL TOTAL DE COLOR  BLANCO ES: " + blanco);
        System.out.println("EL TOTAL DE COLOR  ROJO ES: " + rojo);
    }
}
