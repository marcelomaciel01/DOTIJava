import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double sal, imposto;

        sal = 0;
        imposto = 0;
        sal = teclado.nextDouble();

        if (sal <=2000.0){
            System.out.println("Isento");
        }
        else if (sal <=3000){
            imposto = (sal - 2000)*0.08;
            System.out.printf("R$ %.1f\n",imposto);
        }   
        else if (sal <=4500){
            imposto = (sal - 3000)*0.18 + 80.0;
            System.out.printf("R$ %.1f\n",imposto);
        }
        else
            imposto = (sal - 4500) / 100;
            System.out.printf("R$ %.1f\n",imposto);
        }        
        
    }

}