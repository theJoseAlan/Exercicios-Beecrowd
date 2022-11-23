import java.util.Scanner;

public class ex1101 {
//NÃO SEI QUAL O ERRO QUE A MERRRRRDA DO BEECROWD TÁ ACHANDO E EU NÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃOOOO
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maior=0, menor=0;
		
		int cont=0;
		
		while(true) {
			int soma = 0;
			
			int x = input.nextInt();
			int y = input.nextInt();
			
			if(x>y) {
				maior=x;
				y=menor;
			}else if(y>x) {
				maior = y;
				menor = x;
			}else if(x==y){
				maior=x;
				menor=y;
			}
			
			if(x<=0 || y<=0) {
				break;
			}
			
			for(int i = menor; i<=maior; i++) {
				
				System.out.print(i+" ");
				
				soma+=i;
				
			}
			System.out.println("Sum="+soma);
			
			
			cont++;
		}
		
		

	}

}