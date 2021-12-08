import java.util.Random;

public class Bubblesort {
	
	
	
	public static void main(String[] argrs) {
		
		int[] n = randarr();
		for(int a : n) { System.out.print(a + "\t");}
		System.out.println();
		sort(n);
		for(int a : n) { System.out.print(a + "\t");}
		
	}
	
	public static int[] randarr(){
		Random r = new Random();
		int[] n = new int[10];
		for(int i=0; i<10; i++) {
			n[i] = r.nextInt(100);	
		}
		return n;
	}
	
	
	public static void sort(int[] arr) {
		for(int i = arr.length; i>0; i--) {
			for(int j = 0; j < i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int n = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = n;
				}
			}
			
		}
	}
}
