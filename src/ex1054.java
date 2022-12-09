import java.util.Scanner;

public class ex1054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float quantidade=0;
        float idades=0;
        float idade=0;

        do {
            idade = input.nextInt();
            if(idade>0){
                idades+=idade;
                quantidade +=1;
            }

        }while (idade>=0);

        float media = idades/quantidade;
        System.out.printf("%.2f\n", (float)media);
    }
}
