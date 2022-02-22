package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.Zahlung;
import de.telekom.sea7.model.Zahlungen;
import de.telekom.sea7.services.*;

@RestController
public class ControllerZahlungen {
	@Autowired
	private ZahlungenService zahlungenService;
	
	@GetMapping("/zahlungen/")
	public Zahlungen getZahlungen() {
		return zahlungenService.getZahlungen();
				
	}
	
	@GetMapping("/zahlung/{zahlungnummer}")
	public Zahlung getZahlung(@PathVariable("zahlungnummer") int zahlungnummer) {
		return zahlungenService.getZahlungen().getZahlung(zahlungnummer);
	}

}
