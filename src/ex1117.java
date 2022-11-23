import java.util.Scanner;

public class ex1117 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		
		
		do {
			
			double nota1 = input.nextDouble();
			
			if(nota1<0 || nota1>10) {
				System.out.println("nota invalida");
			}
			
			double nota2 = input.nextDouble();
			if(nota2<0 || nota2>10) {
				System.out.println("nota invalida");
			}
			
			if(nota1>0 || nota1<10 && nota2>0 || nota2<10) {
				double media = (nota1+nota2)/2;
				System.out.printf("media = %.2f", media);
				break;
			}
			
			
			
		}while(true);
		

	}

}

