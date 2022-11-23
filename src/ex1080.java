import java.util.Scanner;

public class ex1080 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE; // Integer.MIN_VALUE é o menor valor que um inteiro pode ter em Java (no caso, é -2147483648).
		int indiceMaior = -1;
		
		int[] num = new int[100];

		for(int i = 0; i<10; i++) {
			
			num[i] = input.nextInt();
			
			if (num[i] > maior) {
		        maior = num[i];
		        indiceMaior = i+1;
		    }
		}
	
		System.out.println(maior);
		System.out.println(indiceMaior);
		
		
	}
}
