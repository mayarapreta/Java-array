import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {
		  try (Scanner scan = new Scanner(System.in)) {
        int numero;
         int maior =0;
         int soma = 0;
         int count = 0;
         
         do { 
        	 System.out.println("Numero:  ");
        	 numero = scan.nextInt();
        	 
        	 soma = soma + numero;
        	
        	 
        	 if (numero >maior) maior = numero;
        	 count = count +1;
         System.out.println("Maior:  " + maior);	
          System.out.println("soma : " + soma);
         }while(count < 5);
      }
 

	}
 
}

