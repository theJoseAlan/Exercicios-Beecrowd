import java.util.Scanner;

public class ex1049 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        palavra1 = teclado.nextLine();

        if(palavra1.equals("vertebrado")){
            
            palavra2 = teclado.nextLine();
            if(palavra2.equals("ave")){
                
                palavra3=teclado.nextLine();
                if(palavra3.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                
                palavra3=teclado.nextLine();
                if(palavra3.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            
            palavra2 = teclado.nextLine();
            if(palavra2.equals("inseto")){
                
                palavra3=teclado.nextLine();
                if(palavra3.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                
                palavra3=teclado.nextLine();
                if(palavra3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }




    }
    
}
