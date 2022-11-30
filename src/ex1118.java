import java.util.Scanner;

public class ex1118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op;
        double n1,n2;
        double nota1 =0, nota2=0;

        do {

            do{
                nota1 = input.nextDouble();
                if(nota1<0 || nota1>10) {
                    System.out.println("nota invalida");
                }else{
                    n1=nota1;
                    break;
                }
            }while (true);

            do{
                nota2 = input.nextDouble();
                if(nota2<0 || nota2>10) {
                    System.out.println("nota invalida");
                }else{
                    n2=nota2;
                    break;
                }
            }while (true);

            double media = (n1+n2)/2;
            System.out.printf("media = %.2f\n", media);


            System.out.println("novo calculo (1-sim 2-nao)");
            op = input.nextInt();

            if (op==1){
                continue;
            } else if (op==2) {
                break;
            } else if (op!=1 || op!=2) {
                while (true){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    op = input.nextInt();
                    if(op==1 || op==2){
                        break;
                    }
                }
            }


        }while (op!=2);

    }
}
