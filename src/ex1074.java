import java.util.Scanner;

public class ex1074 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qtderepeticoes = input.nextInt();
		
		for(int i = 0; i < qtderepeticoes; i++) {
			int numero = input.nextInt();
				
				if(numero<0 && numero%2!=0) {
					System.out.println("ODD NEGATIVE");
				
				}else if(numero==0) {
					System.out.println("NULL");
				
				}else if(numero>0 && numero%2!=0) {
					System.out.println("ODD POSITIVE");
				
				}else if(numero < 0 && numero%2==0) {
					System.out.println("EVEN NEGATIVE");
					
				}else if(numero > 0 && numero%2==0) {
					System.out.println("EVEN POSITIVE");
					
				}
			
		}

	}

}
