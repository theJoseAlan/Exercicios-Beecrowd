import java.util.Scanner;

public class ex1070 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont=0;

        int num = teclado.nextInt();

        while(cont<6){
            if(num%2==1){
                System.out.println(num);    
                cont++;
            }
            num++;
        }

        

    }
    
}
