import java.util.Scanner;

import javax.swing.JOptionPane;

public class clase_03 {
    /*
    ------ SWITCH --------
    */
    static Scanner teclado = new Scanner(System.in);

    public static void Ejercicio_1() {
        /*
        1.	Dado números del 1 al 4, devolver la estación del año. Sabiendo que 1 = verano, 2 = otoño, 3 = invierno  y 4 = primavera.
        */
        int estaciones;
        System.out.println("Digite un número");
        estaciones = teclado.nextInt();
        switch (estaciones) {
            case 1:
                System.out.println("Verano");
                break;
            case 2:
                System.out.println("Otoño");
                break;
            case 3:
                System.out.println("Invierno ");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default: System.out.println("el numero es incorrecto");
                break;
        }
    }
    public static void Ejercicio_2() {
        /*
        2.	Dado un número entero de 1 al 7, devolver el día de la semana, sabiendo que el 1 es domingo.
        */
        int dias;
        String ndias ="";
        System.out.println("Digite un numero de los dias de la semana");
        dias = teclado.nextInt();
        switch (dias) {
            case 1:
                ndias ="lunes";
                break;
            case 2:
                ndias ="Martes";
                break;
            case 3:
                ndias ="Miercoles";
                break;
            case 4:
                ndias ="jueves";
                break;
            case 5:
                ndias ="Viernes";
                break;
            case 6:
                ndias ="Sabado";
                break;
            case 7:
                ndias ="Domingo";
                break;
            default: System.out.println("El numero es Incorrecto");
                break;
            }
       System.out.println("El dia es: "+ndias);
    }
    public static void Ejercicio_3() {
        /*
        Uitilizamos JOptionPane.
        Dado dos números enteros y un operador +,-,* y /, 
        devolver la operación de los dos números según el operador ingresado, 
        considere que si el segundo número es cero y el operador es /, devolverá 0.

        */
        int numero1, numero2, error=0;
        double rsul= 0;
        char operador;
        numero1= Integer.parseInt(JOptionPane.showInputDialog(null," Digite el primer numero "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero"));
        operador = JOptionPane.showInputDialog(null,"Elige el Operador.: \n [+] Suma \n [-] Suma \n [*] Suma \n [/] Suma" ).charAt(0);
        switch (operador) {
            case '+':
                rsul= (numero1+numero2);
                break;
            case '-':
                rsul= (numero1-numero2);
                break;
            case '*':
                rsul= (numero1*numero2);
                break;
            case '/':
                if (numero2!=0) {
                    rsul= (numero1/numero2);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIDIR  ENTRE: " +numero2);
                }
                break;
            default: error = 1;
                break;
        }
        if (error == 0) {
            JOptionPane.showMessageDialog(null, " EL RESULTADO ES: " + numero1 + " " +operador+ " " + numero2 + " = "+ rsul);
        } else {
            JOptionPane.showMessageDialog(null, "ERORR: " + error);
        }
    }
    public static void Ejercicio_4() {
        /*
        Dado un letra determinar si es una vocal
        */
        char vocal;
         String nvocal= " ";
        int error =0;
        vocal =JOptionPane.showInputDialog(null,"Digite una letra en minuscula para determinar si es vocal :)" ).charAt(0);
        switch (vocal) {
            case 'a':case 'e':case 'i':case 'o':case 'u':
                nvocal = " ES VOCAL";
                break;
            default: error = 1;
                break;
        }
        if (error==0) {
            JOptionPane.showMessageDialog(null, "la letra:  " + vocal+ " : " + nvocal);
        } else {
            JOptionPane.showMessageDialog(null, "la letra: " + vocal+ " NO ES VOCAL");
        }
    }
    public static void Ejercicio_5() {
        /*
        utilizamo JOoptionPane
         Dado la edad de una persona, obtener la categoría, según la siguiente tabla.
                 Edad	           Categoría
            Entre 0 a 12	Niño
            Entre 13 – 25	Joven
            Entre 26 – 55	Adulto
            Entre 56 a 99	Anciano
            >99 	        Dinosaurio
            */

            int edad;
            String categoria=" ";
            
            edad =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su edad:"));

            if(edad<=12){
                 categoria = "Niño";
            } else {
                if (edad<=25) {
                    categoria = "Joven";
                } else {
                    if (edad<=55) {
                        categoria = "Adulto";
                    } else {
                        if (edad<=99) {
                            categoria = "Anciano";
                        } else {
                            categoria = "Dinosaurio";
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "CATEGORIA: "+ categoria);

    }
    public static void Ejercicio_7() {
        /*
        7.	Determinar el importe a pagar para el examen de admisión de una universidad, cuyo valor depende del nivel socioeconómico y el colegio de procedencia.
        */
        char colegio, nivsocial;
        int x=0, error=0;
        System.out.println("ingres cologio"+ "\n" +"[ N ] Nacional"+ "\n" +"[ P ] Particular");
        colegio = teclado.next().charAt(0);
        System.out.println("NIVEL SOCIAL \n [A] [B] [C]");
        nivsocial = teclado.next().charAt(0);

        switch (colegio) {
            case 'N': case 'n':
                switch (nivsocial){
                    case 'A': case 'a':
                        x= 300;
                        break;
                    case 'B': case 'b':
                        x= 200;
                        break;
                    case 'C': case 'c':
                        x= 100;
                        break;
                
                    default: error = 1;
                        break;
                }
                break;
            case 'P': case 'p':
            switch (nivsocial){
                case 'A': case 'a':
                    x= 400;
                    break;
                case 'B': case 'b':
                    x= 300;
                    break;
                case 'C': case 'c':
                    x= 200;
                    break;
                default: error = 1;
                    break;
            }
                break;
        
            default: error = 1;
                break;       
        }
        switch (error) {
            case 0:
                System.out.println("Colegio: "+ colegio + "\n Nivel Social: "+ nivsocial + "\n Total a Pagar: " + x );
                break;
            case 1:
                 System.out.println(" ERROR " + error);
                break;
            default: error = 1;
                break;
        }
    }
    //------------------- TAREA -------------------
    public static void Ejercicio_8() {
        /*
        Dado un número de un mes, que imprima el nombre del mes.
        */
        int mes;
        String nombremes="";
        System.out.println("Digite un numero de 1 al 12 para saber el mes");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                nombremes = " January";
                break;
            case 2:
                nombremes = " February";
                break;
            case 3:
                nombremes = " March";
                break;
            case 4:
                nombremes = " April";
                break;
            case 5:
                nombremes = " May";
                break;
            case 6:
                nombremes = " June";
                break;
            case 7:
                nombremes = " july";
                break;
            case 8:
                nombremes = " August";
                break;
            case 9:
                nombremes = " September";
                break;
            case 10:
                nombremes = " Octuber";
                break;
            case 11:
                nombremes = " November";
                break;
            case 12:
                nombremes = " December";
                break;
            default: System.out.println("ERORRRR OI23424-2242");
                break;
        }
        System.out.println("El mes es: "+ nombremes);  
    }
    public static void Ejercicio_9() {
        /*
        Convierta en número romanos, números menores de 10
        */
        int numero;
        String vx=" ";
        System.out.println("Digite un numero (1 -10 )para convirtir en número romano");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                vx = "I";
                break;
            case 2:
                vx = "II";
                break;
            case 3:
                vx = "III";
                break;
            case 4:
                vx = "IV";
                break;
            case 5:
                vx = "V";
                break;
            case 6:
                vx = "VI";
                break;
            case 7:
                vx = "VII";
                break;
            case 8:
                vx = "VIII";
                break;
            case 9:
                vx = "IX";
                break;
            case 10:
                vx = "X";
                break;
            default: System.out.println("ERORRR");
                break;
        }
        System.out.println("es: " + vx);
    }
    public static void Ejercicio_10() {
        /*
        Diseñe un programa que califique el puntaje obtenido en el lanzamiento de tres dados en base a la cantidad de seis obtenidos, de acuerdo a lo siguiente:
           Tres 6	= Oro
            Dos 6 	= Plata
            Un 6 	= Bronce
            Ningún 6	= Perdió
        */
        int ndados, error=0;
        String n=" ";
            System.out.println("Digite el puntaje DE 6 obtenido en el lanzamiento ");
            ndados = teclado.nextInt();
                switch(ndados){
                    case 1:
                    n = "ORO";
                        break;
                    case 2:
                    n = "PLATA";
                        break;
                    case 3:
                    n = "BRONCE";
                        break;
                    case 4:
                    n = "PERDIO";
                        break;
                    default: error= 1;
                        break;
                }
                if (error==0) {
                    System.out.println("UD. RECIBE " + n);
                    
                } else {
                    System.out.println("Error "+ error);
                }
    }
    public static void Ejercicio_11(){
        /*
        En una empresa se ha determinado la siguiente política de descuento, solo si sueldo es mayor a  2000 soles, caso contrario no aplicara la política de descuento.
          Política de descuento
              obrero \sexo /Hombre | Mujer
              obrero   |      15%   | 10% 
              Empleado |      20%   | 15% 
        */
        String o=" ",s =""; 
        int error =0,obrero,sexo;
        double descuento=0, sueldo, total=0;

        System.out.println("Ingrese el sueldo");
        sueldo = teclado.nextDouble();

        if (sueldo>=2000) {

            System.out.println("TIPO DE TRABAJADOR: \n [ 1 ] Obrero \n [ 2 ] Empleado");
              obrero = teclado.nextInt();
            
            switch(obrero){
                case 1: 
                    o = "Obrero";
                    System.out.println("SEXO: \n [ 1 ] Hombre \n [ 2 ] Mujer");
                    sexo = teclado.nextInt();
                    switch (sexo) {
                        case 1:
                            s = "Hombre";
                            descuento =(sueldo* 0.15);
                            total = (sueldo-descuento);
                            break;
                        case 2:
                            s = "Mujer";
                            descuento =(sueldo* 0.10);
                            total = (sueldo-descuento);
                            break;
                        default: error =1;
                            break;
                    }
                    break;
                case 2:
                    o = "Empleado";
                    System.out.println("SEXO: \n [ 1 ] Hombre \n [ 2 ] Mujer");
                    sexo = teclado.nextInt();
                    switch (sexo) {
                        case 1:
                            s = "Hombre";
                            descuento =(sueldo* 0.20);
                            total = (sueldo-descuento);
                            break;
                        case 2:
                            s = "Mujer";
                            descuento =(sueldo* 0.15);
                            total = (sueldo-descuento);
                            break;
                        default: error =1;
                            break;
                    }
                    break;
                default: error =1;
                break;
            }
                if (error==0) {
                    System.out.println("tipo: " + o + "\n sexo: " + s+ "\n Precio normal: "+ sueldo+"\n descuento: "+descuento+" \n Total a Pogar: " + total);
                } else{
                    System.out.println("error "+ error);
                }
        
        } else {
            System.out.println("Ud. no cuenta con el descuento \n Total a pagar: "+ sueldo);
        }
    }
    public static void main(String[] args) {
        System.out.println("\n"+"---------------- CLASE 03 ---------------"+"\n");

      //Ejercicio_1();
      //Ejercicio_2();
      //Ejercicio_3();
      //Ejercicio_4();
      Ejercicio_5();
      //Ejercicio_7();
      //Ejercicio_8();
      //Ejercicio_9();
      //Ejercicio_10();
      //Ejercicio_11();

    }
}
