import java.util.Scanner;
public class Uri1064{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        float N, Media, Soma=0;
        int qtdadePositivos;
               
        qtdadePositivos = 0;
        for (int cont = 1; cont <= 6; cont++){
            N = teclado.nextFloat();
                if (N > 0){
                    qtdadePositivos++;
                 Soma= Soma + N;   
                }
        }       
        System.out.println(qtdadePositivos + " valores positivos");
        Media = Soma / qtdadePositivos;
        System.out.printf("%.1f%n" , Media);
    } 
}
