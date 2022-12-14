import java.util.Scanner;

public class ex1153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Não entendi bem

        int re =0;

        int n = input.nextInt();

        for(int i = 1; i<13;i++){


            if(i>1){
                n=n*(n-i);

            }
            n = n-i;

        }
       System.out.println(n);

    }
}
