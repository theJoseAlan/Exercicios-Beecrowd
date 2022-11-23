import java.util.Scanner;

public class ex1133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>y) {
			maior = x;
			menor = y;
		}else if(x<y) {
			maior = y;
			menor = x;
		}
		
		for(int i = menor+1; i < maior; i++) {
			
			if(i%5==2 || i%5==3) {
				System.out.println(i);
			}
			
		}
		
	}

}
