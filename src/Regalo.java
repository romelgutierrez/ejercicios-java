import java.util.Scanner;
public class Regalo {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //variables
        int cantidadinero;

        System.out.println("ingere la cantidad de tu dinero");
        cantidadinero = teclado.nextInt();

        if (cantidadinero >251) {
            System.out.println("puedes regalar un anillo");
        } else {
            if (cantidadinero >=101 && cantidadinero <=150) {
                System.out.println("Flores");
            } else if(cantidadinero >=11 && cantidadinero <=100){
                    System.out.println("chocolate");
            } else {
                System.out.println("tarjeta");
            }
        }
       
    }
}
