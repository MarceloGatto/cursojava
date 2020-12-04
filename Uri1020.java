import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int dias, mês, ano, sobra;

        //entrada dos dias 
        dias = teclado.nextInt();

        //processamento dos dias
        ano   = dias / 365;
        mês   = (dias % 365)/30;
        sobra = (dias % 365)%30;

        //saída
        System.out.println(ano + " ano(s)" );
        System.out.println(mês + " mes(es)");
        System.out.println(sobra + " dia(s)");
    }
}