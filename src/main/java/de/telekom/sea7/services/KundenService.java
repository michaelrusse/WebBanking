package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

import de.telekom.sea7.model.Kunden;

@Service
public class KundenService {
	
	private Kunden kunden = new Kunden();

	public Kunden getKunden() {
		return kunden;
	}

	public void setKunden(Kunden kunden) {
		this.kunden = kunden;
	}
	
}
