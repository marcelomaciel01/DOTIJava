import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int diagonal1, diagonal2, area;

        System.out.println("Por favor, digite o valor da DIAGONAL 1 do LOSANGO:");
        diagonal1 = teclado.nextInt();
        System.out.println("Por favor, digite o valor da DIAGONAL 2 do LOSANGO:");
        diagonal2 = teclado.nextInt();

        area = (diagonal1 * diagonal2);

        System.out.println("A area do LOSANGO e:"+area);

    }
}