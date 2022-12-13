import java.util.Scanner;

import static java.lang.Math.pow;

public class ex1144 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n ,i ,j;

        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.printf("%.0f",Math.pow(i,2)," ");
            for(j =1; j<=3; j++){
                System.out.printf("%.0f",Math.pow(j,2)," ");
                for (int k =1; k<=3; k++){
                    System.out.printf("%.0f",Math.pow(k,2)," ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
