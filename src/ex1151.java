import java.util.Scanner;

public class ex1151 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Meio certo (que no caso é errado, mas que estou perto da resposta, o que não deixa de ser errado)

        int number = input.nextInt();

        int cont=0;


        for (int i = 1; i <= number; i++) {

            System.out.print(cont+" "/*+i+" "*/);
            cont=cont+i;
            System.out.print(i+" ");


        }

    }
}
