import java.util.Scanner;
public class ex1142 {
    public static void main(String[] args) {
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


    }
}
