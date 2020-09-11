import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c,perimetro;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        perimetro = 0;

         if (a+b>c && b+c>a && a+c>b){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }
        else {
            perimetro = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n",perimetro);
        }
    }
}