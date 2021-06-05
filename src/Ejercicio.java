import java.util.Scanner;

public class Ejercicio {
    static Scanner teclado = new Scanner(System.in);
    public static void Ejercicio_1() {
        /*
        1.	Dado dos números enteros, hallar la suma, resta, multiplicación, división y residuo.
        */
        // varibles
        int num1, num2;
        int suma, resta, division, multipl, reciduo;
        double potencia;
        
        System.out.println("Digite el Primer número");
        num1 = teclado.nextInt();
        System.out.println("Digite el Segundo número");
        num2 = teclado.nextInt();

         suma = num1 + num2;
         resta = num1 - num2;
         division = num1 / num2;
         multipl = num1 * num2;
         reciduo = num1 % num2;
         potencia = Math.pow(num1, num2);

         System.out.println("la suma es " +suma);
         System.out.println("la Resta es: " +resta);
         System.out.println("la Division es: " +division);
         System.out.println("la Multiplicacion es: " +multipl);
         System.out.println("la Reciduo es: " +reciduo);
         System.out.println("la potencia es: " + potencia);
    }
    public static void Ejercicio_2() {
        /*
        2.	Ingresa por teclado 4 notas e imprima el promedio
        */
        //varibles
        int nota1, nota2, nota3, nota4;
        double promedio;

            System.out.println("Digite la Nota: 1 ");
            nota1 = teclado.nextInt();
            System.out.println("Digite la Nota: 2 ");
            nota2 = teclado.nextInt();
            System.out.println("Digite la Nota: 3 ");
            nota3 = teclado.nextInt();
            System.out.println("Digite la Nota: 4 ");
            nota4 = teclado.nextInt();
            promedio = (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("EL promedio es: "+ promedio);
        }
    public static void Ejetcicio_3() {
        /*
        Hallar la potencia de an, donde a y n son números enteros positivos.
        */
        //varibles 
        int num1, num2;
        double potencia;
        System.out.println("Digite a");
        num1 = teclado.nextInt();
        System.out.println("Digite b"); 
        num2 = teclado.nextInt();
        potencia = Math.pow(num1, num2);
        System.out.println("La potencia es: "+potencia);
    }
    public static void Ejercicio_4() {
        /*
        Convertir una cantidad de segundos en horas y minutos
        */
        int horas;
        int minutos;
        int segundos;
        System.out.println("Digite los segundos");
        segundos= teclado.nextInt();

        minutos= segundos/60;
        horas = segundos /3600;
        System.out.println(" tienen :"+ horas + "horas" + minutos + "minutos");


    }
    public static void Ejercicio_5() {
             int precio;
             double igv;
             System.out.println("Digite el precio del articulo");
             precio = teclado.nextInt();
             igv = precio * 0.15;
             System.out.println("El IGV es: "+igv +"\n"+ " y el precio total es: "+(precio+igv));
    }
    public static void Ejercicio_6() {
        //Convertir de grados Celsius a Fahrenheit y kelvin.
        int grado;
        double fahrenheit, kelvin;

        System.out.print("Digite el Grado Celsius: ");
        grado = teclado.nextInt();

        fahrenheit =(grado*9/5)+32;
        kelvin = (grado +273.15);

        System.out.println(" EL fahrenheit es: " + fahrenheit);
        System.out.println(" el kelvin es: " + kelvin);        
    }
    public static void Ejercicio_7() {
        //Calcular la suma de los N primeros número enteros positivos.
        double n,s;
        System.out.println("Digite el valor de N");
        n= teclado.nextDouble();
        s = n*(n+1)/2;
        System.out.println("la suma de los N números es:"+s);
    }
    public static void Ejercicio_8() {
        //Hallar el área de un círculo, donde se tendrá que ingresar el radio.
        final double π = 3.1415;
        double radio, area;
        System.out.println("Digite el radio del circulo");
        radio = teclado.nextDouble();
        area = π*Math.pow(radio, 2);
        System.out.println("El ara de un circuloe es: "+area);
    }
    public static void Ejercicio_9() {
        /*
        Determinar cuánto pagará finalmente una persona, por un articulo X, 
        considerando que tiene un descuento de 20% y debe pagar 15% de IVA 
        (debe mostrar el precio con descuento y el precio final)
        */
        double precioA;
        double descuento, igv, total;

        System.out.println("Digite el valor del articulo");
        precioA =  teclado.nextDouble();

        descuento = precioA * 0.20;
        igv = (precioA - descuento)* 0.15;
        total = precioA - descuento+ igv;
        System.out.println("EL Precio con descueto es sin igv :"+(precioA-descuento));
        System.out.println("EL Precio a pagar es :"+total);
    }

    public static void main(String[] args) throws Exception {
        //Ejercicio_1();
        //Ejercicio_2();
        //Ejetcicio_3();
        //Ejercicio_4();
        //Ejercicio_5();
        //Ejercicio_6();
        //Ejercicio_7();
        Ejercicio_8();
        //Ejercicio_9();
    }
}
