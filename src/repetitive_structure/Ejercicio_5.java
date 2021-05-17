package repetitive_structure;
/*
RPOBLEMA O5
Se requiere un algoritmo para determinar cuánto ahorrará en pesos una persona diariamente, y en un año, si ahorra 3$ el primero de enero, 9$ el dos de enero, 27$ el 3 de enero y así sucesivamente todo el año. Represente la solución mediante el diagrama de flujo, el pseudocódigo y el diagrama N/S, utilizando el ciclo apropiado

*/
public class Ejercicio_5 {
    public static void main(String[] args) {
        // varibles
        double ahorro =0;
        for (int i = 1; i < 30; i++) {
            // 30 
            ahorro+=Math.pow(3, i);
            System.out.println("El ahoro en el dia "+ i+ " es :" + Math.pow(3,i));
        }

        System.out.println("Ahorro de un año es :"+ ahorro);
    }
}
