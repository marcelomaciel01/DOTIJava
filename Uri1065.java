import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int valor,cont,numeroDePares;

        numeroDePares = 0;
        
        for (cont = 1; cont <=5; cont = cont +1){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                numeroDePares = numeroDePares+1;
            }
        }
        System.out.println(numeroDePares+" valores pares");
    }
}