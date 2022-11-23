import java.util.Scanner;

public class ex1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cont=0;
		int contH=0;
		
		int horainicial = input.nextInt();
		int minutoinicial = input.nextInt();
		int horafinal = input.nextInt();
		int minutofinal = input.nextInt();
		
		while (cont!=horafinal) {
			
			contH++;
			
			cont=horainicial+1;
			
			if(cont==24) {
				cont=0;
			}
			
			
		}
		
		System.out.println("Hora: "+contH);
		
		
		
		
		//System.out.println("O JOGO DUROU "+reH+" HORA(S) E "+reM+" MINUTO(S)");
		
		
	}

}
