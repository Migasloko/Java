import java.time.LocalTime;
import java.util.Scanner;

public class Greeting {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nome? ");
		
		String name = in.nextLine();
		
		System.out.print("Hora(auto)? ");
 
		char a = in.next().charAt(0);
		
		if(a == 'a') {
			int time = LocalTime.now().getHour();	
		}
		else {
			int time = (int) a;
		}
		if(time > 6 && time < 12) {
			System.out.println("Bom dia " + name);
		}
		else if(time > 11 && time < 19) {
			System.out.println("Boa tarde " + name);
		}
		else {
			System.out.println("Boa noite " + name);
		}	
	}
}