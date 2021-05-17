package repetitive_structure;

import java.util.Scanner;

/*
PROBLEMA 10
Los directivos de equis escuela requieren determinar cuál es la edad promedio de cada uno de los M salones y cuál es la edad promedio de toda la escuela. Realice un algoritmo para determinar estos promedios y represente la solución mediante el diagrama de flujo, el pseudocódigo y el diagrama N/S.
*/
public class Ejercicio_10 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // variables.
        int n_alumnos, totalSalones, edad, suma =0,total =0, alumnos=0;
        System.out.println("Igrese n salones: ");
        totalSalones = teclado.nextInt();
            
        while (totalSalones > 0) {
            System.out.println("Digite el numero de alumnos");
            n_alumnos= teclado.nextInt();
            
            for (int i = 1; i <= n_alumnos; i++) {
                System.out.println("ingresa la edad del alumno "+ i);
                edad = teclado.nextInt(); 
                suma+= edad;
            }
            System.out.println("El promedio del salon "+ totalSalones+ " es: "+ suma/n_alumnos+ " años");
            alumnos +=n_alumnos;
            total +=suma;
            totalSalones-=1;
        }

        System.out.println("El promdio de toda las escuel es: "+total/alumnos+" años");
        
    }
}
