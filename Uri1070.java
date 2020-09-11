import java.util.Scanner;

public class Uri1070{
   public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int valor,cont;
        valor = teclado.nextInt();
        if (valor % 2 ==0){
            valor = valor+1;
        }
        for (cont = 1; cont<=6; cont=cont+1) {
            System.out.println(valor);
            valor = valor+2;
        }
    }

}