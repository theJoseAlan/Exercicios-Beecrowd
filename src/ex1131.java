import java.util.Scanner;

public class ex1131 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int golInter = 0, golGremio = 0, empates=0, grenais=0;


        do {


            grenais+=1;
            int inter = input.nextInt();
            int gremio = input.nextInt();

            if(inter>gremio){
                golInter++;
            } else if (gremio>inter) {
                golGremio++;
            }else if(inter==gremio){
                empates+=1;
            }



            System.out.println("Novo grenal (1-sim 2-nao)");
            int op = input.nextInt();
            if (op == 1) {
                continue;
            } else {
            break;
            }

        } while (true);

        System.out.println(grenais+" grenais");
        System.out.println("Inter:"+golInter);
        System.out.println("Gremio: "+golGremio);
        System.out.println("Empates: "+empates);

        if(golInter>golGremio){
            System.out.println("Inter venceu mais");
        } else if (golGremio>golInter) {
            System.out.println("Gremio venceu mais");
        } else if (golGremio==golInter) {
            System.out.println("Nao houve vencedor");
        }

    }
}
