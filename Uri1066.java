import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor,cont,numeroDePares,numeroDeImpar,numerosPositivos,numerosNegativos;

        numeroDePares = 0;
        numeroDeImpar = 0;
        numerosPositivos = 0;
        numerosNegativos = 0;
        
        for (cont = 1; cont <=5; cont = cont +1){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                numeroDePares = numeroDePares+1;
            }           
            else{
                numeroDeImpar = numeroDeImpar+1;
            }
            if (valor < 0){
                numerosNegativos = numerosNegativos+1;
            }
            else if (valor > 0){ 
                numerosPositivos = numerosPositivos+1;
            }
        }
        System.out.println(numeroDePares+" valor(es) par(es)");
        System.out.println(numeroDeImpar+" valor(es) impar(es)");
        System.out.println(numerosPositivos+" valor(es) positivo(s)");
        System.out.println(numerosNegativos+" valor(es) negativo(s)");
    }
}