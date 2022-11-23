import java.util.Scanner;

public class ex1113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			int x = input.nextInt();
			int y = input.nextInt();
			
			if(x>y) {
				System.out.println("Decrescente");
			}else if(x<y) {
				System.out.println("Crescente");
			}else if(x==y) {
				break;
			}
			
			
		}while(true);
		

	}

}
