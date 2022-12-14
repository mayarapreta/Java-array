import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args, String quantImpares) {
	try (Scanner scan = new Scanner(System.in)) {
    int quantNumero;
     int numero;
     int quantPares = 0;
     int  quantImpares = 0;

     System.out.println("Quantidade de Numero: ");
     quantNumero = scan.nextInt();
     
     int count = 0;
     do {
    	 System.out.println("Numero: ");
    	 numero =scan.nextInt();
    	 //count = count +1;
    	 
    	 if (numero % 2 == 0) quantPares++;
    	 else quantImpares++;
    	 
    	 count ++;
     } while(count < quantNumero);
     
     System.out.println("Quantidade Par:  "+ quantPares);
  }

  System.out.println("Quantidade Impar "+ quantImpares);
	}

}
