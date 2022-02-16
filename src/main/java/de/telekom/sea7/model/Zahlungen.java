package de.telekom.sea7.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


@Component
public class Zahlungen {
	private Zahlung zahlung;
	
	public Zahlungen() {
		this.zahlung = new Zahlung(12.45f, "Donald Duck", "DE123456", "BIC1234", "Reisekosten",LocalDateTime.now());
	}

	public Zahlung getZahlung() {
		return zahlung;
	}

	public void setZahlung(Zahlung zahlung) {
		this.zahlung = zahlung;
	}

}
