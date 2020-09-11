import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float valor;
        int cont,numeroDePositivos;

        for (cont = 1; cont <=6; cont = cont +1){
            valor = teclado.nextFloat();
            if (valor > 0){
                cont = cont+1;
            }
        }

        System.out.println(cont+" valores positivos");
    }
}