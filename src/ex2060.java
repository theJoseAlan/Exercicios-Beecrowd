import java.util.Scanner;


public class ex2060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int quantidaderepeticoes = input.nextInt();
		int numero;
		
		int qtdemulti2 = 0;
		int qtdemulti3 = 0;
		int qtdemulti4 = 0;
		int qtdemulti5 = 0;
		
		for(int i = 0; i<quantidaderepeticoes; i++) {
			
			numero = input.nextInt();
			
			if(numero%2==0) {
				qtdemulti2+=1;
			}
			if(numero%3==0) {
				qtdemulti3+=1;
			}
			if(numero%4==0) {
				qtdemulti4+=1;
			}
			if(numero%5==0) {
				qtdemulti5+=1;
			}
			
			
		}
		
		System.out.println(qtdemulti2+" Multiplo(s) de 2");
		System.out.println(qtdemulti3+" Multiplo(s) de 3");
		System.out.println(qtdemulti4+" Multiplo(s) de 4");
		System.out.println(qtdemulti5+" Multiplo(s) de 5");
		
		
		

	}

}
