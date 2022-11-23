import java.util.Scanner;

import javax.swing.SpringLayout;

import java.lang.Math;

public class ex1046 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int fim=0;

        int horainicial = teclado.nextInt();
        int horafinal = teclado.nextInt();

        
        if(horainicial > horafinal){
            System.out.println("O JOGO DUROU "+(24-(horainicial-horafinal))+" HORA(S)");
        }else if(horafinal > horainicial){
            System.out.println("O JOGO DUROU "+(horafinal-horainicial)+" HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

    }
    
}
