import java.util.Scanner;

public class FichasPG {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Fichas realizadas? ");

		int fichas = in.nextInt(); // input do numero de fichas realizadas 

		if(fichas == 3) {
			System.out.print("Notas das 3 fichas? ");
			
			int sub = 0; // variavel temporaria para guardar valores e fazer trocas
			
			int ficha1 = in.nextInt();
			int ficha2 = in.nextInt();
			int ficha3 = in.nextInt();

			float media1 = (ficha1 + ficha2 + ficha3) / 3.0F;

			// ordernação dos numeros em ordem decrescente
			if(ficha1 < ficha2) {
				sub = ficha1;			
				ficha1 = ficha2;
				ficha2 = sub;
				
			}
			if (ficha1 < ficha3) {
				sub = ficha1;
				ficha1 = ficha3;
				ficha3 = sub;
								
			}
			if (ficha2 < ficha3) {
				sub = ficha2;
				ficha2 = ficha3;
				ficha3 = sub;
								
			}
			
			System.out.println("Média=(" + ficha1 + "+" + ficha2 + "+" + ficha3 + ")/3 = " + media1);

			
			
		// Verificar se o utilizador tem de melhorar a nota para nao reprovar, melhorar a media ou se está reprovado
		if(fichas == 3) {
			int min = 24 - ficha1 - ficha2;
			if(media1 < 8) {
				System.out.println("ficha4 > " + min + " para melhorar a media.");
			}
			else if(media1 >= 8) {
				System.out.println("ficha4 > " + ficha3 + " para melhorar a media.");
			}
			else if(min > 20) {
				System.out.println("Reprovado");
			}
		}
		}
		else if(fichas == 4) {
			System.out.print("Notas das 4 fichas? ");
			
			int sub = 0; // variavel para guardar valores e fazer trocas 

			int ficha1 = in.nextInt();
			int ficha2 = in.nextInt();
			int ficha3 = in.nextInt();
			int ficha4 = in.nextInt();

			float media2 = (ficha1 + ficha2 + ficha3) / 3.0F; // calculo da media das 3 fichas 
			
			// ordernação dos numeros em ordem decrescente 
			if(ficha1 < ficha2) {
				sub = ficha1;			
				ficha1 = ficha2;
				ficha2 = sub;
				
			}
			if (ficha1 < ficha3) {
				sub = ficha1;
				ficha1 = ficha3;
				ficha3 = sub;
								
			}
			if (ficha2 < ficha3) {
				sub = ficha2;
				ficha2 = ficha3;
				ficha3 = sub;
								
			}
			if(ficha1 < ficha4) {
				sub = ficha1;
				ficha1 = ficha4;
				ficha4 = sub;
			}
			if(ficha2 < ficha4) {
				sub = ficha2;
				ficha2 = ficha4;
				ficha4 = sub;
			}
			if(ficha3 < ficha4) {
				sub = ficha3;
				ficha3 = ficha4;
				ficha4 = sub;
			}

			System.out.println("Média=(" + ficha1 + "+" + ficha2 + "+" + ficha3 + ")/3 = " + media2);

			if(media2 < 8) System.out.println("Reprovado.");
		}
	}
}
