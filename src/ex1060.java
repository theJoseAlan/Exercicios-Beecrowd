import java.util.Scanner;

public class ex1060 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int q=0;
        
        for(int i=0; i<6; i++){

            float num = teclado.nextFloat();

            if(num>0){q+=1;}

        }

        System.out.println(q + " valores positivos");

    }

}