import java.util.Scanner;

public class ex1061 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Dia: ");
		int dia1 = input.nextInt();

		int a, b, c, d;
		int dif;

		a=input.nextInt();
		c=input.nextInt();

		b=input.nextInt();
		d=input.nextInt();



		dif = ((b*60)+d) - ((a*60)+c);
		if(dif<=0) dif += 24*60;
		System.out.println("O JOGO DUROU "+dif/60+" HORA(S) E "+dif%60+" MINUTO(S)");
		
		
	}
	

}
