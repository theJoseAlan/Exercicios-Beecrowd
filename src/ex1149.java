import java.util.Scanner;

public class ex1149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=0;
        int a = input.nextInt();

        int x=0;

        while (n<=0){
             n = input.nextInt();
        }

        for(int i = 1;i<=n; i++){
            x+=a;

            a+=1;
        }
        System.out.println(x);

    }

}
