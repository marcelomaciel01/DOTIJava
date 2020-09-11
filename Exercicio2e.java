import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int baseMaior, baseMenor, altura, area;

        System.out.println("Por favor, digite o valor da BASE MAIOR do TRAPEZIO:");
        baseMaior = teclado.nextInt();
        System.out.println("Por favor, digite o valor da BASE MENOR do TRAPEZIO:");
        baseMenor = teclado.nextInt();
        System.out.println("Por favor, digite o valor da ALTURA do TRAPEZIO:");
        altura = teclado.nextInt();

        area = (basemaior + basemenor) * altura /2;

        System.out.println("A area do LOSANGO e:"+area);

    }
}