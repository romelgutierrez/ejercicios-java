import java.util.Scanner;
/*
Realice un algoritmo que le permita probar uno de los
4 primeros algoritmos que ha diseñado anteriormente aplicando una estructura condicional múltiple o algo similar.
*/
public class rgo_todoUno {
    static Scanner Entrada = new Scanner(System.in);

    static void rgo_notafinal(){

        // variables
        float primera_unidad, segunda_unidad, tercera_unidad;
        double trabajo_final;

        //datos de entrada
        System.out.println("Ingrese la Primera Unidad ");
        primera_unidad = Entrada.nextFloat();

        System.out.println("Ingrese la Segunda Unidad");
        segunda_unidad = Entrada.nextFloat();

        System.out.println("Ingrese la Tercera Unidad");
        tercera_unidad = Entrada.nextFloat();

        System.out.println("Ingrese la nota del trabajo final");
        trabajo_final = Entrada.nextDouble();

        //preceso
        trabajo_final = (primera_unidad * 0.20) + (segunda_unidad * 0.15) + (tercera_unidad * 0.15)+ (trabajo_final *0.50);
        trabajo_final = Math.round(trabajo_final*100)/100.0; // redondear a decimales.

        // salida
        System.out.printf("El promedio es: " + trabajo_final);
    }

    static void rgo_bonoUPeU(){
        // valiables
        int salario; 
        int puntos;
        double salariofinal;

        // Datos de entrada
        System.out.println("Ingrese el salario mensual :");
        salario = Entrada.nextInt();

        System.out.println("Ingrese los puntos para rebir algun bono");
        puntos = Entrada.nextInt();

        // proceso
        if (puntos >= 151) {
            salariofinal =  salario + (salario * 0.70); 
            System.out.println("Querido mastro Ud. tiene " +puntos+ " puntos por lo cual recibe el 70% del bono y su sueldo mensual es :"+salariofinal);
        } else {
            if (puntos >= 101) {
               salariofinal =  salario + (salario * 0.40); 
               System.out.println("Querido mastro Ud. tiene " +puntos+ " puntos por lo cual recibe el 40% del bono y su sueldo mensual es :"+salariofinal);
            } else {
                if (puntos >= 50) {
                   salariofinal =  salario + (salario * 0.10); 
                   System.out.println("Querido mastro Ud. tiene " +puntos+ " puntos por lo cual recibe el 10% del bono y su sueldo mensual es :"+salariofinal);
                } else {
                   System.out.println("Querido mastro Ud. tiene " +puntos+ " puntos. No tiene el veneficio del bono, Su sueldo es: " + salario);
                }
            }
        }
    }

    static void rgo_covid(){
        // varibles
        char sexo;
        int edad;

        // Datos de entrada.
        System.out.println("Cuales su edad:");
        edad = Entrada.nextInt();
        System.out.println("Cual es su genero: ponga " +"\n"+ "[ M ] si es Mujer. " +"\n"+ "[ V ] si es Varon");
        sexo = Entrada.next().charAt(0);

        // proceso.

        if (edad >=70) {
            System.out.println("Ud se aplica la vacuna tipo C");
            return;
        } else {
            if (edad >=16) {
               switch (sexo) {
                   case 'M': case 'm':
                   System.out.println("Ud se aplica la vacuna tipo B");
                       break;
                    case 'V': case 'v':
                   System.out.println("Ud se aplica la vacuna tipo A");
                       break;
               
                   default: System.out.println("ingres correctamete Por Favor");
                       break;
               }
            } else {
                if (edad<16) {
                    System.out.println("Ud se aplica la vacuna tipo A");
                }
            }
        }
    }

    static void rgo_opeArit(){
         //variables.
         double numero1, numero2, resultado;
         char operador;
 
         //Datos de entrada.
         System.out.println("Ingrese el Primir Numero");
         numero1 = Entrada.nextFloat();
         System.out.println("Ingrese el Segundo Numero");
         numero2 = Entrada.nextFloat();
 
         System.out.println("Ingrese el signo segun que corresponda"+"\n"+"[ + ] Suma"+"\n"+"[ - ] Resta"+"\n"+"[ * ] Multiplicacion"+"\n"+"[ / ] Divicion"+"\n"+"[ P ] Potencia");
         operador = Entrada.next().charAt(0);
 
         switch (operador) {
             case '+':
                 resultado = numero1+numero2; 
                 System.out.println("la Suma es: "+resultado);
                 break;
             case '-':
                 resultado = numero1-numero2; 
                 System.out.println("la Resta es: "+resultado);
                 break;
             case '*':
                 resultado = numero1*numero2; 
                 System.out.println("la Multiplicacion es: "+resultado);
                 break;
             case '/':
               if (numero2==0) {
                   System.out.println("No es posible dividir, porque el numero es: 0");
               }
                 resultado = numero1/numero2; 
                 System.out.println("la Division es: "+resultado);
                 break;
             case 'P': case'p':
                 resultado = Math.pow(numero1,numero2);
                 System.out.println("la Potencia es: "+resultado);
                 break;
                 
                 default: System.out.println("Igrese los signos correctamente");
                 break;
             }
    }

    public static void main(String[] args) {
        // valiables

        int pedirnumeros;
        //Entrada

        System.out.println("ingrese"+ "\n"+"[ 1 ] ===> NOTAS ACADEMICOS "+"\n"+"[ 2 ] ===> BONO UPeU PARA MAESTROS"+"\n"+"[ 3 ] ===> VACUNA COVID"+"\n"+"[ 4 ] ===> OPERACIONES ARITMETICAS");

        pedirnumeros = Entrada.nextInt();

        if (pedirnumeros==1) {
            System.out.println("---------------------UD. Esta en el programa de NOTAS ACADEMICAS DE FUNDAMENTOS DE PROGRAMACION");
            rgo_notafinal();
        } else {
            if (pedirnumeros==2) {
                System.out.println("---------------------UD. Esta en el programa de BONOS PARA LOS MAESTROS");
                rgo_bonoUPeU();
            } else {
                if (pedirnumeros==3) {
                    System.out.println("---------------------UD. Esta en el programa de VACUNA PARA EL COVID-19");
                    rgo_covid();
                } else {
                    if (pedirnumeros==4) {
                        System.out.println("---------------------UD. Esta en el programa de OPERACIONES ARITMETICAS");
                        rgo_opeArit();
                    } else {
                        System.out.println("Ingrese el numero correcto.");
                    }
                }
            }
        }
    }
}
