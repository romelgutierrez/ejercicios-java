import java.util.Scanner;

public class EstCondicional {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //char areaCarrera;
        String areaCarrera;
        String areaCarreraNcomp="";
        double notaEP=0, notaRM=0, notaRV=0, notaAB=0, notaFinal=0;
        //Datos de Entrada
        System.out.println("Ingrese el area a la que pertenece su carrera\nB=Biomedicas\nI=Ingenieria\nS=Sociales: ");
        //areaCarrera=teclado.next().charAt(0);
        areaCarrera = teclado.nextLine();
        System.out.println("Ingrese la nota de EP:");
        notaEP=teclado.nextDouble();
        System.out.println("Ingrese la nota de RM:");
        notaRM=teclado.nextDouble();
        System.out.println("Ingrese la nota de RV:");
        notaRV=teclado.nextDouble();
        System.out.println("Ingrese la nota de AB:");
        notaAB=teclado.nextDouble();  

        //Proceso
        switch(areaCarrera){
          case "B":{
            notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30);
            areaCarreraNcomp="Biomedicas";
           } break;
          case "I":{
            notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15);
            areaCarreraNcomp="Ingenierias";      
           } break;
          case "S":{
            notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
            areaCarreraNcomp="Sociales";      
           } break;
          default : System.out.println("La opcion que ingreso no existe! intente nuevamente....");break;
        }
        //Datos de salida
        System.out.println("La persona obtuvo una nota de: "+notaFinal+" y su carrera es del area : "+areaCarreraNcomp);
      }
  
}
