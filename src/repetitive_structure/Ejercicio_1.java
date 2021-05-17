package repetitive_structure;
/*
PROMBLEMA 01
Un profesor tiene un salario inicial de $1500 y recibe un incremento de 10$ anual durante 6 años.
 ¿Cuál es su salario al cabo de 6 años? ¿Qué salario ha recibido en cada uno de los 6 años? Realice el algoritmo.
*/
public class Ejercicio_1 {
    public static void main(String[] args) {
        //variables
        double salario_inicial = 1500; // variabla consstante
        for (int i = 1; i <=6; i++) {
            salario_inicial = salario_inicial+(salario_inicial *.10);
            System.out.println("el salario de "+ i + " anno es: "+ Math.round(salario_inicial));// Redondeamos los resultado con la clase Math 
        }
        System.out.println("El salario de 6 ahnos es: "+ Math.round(salario_inicial));
    }
}
