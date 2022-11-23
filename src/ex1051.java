import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import org.xml.sax.SAXException;
public class ex1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double imposto=0;
        double salreal;
        
        
        if(salario>=0 && salario<2000){
            System.out.println("Isento");
            
        }else {
        	if(salario>2000){
        		if(salario>3000) {
            		salreal=1000;
            	}else {
            		salreal = salario - 2000;
            	}
        		
            	imposto = salreal*0.08;
	
        	}
        	
        	if(salario > 3000){
        		if(salario>4500) {
            		salreal=1500;
            		
            	}else {
            		salreal = salario - 3000;
            	}
            	
                imposto += (salreal*0.18);
     
        	}
        	if(salario>4500){
        		
            	salreal = salario - 4500;
                imposto += salreal*0.28;

            }
        	
        	System.out.printf("R$ %.2f\n", imposto);
        }
        
        
    }
    
}
