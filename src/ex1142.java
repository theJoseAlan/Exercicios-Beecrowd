import java.util.Scanner;
public class ex1142 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner input =  new Scanner(System.in);

        int cont=1;
        int cont2=0;

        int num = input.nextInt();

        for (int i=0; i<num;i++){
            cont2++;
            for(int j = 0; j<4; j++){
                cont++;

                if (cont2<4){
                    System.out.print(cont + " ");
                }else if(cont2==4){
                    System.out.println("PUM");
                }
                /*if (cont2<3){
                    System.out.print(cont+" ");
                }else if(cont2==4){
                    System.out.println("PUM");
                }*/

            }
            System.out.println();
            cont2=0;
        }

=======
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
>>>>>>> cd54440342d2ab33fc3a0f683d09f8d58cd56ce7

    }
}
