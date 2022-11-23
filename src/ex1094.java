import java.util.Scanner;

public class ex1094 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int casos = input.nextInt();
		
		int quantia=0;
		int cobaias=0, r=0, s=0, c=0;
		
		for(int i = 0; i < casos; i++) {
			
			int coba = input.nextInt();
			input.nextLine();
			
			String animal = input.nextLine();
			
			quantia = quantia + coba;
			
			if(animal.equals("C")) {
				c+=coba;
			}else if(animal.equals("R")) {
				r+=coba;
			}else if(animal.equals("S")) {
				s+=coba;
			}
			
		}
		
		System.out.println("Total: "+quantia);
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		
		System.out.printf("Percentual de coelhos: %.2f %%\n", (float)(c*100)/quantia);
		System.out.printf("Percentual de ratos: %.2f %%\n", (float)(r*100)/quantia);
		System.out.printf("Percentual de sapos: %.2f %%\n", (float)(s*100)/quantia);
		
	}

}