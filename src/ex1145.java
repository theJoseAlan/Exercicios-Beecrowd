import java.util.Scanner;

public class ex1145 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        int cont = 1;
        for (int i = 1; i <= y; i++) {

            System.out.print(i);

            if (i % x == 0) {
                System.out.println("");
            }else{
                System.out.print(" ");
            }

        }

    }
}
