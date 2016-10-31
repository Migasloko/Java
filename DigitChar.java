import java.util.Scanner;

public class DigitChar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digito e Valor? ");
        
		//Variaveis de input do utilizador
		char digito = in.next().charAt(0); // char para o digito 
		int valor = in.nextInt(); // int para o valor 

		
		// Verificar se é digito ou nao
		if(digito >= 'A' && digito <= 'Z' || digito >= 'a' && digito <= 'z') {
			System.out.println(digito + " não é dígito.");
		}
		else {
			int soma = digito + valor; // Soma dos valores escritos 
			System.out.println("'" + digito + "'(" + (int) digito + ") + " + valor + " ='" + (char) soma + "'(" + soma + ")");
		}
	}
}
