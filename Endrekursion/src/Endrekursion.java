
public class Endrekursion {

	public static void main(String[] args) {
		final long start1 = System.nanoTime();
		System.out.println(Rsum(6));
		System.out.println(Rpowfak(5,2));
		final long end1 = System.nanoTime();
		System.out.println("Verlaufszeit der Rekursion: " + (end1 - start1) + " Millisek.");
		
		
		final long start = System.nanoTime();
		System.out.println(sum(6,5));
		System.out.println(powfak(5,5,2));
		final long end = System.nanoTime();
		System.out.println("Verlaufszeit der Endrekursion: " + (end - start) + " Millisek.");
		System.out.println(faku(3,4));
	}

	
	public static long sum (int m, int zahl) {	
		if(zahl == 0) {
			return m;
		} else {
			return sum(m + zahl, zahl-1);
		}
	}
	
	public static long faku (int m, int zahl) {	
		if(zahl == 1) {
			return m;
		} else {
			return faku(m * zahl, zahl-1);
		}
	}
	
	public static long powfak(int x,int base, int n) {
			
		if(n == 1) {
			return x;
		}
		else {
			return powfak(x*base, base, n-1);
		}
	}
	
	public static long Rpowfak(int x, int n) {
			
		if(n >= 1) {
			return x * Rpowfak(x, n-1);
		}
		else {
			return 1;
		}

	}
	
	public static long Rsum (int zahl) {	
		if(zahl >= 1) {
			return zahl+Rsum(zahl -1);
		}
	
		return 0;	
	}
}
