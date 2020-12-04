import java.util.Scanner;
public class Uri1065{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int N, pares = 0, soma = 0, cont;

            for (cont = 1 ; cont <= 5 ; cont++){
                N = teclado.nextInt();
            if (N % 2 == 0){
               soma = soma + 1;
               }
            }
        System.out.println(soma + " valores pares");  
    }
}