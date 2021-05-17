package repetitive_structure;
/*
PROBLEMA 06
Resuelva el problema 01, mediante:
 a) un ciclo Repite.
 b) un ciclo Desde.
*/
public class Ejercicio_6 {

    public static void repite() {
        //variables
        double salario_inicial = 1500; // variabla consstante
        for (int i = 1; i <=6; i++) {
            salario_inicial = salario_inicial+(salario_inicial *.10);
            System.out.println("el salario de "+ i + " anno es: "+ Math.round(salario_inicial));// Redondeamos los resultado con la clase Math 
        }
        System.out.println("El salario de 6 ahnos es: "+ Math.round(salario_inicial));

    }
    public static void desde() {

        double salario_inicial = 1500; // variabla consstante
        int contador;
        contador = 0;

        while (contador<6) {
            contador++;
            salario_inicial = salario_inicial+(salario_inicial *.10);
            System.out.println("el salario de "+ contador + " anno es: "+ Math.round(salario_inicial));// Redondeamos los resultado con la clase Math
        }
        System.out.println("El salario de 6 ahnos es: "+ Math.round(salario_inicial));
    }
    public static void main(String[] args) {
        repite();
        System.out.println("---------------"+ "\n");
        desde();
    }
}
