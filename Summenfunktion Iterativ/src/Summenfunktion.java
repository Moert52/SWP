import java.util.Scanner;

public class Summenfunktion {

		
		public static void main(String[] argrs) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Zahl fuer die Summenfunktion:");
			int zahl = sc.nextInt();
			
			long summe = sum(zahl);
			System.out.println("Iterative Summenfunktion von "+ zahl +  ": " + summe );
		}
		
		
		//Methode fuer eine iterative Summenfunktion 
		public static long sum (int zahl) {	
			long z = 0;
			for(int i = 1; i <= zahl; i++) {
				z += i;
			}
			return z;	        
		}
		
		

	

}
