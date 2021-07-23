public class App {

    public  void imprimirMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }        
    }
    
    public String[][] tranformados05(int dimen, int numInit){
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    public static void main(String[] args) throws Exception {
        App romeg = new App();

       romeg.imprimirMatrizCadena(romeg.tranformados05(5, 0));
    }
}
