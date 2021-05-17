package repetitive_structure;

import java.util.Scanner;
/*
PROBLEMA 03.
Se requiere un algoritmo para determinar, de N cantidades de numeros, cuántas son cero, cuántas son menores a cero, y cuántas son mayores a cero. Realice el diagrama de flujo, el pseudocódigo y el diagrama N/S para representarlo, utilizando el ciclo apropiado.
*/
public class Ejercicio_3 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int ncantidades,valorN,contador = 0,mayor=0, menor=0;

        System.out.println("Igrese la cantidad de sifras");
        ncantidades = teclado.nextInt();

        for (int i = 1; i <= ncantidades; i++) {
            
            System.out.println("Ingrese el valor del  nùmero: " + i);
            valorN = teclado.nextInt();

            if (valorN == 0) {
                contador = contador + 1;
            } else {
                if (valorN >0) {
                    mayor = mayor + 1;
                } else {
                    menor = menor + 1; // en este caso se aplica los numeros negarivos -0
                }
            }
        }
        System.out.println("la cantidad de numeros MAYORES son: " + mayor);
        System.out.println("la cantidad de numeros MENORES son: " + menor); // en este caso se aplica los numeros negativos -0
        System.out.println("la cantidad de numeros 0 son: " + contador);
    }
}
