package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

import de.telekom.sea7.model.Zahlungen;

@Service
public class ZahlungenService {

	private Zahlungen zahlungen = new Zahlungen();

	public Zahlungen getZahlungen() {
		return zahlungen;
	}

	public void setZahlungen(Zahlungen zahlungen) {
		this.zahlungen = zahlungen;
	}
	
}
