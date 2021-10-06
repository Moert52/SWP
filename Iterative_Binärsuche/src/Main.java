/*
 * Es wird ein Array mit Zahlen mittels einer iterativen Suche durchsucht, ob
 * ein eine bestimmte zahl enthaelt, wenn ja soll es eine Erfolgsmeldung bringen, 
 * wenn nicht dann eine Fehlermeldung + die Anzahl der Schritte die es benoetigt
 */
import java.util.Arrays;


public class Main {

	//Variable fuer die Anzahl der Schritte
	private static int counter;
	
	public static void main(String[] argrs) {
		int[] zahlen = {56, 2, 6, 4, 7, 1, 77};	//Zahlenarray
		Arrays.sort(zahlen);
		
		//Frag ab die Methode suche ein true oder ein false ausgibt
		if( suche(4, zahlen)) {
			System.out.println("Gefunden");	//Wenn true dann Erfolgsmeldung
		} else {
			System.out.println("Nicht gefunden"); //Wenn false dann Fehlermeldung
		}
		System.out.println("Azahl Schritte " + counter); //Anzahl der benoetigten Schritte wird ausgegeben 

	}
	
	//Methode suche
	public static boolean suche (int zahl, int[] meineListe) {
		int an = 0;	// Indexzahl fuer den Anfang des Array
		int en = meineListe.length - 1;	//Indexzahl fuer das Ende der Array
		
		//Geht so lange bis an groesser oder gleich wie en ist
        while (an <= en) {
        	counter++;	//Counter wird um eins groesser
        	
            int za = an + (en - an) / 2;	//int za schaut ob es die Zahl in dem jeweiligen Index zu finden

            if (meineListe[za] > zahl) {	//Wenn die za groesser ist als wie die gesuchte, dann
            	en = za - 1;				//soll das en um eins kleiner werden

            } else if (meineListe[za] < zahl) {	//Wenn die za kleiner ist als wie die gesuchte, dann
                an = za + 1;		//soll das ann um eins groesser werden

            } else {		//Wenn za mit der gesuchten Zahl uebereinstimmt soll true ausgegeben werden
            	return true;
            }
        }
        return false;		//Wenn es mit keiner uebereinstimmt dann soll es false ausgeben.
	}

}
