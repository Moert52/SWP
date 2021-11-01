package rekursive_Hochfunktion;

import java.util.Scanner;

public class Hochfunktion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zahl fuer die Hochfunktion:");
		int zahl = sc.nextInt();
		System.out.print("Potenz fuer die Hochfunktion:");
		int n = sc.nextInt();
		long e = powfak(zahl,n);
		System.out.println(e);
	}

	
	public static long powfak(int x, int n) {
		
		if(n >= 1) {
			return x * powfak(x, n-1);
		}
		else {
			return 1;
		}
		
		
	}
}
