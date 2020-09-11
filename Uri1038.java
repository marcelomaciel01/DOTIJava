import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int cod,qtde;
        double total;
        
        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        total = 0;

        if (cod == 1) {
            total = qtde * 4.00;
        }
        else if (cod == 2) {
            total = qtde * 4.50;
        }
        else if (cod == 3) {
            total = qtde * 5.00;
        }
        else if (cod == 4) {
            total = qtde * 2.00;
        }
        else if (cod == 5) {
            total = qtde * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f\n",total);
    }

}