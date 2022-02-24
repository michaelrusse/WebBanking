package de.telekom.sea7.model;


import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Iterator;


public class Zahlungen implements Iterable<Zahlung> {
	private ArrayList<Zahlung> zahlungenArrayList;

	public Zahlungen()  {
		
		zahlungenArrayList = new ArrayList<>();
		LocalDateTime datum =LocalDateTime.now();
		Zahlung zahlung1 = new Zahlung(12.30f, "Hans Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck1",datum);
		Zahlung zahlung2 = new Zahlung(15.70f, "Franz Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck2",datum );
		Zahlung zahlung3 = new Zahlung(13.40f, "Hubertus Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck3",datum);
		Zahlung zahlung4 = new Zahlung(12.45f, "Donald Duck", "DE123456", "BIC1234", "Reisekosten",datum);
		zahlungenArrayList.add(zahlung1);
		zahlungenArrayList.add(zahlung2);
		zahlungenArrayList.add(zahlung3);
		zahlungenArrayList.add(zahlung4);		
	}

	public void add(Zahlung zahlung) {
		zahlungenArrayList.add(zahlung);
	}

	public Iterator<Zahlung> iterator() {
// TODO Auto-generated method stub
		return zahlungenArrayList.iterator();
	}

	public int getIndex(Zahlung zahlung) {
		return this.zahlungenArrayList.indexOf(zahlung);

	}
	public Zahlung getZahlung(int index) {
		return zahlungenArrayList.get(index);
	}

	public void setZahlungenArrayList(ArrayList<Zahlung> zahlungenArrayList) {
		this.zahlungenArrayList = zahlungenArrayList;
	}

	public void delete(int zahlungsnummer) {
		zahlungenArrayList.remove(zahlungsnummer);
		
	}
	
	
	
/*	public Zahlung getZahlung(int index) {
		return (Zahlung) zahlungen.get(index);
	}
	
	* Diese Methode muss angewendet werden wenn man dem ArrayList keinen Objekttyp mit gibt.
	*
	*
	*/
	
}