import java.util.Scanner;
/*
PROBLEAMA: 03
El ministro de salud requiere un diagrama de flujo que represente el algoritmo que permita
determinar que tipo de vacuna (A, B o C) contra el Covid 19 debe aplicar a una persona; considerando
que si es mayor de 70 años, sin importar el sexo se le aplica el tipo C; si tiene entre 16 y 69 años, y es
mujer se le aplica el Tipo B, y si es hombre, el tipo A; si es menor de 16 años, se le aplica el tipo A, sin
importar el sexo.

*/
public class rgo_covid {
    static Scanner Entrada = new Scanner(System.in);
    public static void main(String[] args) {
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
}
