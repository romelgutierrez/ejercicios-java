import java.util.Scanner;
/* 
PROBLEMA: 02
El Director de educación ha decidido otorgar un bono por desempeño a todos sus profesores con base
en la puntuación siguiente:

|    puntos     |       premio          |
|---------------|-----------------------|
|50-100         | 10% del salario minimo| 
|101-150        | 40% del salario minimo| 
|151 en adelante| 70% del salario minimo| 

Realice un algoritmo que permita determinar el monto de bono que percibirá un profesor (debe
Capturar el valor del salario mínimo y los puntos del profesor). Represente el algoritmo en un
lenguaje de alto nivel.
*/
public class rgo_bonoUPeU {
    static Scanner Entrada = new Scanner(System.in);
    public static void main(String[] args) {
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
}
