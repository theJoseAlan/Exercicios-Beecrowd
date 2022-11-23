import java.util.Scanner;

public class ex1036 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double delta;
        double x1, x2;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if((a==0) || (b*b - 4*a*c<0)) {
        	System.out.println("Impossivel calcular");
        	
        }else {
        	delta = Math.pow(b, 2)-(4*a*c);

            x1 = (-b+(Math.sqrt(delta)))/(2*a)  ;
            x2 = (-b-(Math.sqrt(delta)))/(2*a);

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
        	
        
        
       
    }
}