/*
 * Ein Array mit Zahlen wird mittels iterativer Suche durchstoebert, ob
 * eine bestimmte Zahl vorhanden ist, dabei soll es einer Erfolgs oder eien Fehlermeldung
 * bringen ob die bestimmte Zahl gefundne wurde + die Anzahl der SChritte die fuer die Suche
 * benoetigt ist.
 */

import java.util.Arrays;

public class main {

	public static int counter = 0;		//counter fuer die Anzahl der Schritte
	
	public static void main(String[] argrs) {
		int[] zahlen = {56, 2, 6, 4, 7, 1, 77, 52};	//ein Array mit Zahlen
		Arrays.sort(zahlen); 	//Sortiert die Zahlen
		
		//Wird abgepueft mittels der Methode suche, ob die jewilige Zahl im Array vorhanden ist
		if( suche(4, zahlen)) {
			System.out.println("Gefunden");	//Wenn true, dann erfolgsmeldung
		} else {
			System.out.println("Nicht gefunden"); //Wenn false dann Fehlermeldung
		}
		System.out.println("Azahl Schritte " + counter); //Anzahl der benoetigten Schritte wird ausgegeben

		int[] ar = erstelleArr(13);
		main.ausgabe(ar);
	}
	
	
	//Methode fuer eine iterative Suche
	public static boolean suche (int zahl, int[] meineListe) {
		int an = 0;	//Die Indexzahl mit dem angefangen wird
		int en = meineListe.length - 1;	//Indexzahl mit dem Ende des Arrays
		
		//geht so lange bis an groesser oder gleich wie en ist oder true returniert wird
        while (an <= en) {
        	counter++;		//Counter wird um eins groesser 
        	//Indexzahl die dann abprueft, ob der Array an der Stelle die bestimmte Zahl hat
            int za = an + (en - an) / 2;	

            //Wenn die Zahl vom Array groesser ist als wie die gesuchte, dann
            if (meineListe[za] > zahl) {
            	en = za - 1;	//soll en den Wert von za-1 bekommen (kurz: die Haelfte des Array geht weg)

            //Wenn die Zahl vom Array kleiner ist als wie die gesuchte, dann
            } else if (meineListe[za] < zahl) {
                an = za + 1;	//soll an den Wert von za+1 bekommen (kurz: die Haelfte des Array geht weg)

            } else {	//Wenn die gesuchte Zahl mit der Zahl im Array uebereinstimmt
            	return true;	//Dann soll true ausgegeben werden 
            }
        }
        return false;	//Wenn keine Zahl im Array mit der gesuchten Zahl uebereinstimmt dann false
	}
	
	
	public static int[] erstelleArr(int laenge) {
		int ar[] = new int[laenge];
		for(int i = 0; i < ar.length; i++)  {
			ar[i] = i+1;
		}
		return ar;
	}
	
	public static void ausgabe(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
