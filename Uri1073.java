import java.util.Scanner;

public class Uri1073{
   public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int valor,cont;
        valor = teclado.nextInt();

        for (cont = 1; cont <= valor; cont=cont+1) {
            if (valor % 2 == 0) {
                System.out.println(cont + "^" + "2" + " = " + (int) Math.pow(cont, 2));
            }
        }
    }
}