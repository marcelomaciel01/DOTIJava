import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float valor,media;
        int cont,numeroDePositivos;

        numeroDePositivos = 0;
        media = 0;
        for (cont = 1; cont <=6; cont = cont +1){
            valor = teclado.nextFloat();
            if (valor > 0){
                numeroDePositivos = numeroDePositivos+1;
                media = media + valor;
            }
        }
        
        media = media/numeroDePositivos;
            System.out.println(numeroDePositivos+" valores positivos");
            System.out.printf("%.1f\n",media);
    }
}