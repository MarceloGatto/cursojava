import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, horas, minutos, segundos;

        //entrada dos segundos
        N = teclado.nextInt();

        //processamento
        horas   =  N / 3600;
        minutos =  N % 3600 /60;
        segundos=  N % 60;

        //saida
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}