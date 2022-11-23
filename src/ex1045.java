import java.util.Scanner;

public class ex1045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double aux, a2, bc; //variavel auxiliar, a² e b+c

        System.out.print("A: ");
        double a = teclado.nextDouble();
        System.out.print("B: ");
        double b = teclado.nextDouble();
        System.out.print("C: ");
        double c = teclado.nextDouble();

        if(b>a){
            //trocando o valor das variaveis para o A ser o maior
            aux=b;
            a = b;
            b = aux;
        }
        if(c>a){
            aux = c;
            a = c;
            c = aux;
        }

        //Aqui ele calcula a potência
        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if(a >= b+c){
            //Se entrar aqui o programa encerra (não é bom colocar if else ou varios if's)
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(a2 > bc){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if(a2 < bc){
                System.out.println("TRIANGULO ACUTANGULO");
            }else{
                System.out.println("TRIANGULO RETANGULO");
                
            }

            if(a== b && a==c && b==c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b || a ==c || b ==c){
                System.out.println("TRIANGULO ISOSCELES");
            }


        }


    }
}
