import java.util.Scanner;

import static java.lang.Math.pow;

public class ex1144 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n ,i ,j;

        n = input.nextInt();

        for (i = 1; i <= n; i++)
        {
            System.out.printf("%d %.0f %.0f\n", i, pow(i, 2), pow(i, 3));
            System.out.printf("%d %.0f %.0f\n", i, pow(i, 2) + 1, pow(i, 3) + 1);
        }
    }
}
