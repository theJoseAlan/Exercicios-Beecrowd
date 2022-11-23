import java.util.Scanner;

public class ex1079 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qtderepeticoes = input.nextInt();
		
		for(int i = 0; i<qtderepeticoes; i++) {
			
			double n1 = input.nextDouble();
			double n2 = input.nextDouble();
			double n3 = input.nextDouble();
			
			double resultado = ((n1*2)+(n2*3)+(n3*5))/10;
			
			System.out.printf("%.1f", resultado);
			
		}
		

	}

}
