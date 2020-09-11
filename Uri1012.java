import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double A,B,C,PI,TRI,CIRC,TRAPEZ,QUADR,RET;
        
        PI = 3.14159;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        TRI = (A * C) / 2;
        CIRC = C * C * PI;
        TRAPEZ = (A + B) * C / 2;
        QUADR = B * B;
        RET = A * B;
                        
        System.out.printf("TRIANGULO: %.3f\n",TRI);
        System.out.printf("CIRCULO: %.3f\n",CIRC);
        System.out.printf("TRAPEZIO: %.3f\n",TRAPEZ);
        System.out.printf("QUADRADO: %.3f\n",QUADR);
        System.out.printf("RETANGULO: %.3f\n",RET);

    }

}