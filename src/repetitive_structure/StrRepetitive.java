package repetitive_structure;

import java.util.Scanner;

public class StrRepetitive {
    static Scanner teclado = new Scanner(System.in);

    public static void saludo(){
        System.out.println("---------Bienvenido a Estructura Repetitivo-----------");
        
    }
    public static void sum10numerosMientaras() {
        //variables
        int contador=0;
        double numero,sumanumeros=0;
        //datos de entrada.
        
        while (contador<10) {
            System.out.println("Ingrese el valor de la posicion "+ (++contador)+":");
            numero = teclado.nextDouble();
            sumanumeros+= numero;
        }
        // datos de salida
        System.out.println("la suma de los 10 numeros es :"+ sumanumeros);
    }
    
    public static void sum10numerosMientarasDo() {
        //variables
        int contador=0;
        double numero,sumanumeros=0;
        //datos de entrada.
        do{
            System.out.println("Ingrese el valor de la posicion "+ (++contador)+":");
            numero = teclado.nextDouble();
            sumanumeros+= numero;
        }while (contador<10);
            // datos de salida
            System.out.println("la suma de los 10 numeros es :"+ sumanumeros);
    }
    
    public static void suam10Mumerosparammas() {
        //variables
        double numero,sumanumeros=0;
        for (int contador = 1; contador <=10; contador++) {
            System.out.println("Ingrese el valor de la posicion "+(contador)+":");
            numero=teclado.nextDouble();
            sumanumeros+= numero;
        }
        //datos de salida
        System.out.println("La suma de los 10 numeros es:"+sumanumeros);
    }
    public static void main(String[] args) {
        saludo();
        sum10numerosMientarasDo();
    }
}
