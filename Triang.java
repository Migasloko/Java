import java.util.Scanner;

public class Triang{
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		
		//Variaveis de input do utilizador
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		
		// Comparaçoes para cada tipo de triangulo
		if ((a+b) == (2*c))
			System.out.println("Triangulo equilatero.");
				
				else if ((a-b)*(a-c)==0 || b==c)
					System.out.println("Triangulo isosceles.");
				
				else 
					System.out.println("Triangulo escaleno.");
					
		
		
	}
}