package de.telekom.sea7.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Kunden {
	private ArrayList<Kunde> kunden;
	
public Kunden() {
		
		kunden = new ArrayList<>();
		Kunde kunde1 = new Kunde("Red", "Dust", "Ransch", "666" , "64401", "Groß-Bieberau", "DE876543");
		Kunde kunde2 = new Kunde("Gustav", "Gans", "Erpelweg", "7" , "12345", "Entenhausen", "DE776543");
		Kunde kunde3 = new Kunde("Andy", "Morgan", "Am Hafen", "1" , "64295", "Darmstadt", "DE676543");
		Kunde kunde4 = new Kunde("Luc", "Orient", "Eurokristall", "16" , "64401", "Groß-Bieberau", "DE576543");
		kunden.add(kunde1);
		kunden.add(kunde2);
		kunden.add(kunde3);
		kunden.add(kunde4);		
	}

/*	public void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck,
			LocalDateTime datum) {
		Zahlung zahlung = new Zahlung(betrag, empfaenger, iban, bic, verwendungszweck, datum);
		zahlungen.add(zahlung);
	}*/

	public Iterator iterator() {
// TODO Auto-generated method stub
		return kunden.iterator();
	}

	public ArrayList<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(ArrayList<Kunde> kunden) {
		this.kunden = kunden;
	}

	public int getIndex(Kunde kunde) {
		return this.kunden.indexOf(kunde);

	}
	public Kunde getKunde(int index) {
		return kunden.get(index);
	}

}
