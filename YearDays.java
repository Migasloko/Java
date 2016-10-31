import java.util.Scanner;

public class YearDays {
	
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
	 System.out.print("Dia Mês Ano? ");
     
	 // Variaveis de input do utilizador
	 int dd = in.nextInt(), d = dd;
     int m = in.nextInt();
     int y = in.nextInt();
     
	 // Soma dos dias ate chegar ao mês escrito
     switch(m-1) {
       case 11: d+= 30; 
       case 10: d+= 31;
       case 9: d+= 30;
       case 8: d+= 31;
       case 7: d+= 31;
       case 6: d+= 30;
       case 5: d+= 31;
       case 4: d+= 30;
       case 3: d+= 31;
       case 2: d+=(y%4==0 && y%100!=0 || y%400==0)?29:28;
       case 1: d+= 31;
     }
     System.out.println(d+" dias desde 1/1/"+y);
  }
}

