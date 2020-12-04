import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double A, B, C, MEDIA;
        
        //Entrada dos valores A e B e C
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        //Processamento da média
        MEDIA = (A*3 + B*8 )/11;

        //Saída - exibir valor da média
        System.out.printf("MEDIA = %.1f%n " ,MEDIA);
    }
}
