import java.util.Scanner;

public class Triang {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Valores dos lados? ");

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a)) {
			System.out.println("Triângulo Isósceles");
		}

		else if(a == b && b == c) {
			System.out.println("Triângulo equilátero");
		}

		else {
			System.out.println("Triângulo escaleno");
		}
	}
}
