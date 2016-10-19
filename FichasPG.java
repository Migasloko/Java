import java.util.Scanner;

public class FichasPG {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Fichas realizadas? ");

		int fichas = in.nextInt();

		if(fichas == 3) {
			System.out.print("Notas das 3 fichas? ");

			int ficha1 = in.nextInt();
			int ficha2 = in.nextInt();
			int ficha3 = in.nextInt();

			float media1 = (ficha1 + ficha2 + ficha3) / 3.0F;

			System.out.println("Média=(" + ficha1 + "+" + ficha2 + "+" + ficha3 + ")/3 = " + media1);

			if(media1 < 8) System.out.println("Reprovado.");
		}

		else if(fichas == 4) {
			System.out.print("Notas das 4 fichas? ");

			int ficha1 = in.nextInt();
			int ficha2 = in.nextInt();
			int ficha3 = in.nextInt();
			int ficha4 = in.nextInt();

			float media2 = (ficha1 + ficha2 + ficha3) / 3.0F;

			System.out.println("Média=(" + ficha1 + "+" + ficha2 + "+" + ficha3 + ")/3 = " + media2);

			if(media2 < 8) System.out.println("Reprovado.");
		}
	}
}
