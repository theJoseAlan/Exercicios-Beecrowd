import java.util.Scanner;

public class ex1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int x = input.nextInt();

            int soma = 0;

            int par = 0;

            for(int i = 0; i<5;i++){

                par = x+i;

                if(par%2==0){
                    soma+=par;
                }else if(x%2==0){
                    soma+=x+par;
                }

            }
            System.out.println(soma);

            if(x==0){
                break;
            }
        }

    }
}
