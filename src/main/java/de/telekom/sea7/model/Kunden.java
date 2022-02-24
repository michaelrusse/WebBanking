package de.telekom.sea7.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Kunden implements Iterable<Kunde> {
	private ArrayList<Kunde> kundenArrayList;

	public Kunden() {

		kundenArrayList = new ArrayList<>();
		Kunde kunde1 = new Kunde("Red", "Dust", "Ransch", "666", "64401", "Groß-Bieberau", "DE876543");
		Kunde kunde2 = new Kunde("Gustav", "Gans", "Erpelweg", "7", "12345", "Entenhausen", "DE776543");
		Kunde kunde3 = new Kunde("Andy", "Morgan", "Am Hafen", "1", "64295", "Darmstadt", "DE676543");
		Kunde kunde4 = new Kunde("Luc", "Orient", "Eurokristall", "16", "64401", "Groß-Bieberau", "DE576543");
		kundenArrayList.add(kunde1);
		kundenArrayList.add(kunde2);
		kundenArrayList.add(kunde3);
		kundenArrayList.add(kunde4);
	}

	public void add(Kunde kunde) {
		kundenArrayList.add(kunde);
	}

	/*
	 * public void add(float betrag, String empfaenger, String iban, String bic,
	 * String verwendungszweck, LocalDateTime datum) { Zahlung zahlung = new
	 * Zahlung(betrag, empfaenger, iban, bic, verwendungszweck, datum);
	 * zahlungen.add(zahlung); }
	 */

	public Iterator<Kunde> iterator() {
// TODO Auto-generated method stub
		return kundenArrayList.iterator();
	}

	public ArrayList<Kunde> getKunden() {
		return kundenArrayList;
	}

	public void setKunden(ArrayList<Kunde> kunden) {
		this.kundenArrayList = kunden;
	}

	public int getIndex(Kunde kunde) {
		return this.kundenArrayList.indexOf(kunde);

	}

	public Kunde getKunde(int index) {
		return kundenArrayList.get(index);
	}

}
