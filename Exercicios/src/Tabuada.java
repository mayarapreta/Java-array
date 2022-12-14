  import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	try(Scanner scan = new Scanner(System.in)){
		
		System.out.println("TABUADA: ");
		int tabuada = scan.nextInt();
		
System.out.println("Tabuada: " + tabuada);

for( int i = 0; i <= 10 ; i++) {

	System.out.println(tabuada + "x" + i+ "=" + (tabuada*i) );
}
	}

}

}
