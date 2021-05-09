import java.util.Scanner;
/*
PROBLEMA: 04
Realzar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y el
signo correspondiente por teclado: si es el signo + debe realizar la suma, si es el signo debe realizar
la resta, si es eil signo / debe realizar la división, si es el signo * debe realizar la multiplicación, si es el
signo ^ debe realizer la potencia; representar el algoritmo mediante un lenguaje de alto nivel.
*/
public class rgo_opeArit {
    static Scanner Entrada = new Scanner(System.in);
    public static void main(String[] args) {
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
}
