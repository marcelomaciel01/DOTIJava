import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int horaI, minuI,horaF,minuF,durI,durF,duracaoTotal,durH,durM;
        
        horaI = teclado.nextInt();
        minuI = teclado.nextInt();
        horaF = teclado.nextInt();
        minuF = teclado.nextInt();

        durI = horaI * 60 + minuI;
        durF = horaF * 60 + minuF;

        duracaoTotal  = durF - durI;


        if (duracaoTotal <=0){
            duracaoTotal = duracaoTotal + 24*60;
        }

        durH = duracaoTotal /60;
        durM = duracaoTotal % 60;

        System.out.println("O JOGO DUROU "+durH+" HORA(s) E "+durM+" MINUTO(S)");
    }
}