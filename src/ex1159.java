import java.util.Scanner;

public class ex1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, j, k, soma = 0;

        do{
            x = input.nextInt();
            if (x == 0){
                return;
            }
            for (k = 0, j = x; k < 5; j++)
            {
                if (j % 2 == 0)
                {
                    soma += j;
                    k++;
                }
            }
            System.out.println(soma);
            soma = 0;

        } while (x != 0);

    }
}
