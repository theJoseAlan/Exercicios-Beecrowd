import java.util.Scanner;
public class ex1142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int cont = 0;

        for(int i = 1; i<=num;i++){

            for (int j=0; j<3;j++){
                cont+=1;
                System.out.print(cont+" ");
            }
            System.out.println(" PUM");
            cont+=1;

        }

    }
}
