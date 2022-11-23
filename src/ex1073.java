import java.util.Scanner;

public class ex1073 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		for(int i = 1; i<=numero; i++) {
			
			if(i%2==0) {
				
				int re = (int)Math.pow(i, 2); 
				
				System.out.println(i+"^2 = "+re);
				
			}
			
		}
		
		
		
	}

}
