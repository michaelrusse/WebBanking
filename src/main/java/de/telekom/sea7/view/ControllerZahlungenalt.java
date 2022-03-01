/*package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.Zahlung;
import de.telekom.sea7.model.Zahlungen;
import de.telekom.sea7.services.*;

@RestController
public class ControllerZahlungenalt {
	@Autowired
	private ZahlungenService zahlungenService;

	@GetMapping("/zahlungen/")
	public Zahlungen getZahlungen() {
		return zahlungenService.getZahlungen();

	}

	@GetMapping("/zahlung/{zahlungnummer}")
	public Zahlung getZahlung(@PathVariable("zahlungnummer") int zahlungnummer) {
		return zahlungenService.getZahlung(zahlungnummer);
	}

	@PostMapping("/zahlung/")
	public String addZahlungen(@RequestBody Zahlung zahlung) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.add(zahlung);
		return "Zahlung raus";
	}
	
	@PutMapping("/zahlung/{zahlungsnummer}")
	public Zahlung updateZahlung(@RequestBody Zahlung zahlung,@PathVariable(name ="zahlungsnummer") int zahlungsnummer) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.delete(zahlungsnummer);
		zahlungen.add(zahlung);
		return null;
	}
	
	@DeleteMapping("/zahlung/{zahlungsnummer}")
	public Zahlung deleteZahlung(@PathVariable("zahlungsnummer") int zahlungsnummer) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.delete(zahlungsnummer);
		return null;
	}

}*/
