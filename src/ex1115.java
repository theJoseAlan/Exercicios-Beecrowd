import java.util.Scanner;


public class ex1115 {

	public static void main(String[] 	args) {
		Scanner input = new Scanner(System.in);
		
		boolean segue = true;
		
		while(segue) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if(x==0 || y==0) {
				segue = false;
				break;
			}else {
				if(x==0 || y==0) {
					System.out.println();
					
				}else if(x > 0 && y>0) {
					System.out.println("primeiro");
					
				}else if(x >= 0 && y<0 ) {
					System.out.println("quarto");
					
				}else if(x<0 && y <0) {
					System.out.println("terceiro");
					
				}else if(x<0 && y>0) {
					System.out.println("segundo");
				} 
			}
			
			
		}	
		
			
	} 
}


