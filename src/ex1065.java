import java.util.Scanner;

public class ex1065 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int q=0;

        for(int i=0; i<5; i++){
            int num = teclado.nextInt();
            
            if(num%2==0){q += 1;}
        }

        System.out.println(q+" valores pares");

    }
    
}
