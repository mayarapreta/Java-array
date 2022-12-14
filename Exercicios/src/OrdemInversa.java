import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		  String[] consoantes = new String[6];
		  
		  int quantidadeConsoante = 8;
		  
		  
		  int count = 0;
		  do {
			  
			  System.out.println("Letra: ");
			  String letra = scan.next();
			  
			  if (!(letra.equalsIgnoreCase("a") |
					  letra.equalsIgnoreCase("e")|
							  letra.equalsIgnoreCase("i")|
									  letra.equalsIgnoreCase("o")|
											  letra.equalsIgnoreCase("o"))) {
			consoantes[count] = letra;
			  quantidadeConsoante++;	
			  
			  }
			  
			  count++;
			  		  
		  }while(count < consoantes.length);
		  
		  for (String consoante : consoantes) {
			  if(consoante != null)
			  System.out.println(consoantes + " ");
		  }
	}

}

