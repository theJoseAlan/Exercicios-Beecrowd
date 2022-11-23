import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Integer.*;

public class ex1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double valorInformado = teclado.nextDouble();
        int notas;
     
        System.out.println("NOTAS:");
        notas = (int)valorInformado/100;
        System.out.printf("%d nota(s) de R$ 100.00\n", notas);
        valorInformado = valorInformado%100;

        notas = (int)valorInformado/50;
        System.out.printf("%d nota(s) de R$ 50.00\n", notas);
        valorInformado = valorInformado%50;

        notas = (int)valorInformado/20;
        System.out.printf("%d nota(s) de R$ 20.00\n", notas);
        valorInformado = valorInformado%20;

        notas = (int)valorInformado/10;
        System.out.printf("%d nota(s) de R$ 10.00\n", notas);
        valorInformado = valorInformado%10;

        notas = (int)valorInformado/5;
        System.out.printf("%d nota(s) de R$ 5.00\n", notas);
        valorInformado = valorInformado%5;

        notas = (int)valorInformado/2;
        System.out.printf("%d nota(s) de R$ 2.00\n", notas);
        valorInformado = valorInformado%2;

        valorInformado = valorInformado*100;
        
        System.out.println("MOEDAS:");
        
        notas = (int)valorInformado/100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", notas);
        valorInformado = valorInformado%100;
        
        notas = (int)valorInformado/50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", notas);
        valorInformado = valorInformado%50;
        
        notas = (int)valorInformado/25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", notas);
        valorInformado = valorInformado%25;
        
        notas = (int)valorInformado/10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", notas);
        valorInformado = valorInformado%10;
        
        
        notas = (int)valorInformado/5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", notas);
        valorInformado = valorInformado%5;
        
        notas = (int)valorInformado/1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", notas);
        valorInformado = valorInformado%1;
        
        
    }
    
}
