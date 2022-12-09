import java.util.Scanner;
public class ex1146 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do{


        int number = input.nextInt();

        if(number==0){
            break;
        }

        for(int i = 1; i<number;i++ ){
            System.out.print(i+" ");
        }
        System.out.println(number);

        }while (true);
    }
}
