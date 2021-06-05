import java.util.Scanner;

public class Ejercicio_1{
    
    static Scanner teclado = new Scanner(System.in);

     public static void mayor(){
         /*
         Dado dos números enteros diferentes, devolver el número mayor.
         */
         int num1,num2;
        System.out.println("Digite el numero 1");
        num1 = teclado.nextInt();
        System.out.println("Digite el numero 2");
        num2 = teclado.nextInt();
        if(num1>num2){
            System.out.println("el mayor "+ num1);
        } else{
            System.out.println("el mayor "+ num2);
        }
     }
     public static void Ejercicio_4() {
         /*
         Determinar un mumero par o impar
         */
        int numero;
        System.out.println("Digite el numero");
        numero = teclado.nextInt();

        if (numero%2 ==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El no numero es par");
        }
     }
     public static void Ejercicio_5() {
         int edad;
         System.out.println("Digite tu edad");
         edad = teclado.nextInt();

         if (edad>=20 && edad<=23) {
             System.out.println("si es para ti");
         } else {
             System.out.println("No es para ti");
         }
     }
     public static void Ejercicio_6() {
         /*
         6.	Dado un número entero, devolver el doble si el número no es par, caso contrario el triple
         */
         
     }
     public static void Ejercicio_7() {
         double consumo, descuento, impusto, total;
         System.out.println("Digite el costo");
         consumo= teclado.nextDouble();
         if (consumo>=100) {
             descuento =consumo*.20;
             impusto =(consumo-descuento)*0.19;
             total = (consumo-descuento)+ impusto;

             System.out.println("el descuento es: " + descuento);
             System.out.println("el impuesto es: " + impusto);
             System.out.println("el total es: " +total);
         } else {
            descuento =consumo*.10;
         }
     }
     //  -------TAREA------------
     public static void Ejercicio_8() {
         /*
         1.	Ingrese 3 notas, y si su promedio es mayor a 13 el sistema
          le dirá que está aprobado, caso contrario esta desaprobado
         */
        int nota1,nota2,nota3;
        double promedio;

        System.out.println("Digite la primera nota");
        nota1 = teclado.nextInt();
        System.out.println("Digite la segunda nota");
        nota2 = teclado.nextInt();
        System.out.println("Digite la tercera nota");
        nota3 = teclado.nextInt();
        promedio = (nota1+ nota2 + nota3)/3;

        if (promedio >13) {
            System.out.println("UD ESTA APROBADO: " + promedio);
        } else {
            System.out.println("UD ESTA DESAPROBADO: "+ promedio);
        }
     }
     public static void Ejercicio_9() {
         //Dato 3 números devolver el número mayor.
         int num1, num2,num3;
         System.out.println("Numero 1");
         num1 = teclado.nextInt();
         System.out.println("Numero 2");
         num2 = teclado.nextInt();
         System.out.println("Numero 3");
         num3 = teclado.nextInt();

         if (num1>num2 &&  num1>num3) {
            System.out.println(" EL numero mayor es: " + num1);
         } else {
             if (num2>num1 && num2>num3) {
                System.out.println(" EL numero mayor es: " + num2);
             } else {
                 if (num3>num1 && num3>num2) {
                    System.out.println(" EL numero mayor es: " + num3);
                 } 
             }
         }
     }
     public static void Ejercicio_10() {
         /*
         3.	El presidente de la republica asignara becas, considerando los siguiente criterios:
          Para alumnos mayores de 18 con promedio mayor o igual a 18, la beca será de S/.2000;
           con un promedio menor de 18 y mayor o igual a 16, de S/.1000; para los menores de 16 pero mayores o igual a 13 de S/.500. 
           A los demás les enviara una carta que diga "Estudia más".
          A los alumnos de 18 años o menores de esta edad, con promedios
           mayores o iguales a 18, se les dará S/.3000; con promedios menores
            a 18 pero mayores o iguales a 16, se les dará S/.2000; para los alumnos con promedios menores a 16 pero mayores o iguales a 13,
             se les dará S/.100, y a los que tengan menor que 13, se les dará una carta que diga "estudia más"
         */


}
     public static void Ejercicio_11() {
    /*
    Dado 3 longitudes, si forman un triángulo devolver el tipo de triangulo según sus lados.
         T. Equilátero: sus 3 lados son iguales
         T. Isósceles: 2 lados iguales
         T. Escaleno: 3 lados diferentes
    */

    int valor1, valor2, valor3;
    System.out.println("Digite lado a");
    valor1 = teclado.nextInt();
    System.out.println("Digite lado b");
    valor2 = teclado.nextInt();
    System.out.println("Digite lado c");
    valor3 = teclado.nextInt();

    if (valor1<(valor2+valor3) && valor2<(valor1+valor3) && valor3<(valor1+valor2)) {
        if (valor1 == valor2 && valor2== valor3) {
            System.out.println("Es triangulo Equilatero ");
        } else {
            if (valor1==valor2 || valor1==valor3 || valor2==valor3) {
                System.out.println("EL triangulo es isosceles");
            } else {
                    System.out.println("el triangulo es escaleno");
            }
        }
    } else {
         System.out.println("no es un triangulo");
    }
}
    public static void main(String[] args) throws Exception {
       // mayor();
       //Ejercicio_4();
       //Ejercicio_5();
      // Ejercicio_7();
       //Ejercicio_8();
      // Ejercicio_9();
     // Ejercicio_10();
       Ejercicio_11();
    }
}