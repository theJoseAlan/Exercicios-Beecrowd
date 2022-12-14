import java.util.Scanner;

public class ex1155 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a,c,s=0;

        for(a=1; a<=100; a++){
            c=1/a;
            s+=c;
        }
        System.out.printf("%.2f", s);
    }
}
