import java.util.Scanner;

public class ex1066 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qpa = 0, qim = 0, qne = 0, qpo = 0;
         
        for (int i = 0; i < 5; i++) {
            
            int num = teclado.nextInt();

            if(num>0){qpo+=1;}
            if(num%2==0){qpa+=1;}
            if(num%2!=0){qim+=1;}
            if(num<0){qne+=1;}
            

        }

        System.out.println(qpa + " valor(es) par(es)");
        System.out.println(qim + " valor(es) impar(es)");
        System.out.println(qpo + " valor(es) positivo(s)");
        System.out.println(qne + " valor(es) negativo(s)");

    }

}
