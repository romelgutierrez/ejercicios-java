import java.util.Scanner;

/*
PROBLEMA: 01

Diseñe un algoritmo mediante pseudocódigo, diagrama de flujo y diagrama de N/S, para calcular la
nota final del curso de Fundamentos de programación, considerando que el porcentaje de valor de la
primera unidad es 20%, de la segunda unidad vale 15%, y de la tercera unidad es un 15%, mientras
que el trabajo final vale un 50%.

*/
public class rgo_notafinal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //variables
        float primera_unidad, segunda_unidad, tercera_unidad;
        double trabajo_final;

        //datos de entrada
        System.out.println("Ingrese la Primera Unidad ");
        primera_unidad = entrada.nextFloat();

        System.out.println("Ingrese la Segunda Unidad");
        segunda_unidad = entrada.nextFloat();

        System.out.println("Ingrese la Tercera Unidad");
        tercera_unidad = entrada.nextFloat();

        System.out.println("Ingrese la nota del trabajo final");
        trabajo_final = entrada.nextDouble();

        //preceso
        trabajo_final = (primera_unidad * 0.20) + (segunda_unidad * 0.15) + (tercera_unidad * 0.15)+ (trabajo_final *0.50);
        trabajo_final = Math.round(trabajo_final*100)/100.0; // redondear a decimales.
 
        // salida
        System.out.printf("El promedio es: " + trabajo_final);

    }
}
