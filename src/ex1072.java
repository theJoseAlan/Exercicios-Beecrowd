import java.util.Scanner;

public class ex1072 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qtdein =0;
		int qtdeout = 0;
		int qtderepeticoes;
		
		qtderepeticoes = input.nextInt();
		
		for(int i = 0; i < qtderepeticoes; i++) {
			
			int numero = input.nextInt();
			
			if(numero >= 10 && numero <= 20) {
				qtdein+=1;
			}else {
				qtdeout+=1;
			}
		}
		
		System.out.println(qtdein + " in");
		System.out.println(qtdeout + " out");
		

	}

}
