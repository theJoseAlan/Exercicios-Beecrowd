import java.util.Scanner;

public class ex1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        int cont =0;

        for(int i =0; i<casos; i++){
            cont=0;
            int numero = input.nextInt();

            for(int j = 1; j<=numero;j++){

                if(numero%j==0){
                    cont+=1;
                }
            }
            if(cont==2){
                System.out.println(numero+" eh primo");
            }else{
                System.out.println(numero+" nao eh primo");
            }
        }


    }
}
