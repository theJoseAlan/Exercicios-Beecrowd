import java.util.Scanner;
import java.lang.Math;

import javax.print.event.PrintEvent;
import javax.xml.transform.SourceLocator;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int idade, ano, mes, dia;

        idade = teclado.nextInt();

        ano = idade / 365;
        mes = (idade % 365) / 30;
        dia = (idade % 365) % 30;

        System.out.println(ano + " ano(s)");

        System.out.println(mes + " mes(es)");

        System.out.println(dia + " dia(s)");

    }
}
