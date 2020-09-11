import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int codpeca1,numpeca1,codpeca2,numpeca2;
        double vl_peca1,vl_peca2,totalpeca1,totalpeca2,vl_pagar;
        codpeca1 = teclado.nextInt();
        numpeca1 = teclado.nextInt();
        vl_peca1 = teclado.nextDouble();
        codpeca2 = teclado.nextInt();
        numpeca2 = teclado.nextInt();
        vl_peca2 = teclado.nextDouble();

        totalpeca1 = numpeca1 * vl_peca1;
        totalpeca2 = numpeca2 * vl_peca2;
        
        vl_pagar = totalpeca1 + totalpeca2;
                
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",vl_pagar);
    }

}