import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Por favor, digite o valor do BASE retangulo:");
        base = teclado.nextInt();
        System.out.println("Por favor, digite o valor do ALTURA do retangulo:");
        altura = teclado.nextInt();

        area = base * altura;

        System.out.println("A area do retangulo vale:"+area);

    }
}