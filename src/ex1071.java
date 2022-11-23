import java.util.Scanner;

public class ex1071 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int re = 0;
        int maior = 0;
        int menor = 0;
        
        
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        
        int li = Math.abs(n1-n2)-1;
        
        if(n1>n2) {
        	maior = n1;
        	menor = n2;
        }else {
        	maior = n2;
        	menor = n1;
        }
        
        for(int i = menor+1; i<maior; i++) {
        	
        	 if(i%2!=0) {
        		 re+=i;
        		
        	 }
        }
        System.out.println(re);
      
    }
}
