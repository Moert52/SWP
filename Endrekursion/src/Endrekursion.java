
public class Endrekursion {

	public static void main(String[] args) {
		final long start1 = System.nanoTime();
		System.out.println(Rsum(6));
		System.out.println(Rpowfak(5,2));
		final long end1 = System.nanoTime();
		System.out.println("Verlaufszeit der Rekursion: " + (end1 - start1) + " Nanosek.");
		
		
		final long start = System.nanoTime();
		System.out.println(endsum(6));
		System.out.println(endpowfak(5,2));
		final long end = System.nanoTime();
		System.out.println("Verlaufszeit der Endrekursion: " + (end - start) + " Nanosek.");
		System.out.println(endfaku(5));
	}

	public static long endsum(int n) {
		return sum(0, n);
	}
	
		public static long sum (int m, int zahl) {	
			if(zahl <= 0) {
				return m;
			}
			return sum(m + zahl, zahl-1);
			
		}
	
	public static long endfaku(int n) {
		return faku(1, n);
	}	
		
	public static long faku (int m, int zahl) {	
		if(zahl <= 1) {
			return m;
		}
		return faku(m * zahl, zahl-1);
	}
	
	
	
	public static long endpowfak(int base, int n) {
		return powfak(base,base, n);
	}
	
	public static long powfak(int x,int base, int n) {
			
		if(n <= 1) {
			return x;
		}
		return powfak(x*base, base, n-1);
		
	}
	
	
	
	
	
	
	public static long Rpowfak(int x, int n) {
			
		if(n >= 1) {
			return x * Rpowfak(x, n-1);
		}
		return 1;
		

	}
	
	public static long Rsum (int zahl) {	
		if(zahl >= 1) {
			return zahl+Rsum(zahl -1);
		}
	
		return 0;	
	}
}
