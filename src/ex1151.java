import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class ex1151 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int x,y, a=0,b=1,c=0;
        x=input.nextInt();
        for(y=1; y<x; y++)
        {
            if(y%2==1)
            {
                System.out.print(c+" ");
                c=a+b;
                a=c;
            }
            else if(y==2)
                System.out.print(c+" ");
            else if(y%2==0)
            {
                System.out.print(c+" ");
                c=a+b;
                b=c;
            }
        }
        System.out.print(c+"\n");
    }
}
