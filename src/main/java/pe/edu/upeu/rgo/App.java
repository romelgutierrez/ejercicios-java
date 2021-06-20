package pe.edu.upeu.rgo;
import pe.edu.upeu.rgo.utils.*;
import javax.swing.JOptionPane;
import pe.edu.upeu.rgo.examen.*;
/**
 * 
 *@author Romel Gutierrez
 */
public class App {
    public static void main( String[] args ) throws Exception{
        LeerTeclado teclado=new LeerTeclado();
        ResolucionExamenRgo objSP=new ResolucionExamenRgo();
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: \n [ 1 ] Pregunta 02 \n [ 2 ] Pregunta 03 \n [ 3 ] Pregunta 04 \n [ 4 ] Pregunta 05"));
        switch (num) {
            case 1:
            objSP.Ejercicio_02();
                break;
            case 2:
            objSP.Ejercicio_03();
                    break;
            case 3:
            objSP.Ejercicio_04();
                    break;
            case 4:
                int x= teclado.leer(0,"Digite el valor  X ");
                int n= teclado.leer(0,"Digite el valor  n ");
            objSP.Ejercicio_05(x, n);
                    break;
            default: JOptionPane.showMessageDialog(null,"ERROR");
                break;
        }
    }
}
