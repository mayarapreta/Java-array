 import java.util.Scanner;

 public class Ex1_NomeEIdade {
 
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
      String nome;
      int idade;
      
      while(true) {
      
System.out.print("Nome:");
nome = scan.next();
if (nome.equals("0"))break;
System.out.print("Idade: ");
      }
    }
		
		System.out.print("Termine aqui !");
	}

}


