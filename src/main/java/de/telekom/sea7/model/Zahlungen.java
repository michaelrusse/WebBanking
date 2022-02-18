package de.telekom.sea7.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Iterator;


public class Zahlungen {
	private ArrayList<Zahlung> zahlungen;

	public Zahlungen() {
		
		zahlungen = new ArrayList<>();
		LocalDateTime datum =LocalDateTime.now();
		Zahlung zahlung1 = new Zahlung(12.30f, "Hans Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck1",datum);
		Zahlung zahlung2 = new Zahlung(15.70f, "Franz Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck2",datum );
		Zahlung zahlung3 = new Zahlung(13.40f, "Hubertus Mustermann", "DE9944335566", "BIC87648", "Verwendungszweck3",datum);
		Zahlung zahlung4 = new Zahlung(12.45f, "Donald Duck", "DE123456", "BIC1234", "Reisekosten",datum);
		zahlungen.add(zahlung1);
		zahlungen.add(zahlung2);
		zahlungen.add(zahlung3);
		zahlungen.add(zahlung4);		
	}

	public void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck,
			LocalDateTime datum) {
		Zahlung zahlung = new Zahlung(betrag, empfaenger, iban, bic, verwendungszweck, datum);
		zahlungen.add(zahlung);
	}

	public Iterator iterator() {
// TODO Auto-generated method stub
		return zahlungen.iterator();
	}

	public int getIndex(Zahlung zahlung) {
		return this.zahlungen.indexOf(zahlung);

	}
	public Zahlung getZahlung(int index) {
		return zahlungen.get(index);
	}
	
/*	public Zahlung getZahlung(int index) {
		return (Zahlung) zahlungen.get(index);
	}
	
	* Diese Methode muss angewendet werden wenn man dem ArrayList keinen Objekttyp mit gibt.
	*
	*
	*/
	
}