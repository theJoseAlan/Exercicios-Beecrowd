import java.util.Scanner;
public class ex1160 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int t, PA, PB, cont = 0, i;
            double G1, G2;

            t = input.nextInt();

            for (i = 0; i < t; i++){

                PA = input.nextInt();
                PB = input.nextInt();
                G1 = input.nextDouble();
                G2 = input.nextDouble();

                while (PA <= PB && cont < 101){

                    PA += (int)((PA*G1)/100);
                    PB += (int)((PB*G2)/100);

                    cont++;

                }

                if (cont > 100){
                    System.out.println("Mais de 1 seculo.");
                }
                else{
                    System.out.println(cont+" anos.");
                }

                cont = 0;
            }
    }
}
