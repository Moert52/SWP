import java.util.Scanner;

public class Summenfunktion {

		
		public static void main(String[] argrs) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Zahl fuer die Summenfunktion:");
			int zahl = sc.nextInt();
			
			long summe = sum(zahl);
			System.out.println("Rekursive Summenfunktion von "+ zahl +  ": " + summe );
		}
		
		
		//Methode fuer eine iterative Summenfunktion 
		public static long sum (int zahl) {	
			if(zahl >= 1) {
				return zahl+sum(zahl -1);
			}
			else {
				return 0;	
			}
	        
		}
		
		

	

}
