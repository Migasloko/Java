import java.util.Scanner;

public class KByte {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Valor em KBytes? "); 

		double kb = in.nextDouble(); // Variavel para input do valor em KBytes

    System.out.println(kb + " KByte = " + (int)(kb * 1024) + " Byte."); // Output da conversao de KBytes para Bytes
	}
}
