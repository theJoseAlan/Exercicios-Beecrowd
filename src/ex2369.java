import java.util.Scanner;

public class ex2369 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int consumo = teclado.nextInt();
		int conta = 0;
		
		if(consumo <=10 ) {
			conta = 7;
		}else if( consumo<=30) {
			conta = ((consumo-10)*1)+7;
		}else if(consumo <=100) {
			conta = ((consumo-30)*2)+27;
		}else if(consumo>100) {
			conta = ((consumo-100)*5)+167;
		}		
		
		System.out.println(conta);

	}
}
