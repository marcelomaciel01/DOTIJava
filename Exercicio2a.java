import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int lado, area;

        System.out.println("Por favor, digite o valor do lado do quadrado");
        lado = teclado.nextInt();

        area = lado * lado;

        System.out.println("A area do quadrado vale:"+area);

    }
}