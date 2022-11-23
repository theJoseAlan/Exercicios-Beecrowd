import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1064 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);

        float positivos=0, qnegativos=0;
        int qtpositivos = 0;

        for(int c =0; c<6; c++){
            
            float numero = teclado.nextFloat();

            if(numero>0){
                qtpositivos +=1;
                positivos += numero;
            }            

        }
        
        System.out.println(qtpositivos+" valores positivos");
        System.out.println(df.format(positivos/qtpositivos));

    }
}
