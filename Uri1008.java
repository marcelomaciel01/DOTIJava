import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int func,horas;
        double vl_hora,salario;
        func = teclado.nextInt();
        horas = teclado.nextInt();
        vl_hora = teclado.nextDouble();
                
        salario = (horas * vl_hora);

        System.out.println("NUMBER = "+func);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }

}