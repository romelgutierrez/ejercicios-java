import java.util.Scanner;

public class seguroautos {
    static Scanner teclado = new Scanner(System.in);
    static Scanner teclado2 = new Scanner(System.in);
    static Scanner teclado3 = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int edad, tipopregunta, error;
        double total,cuota;
        String tipodseguro;
        System.out.println("Ingrese su edad ");
        edad = teclado.nextInt();

        System.out.println("ingrese el tipo de seguro: A 0 B");
        tipodseguro = teclado2.nextLine();
        total=0;
        cuota=0;
         
        if (tipodseguro == "A" || tipodseguro =="a" || tipodseguro =="b" || tipodseguro=="B") {
            if (tipodseguro == "A" || tipodseguro == "a") {
                cuota = 1200;                
            } else {
                cuota= 950;
            }
            total = cuota;

            System.out.println("conteste las seguites preguntas:");

            System.out.println("Tienes habitos por el alcohol: 1 = si - 2 = no");
            tipopregunta = teclado3.nextInt();
            if (tipopregunta ==1 ||tipopregunta == 2) {
                if (tipopregunta==1) {
                    total = total + (cuota *10);
                }

            System.out.println("Usas lentes: 1 = si - 2 = no");
            tipopregunta = teclado3.nextInt();

            if (tipopregunta==1 || tipopregunta ==2) {
                total = total + (cuota * .5);
            } 
            System.out.println("padece de alguan enfermedad: 1 = si - 2 = no");
            tipopregunta = teclado3.nextInt();

            if (tipopregunta ==1 || tipopregunta == 2) {
                if (tipopregunta == 1) {
                    total = total + (cuota * .05);
                }
            } else {
                error = 1;
            }
               error = 1;

            } else {
                error= 1;
            }
            if (edad>40) {
                total = total + (cuota* .20);
            } else {
                total = total +(cuota* .10);
            }
        } else {
           error =1;
        }
        if (error == 0) {
            System.out.println("el toral a pagar por el seguro es: " + total);
        } else {
            System.out.println("La poliza no se puede calcular");
        }
    }
}
