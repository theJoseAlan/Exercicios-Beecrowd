import java.util.Scanner;
import java.lang.ArithmeticException;

public class ex1116 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qtderepeticoes = input.nextInt();
		
		for(int i = 0; i < qtderepeticoes; i++) {
			
			
				int n1 = input.nextInt();
				int n2 = input.nextInt();
				
				if(n2==0) {
					System.out.println("divisao impossivel");
				}else {
					double re = (double)n1/n2;
					System.out.println(re);
				}	
		}
		
	}

}
