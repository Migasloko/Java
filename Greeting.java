import java.time.LocalTime;
import java.util.Scanner;

public class Greeting {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Hora(auto)? ");
		
		int time; // variavel que guarda o tempo 
		
		if(in.hasNextInt()) // verificar se input é um valor inteiro ou uma palavra
			time = in.nextInt();
		else
			time = LocalTime.now().getHour();
		
		System.out.print("Nome? ");
		
		String a = in.nextLine(); // String para input do nome 
		String nome = in.nextLine();
		
		// Enquadramento do cumprimento baseado na hora do dia
		if(time > 7 && time < 12) {
			System.out.println("Bom dia " + nome);
		}
		else if(time > 11 && time < 18) {
			System.out.println("Boa tarde " + nome);
		}
		else if(time > 18 && time < 24 || time >=0 && time <= 6) {
			System.out.println("Boa noite " + nome);
		}
	}
}