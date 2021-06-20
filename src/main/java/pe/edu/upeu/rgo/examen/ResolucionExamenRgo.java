package pe.edu.upeu.rgo.examen;

import javax.swing.JOptionPane;

import pe.edu.upeu.rgo.utils.LeerTeclado;

public class ResolucionExamenRgo {
    LeerTeclado teclado=new LeerTeclado();
    public void Ejercicio_02(){
         /*
         2°:
            El Gerente de una compañía automotriz desea determinar el impuesto que va a
            pagar por cada uno de los automóviles que posee, además del total que va a pagar por
            cada categoría y por todos los vehículos, basándose en la siguiente clasificación:
            ◉ Los vehículos con categoría 1 pagan 12% de su valor
            ◉ Los vehículos con categoría 2 pagan 8% de su valor
            ◉ Los vehículos con categoría 3 pagan 5% de su valor
            Considerando que por lo menos de cada modelo o categoría hay un vehículo y por
            cada modelo de vehículo tiene un único precio.
         */
            int n_autos,categoria;
            double categoria1=0, categoria2=0,categoria3=0,costo_auto, impuesto=0,total_impuesto=0;
            n_autos = teclado.leer(0, "Digite cuantos automóviles tiene UD.");
          
         for(int i=1; i<=n_autos; i++){
                  categoria= teclado.leer(0,"Digite la categoria del automóvil: "+i);
                  costo_auto = teclado.leer(0, "Digite el precio del automovil: "+i);

                  if (categoria==1) {
                      impuesto = (costo_auto*0.10);
                      categoria1+=impuesto;
                  } else {
                      if (categoria==2) {
                          impuesto = (costo_auto*0.07);
                          categoria2+=impuesto;
                      } else {
                          if (categoria==3) {
                              impuesto = (costo_auto*0.05);
                              categoria3+=impuesto;
                          }
                        }
                    }
                    total_impuesto+=impuesto; 
                }
                System.out.println("impuesto a pagar  de la categoria 1 es: " + categoria1);
                System.out.println("impuesto a pagar  de la categoria 2 es: " + categoria2);
                System.out.println("impuesto a pagar  de la categoria 3 es: " + categoria3);
                System.out.println("total de impuesto a pagar: " + total_impuesto);
    }
    public void Ejercicio_03(){
        /*
        Realizar la Tabla de Multiplicación de 1 a 20
        */
        // utilizaremos el for anidado.
        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(" "+i+" x "+j+" = "+i*j);
                //JOptionPane.showMessageDialog(null, " "+i+" x "+j+" = "+i*j);
            }
        }
    }
    public void Ejercicio_04(){
        /*
        4°
            Considerando que un numero perfecto es un numero natural igual a la suma de sus
            divisores propios positivos Usando la sentencia while y condicionales if elabore un
            algoritmo que imprima los n primeros números perfectos
        */
         double numero, sumador=2, numero_perf=0;
         numero = teclado.leer(0, "Digite un numero ");
         while (sumador<=numero) {
             if (numero%sumador==0) {
                 numero_perf+=(numero/sumador);
             }
             sumador+=1;
         }
         JOptionPane.showMessageDialog(null, "N° " + ((numero_perf==numero)? " Es perfecto": "No es perfecto"));
    }
     /*
            El valor 𝑥𝑛se puede definir recursivamente como
            𝑥0=1
            𝑥𝑛= 𝑥𝑛−1
            Escriba
            un método recursivo que calcule y devuelva el valor de 𝑥𝑛.
        */
        
        public  int Ejercicio_05(int x , int n){
            int resultado;
                if (x ==0) {
                    resultado =0;
                } else {
                    if (n ==0) {
                        resultado =1;
                    } else {
                        if (n!=1) {
                            resultado = x* Ejercicio_05(x,n-1);
                        } else {
                            resultado = x;
                        }
                    }
                }
                return resultado;
                
            }
}
