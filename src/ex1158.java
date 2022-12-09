import java.util.Scanner;
public class ex1158 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int soma=0;

        for(int i = 0; i<casos;i++){

            int y = input.nextInt();
            int x = input.nextInt();

            for(int j = 1; j<=x;j++){

                y+=x;

                if(y%2!=0){
                    soma+=y;
                    System.out.println(y);
                }
            }

            //System.out.println(soma);
        }

    }
}
