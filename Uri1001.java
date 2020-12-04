import java.util.Scanner;
public class Uri1001{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int X, A, B;

        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;

        System.out.println("X = " +X);
    }
}