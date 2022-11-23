import java.util.Scanner;


public class ex2408 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numero = new int[2];
		
		for(int i = 0; i <= numero.length; i++) {
			System.out.print("Número: ");
			numero[i] = input.nextInt();
			System.out.println(numero[i]);
			
		}
		

	}

}
