import java.util.Scanner;
public class ex1067 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        
        if(numero>=1 && numero <=1000){
            for(int i=0; i<numero; i++){

                if(numero%2!=0 && i%2!=0){
                    
                    System.out.println(i);
                }
    
            }
            if(numero%2!=0){
                System.out.println(numero);
            }
        }
               

    }
    
}
