import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Por favor, digite o valor da BASE do TRIANGULO:");
        base = teclado.nextInt();
        System.out.println("Por favor, digite o valor do ALTURA do TRIANGULO:");
        altura = teclado.nextInt();

        area = (base * altura)/2;

        System.out.println("A area do TRIANGULO e:"+area);

    }
}