import java.util.Scanner;

public class ex1075 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		for(int i = 1; i<=10000; i++) {
			
			if(i%numero==2) {
				System.out.println(i);
			}
			
			
		}

	}

}
