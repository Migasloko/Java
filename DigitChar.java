import java.util.Scanner;

public class DigitChar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digito e Valor? ");
		
	    char digito = in.next().charAt(0);
		int valor = in.nextInt();
		
		if(digito >= 'A' && digito <= 'Z' || digito >= 'a' && digito <= 'z') {
			System.out.println(digito + " não é dígito.");
		}
		else {
			int soma = digito + valor;
			System.out.println("'" + digito + "'(" + (int) digito + ") + " + valor + " ='" + (char) soma + "'(" + soma + ")");
		}
	}
}