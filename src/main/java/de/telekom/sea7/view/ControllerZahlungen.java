package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.entity.EntityZahlungen;
import de.telekom.sea7.model.Zahlung;
import de.telekom.sea7.model.Zahlungen;
import de.telekom.sea7.services.*;
import de.telekom.sea7.repository.*;

@RestController
public class ControllerZahlungen {
	@Autowired
	private ZahlungenService zahlungenService;

	@GetMapping("/zahlungen/")
	public Iterable<EntityZahlungen> getZahlungen() {
		return zahlungenService.getZahlungen();

	}

	@GetMapping("/zahlung/{id}")
	public Optional<EntityZahlungen> getZahlung(@PathVariable("id") long id) {
		return zahlungenService.getZahlung(id);
	}

	@PostMapping("/zahlung/")
	public String addZahlungen(@RequestBody EntityZahlungen zahlung) {

		zahlungenService.addZahlung(zahlung);
		return "Zahlung raus";
	}

	@PutMapping("/zahlung/{id}")
	public EntityZahlungen updateZahlung(@RequestBody EntityZahlungen zahlung, @PathVariable(name = "id") long id) {
		zahlungenService.deleteZahlung(id);
		zahlungenService.addZahlung(zahlung);
		return null;
	}

	@DeleteMapping("/zahlung/{id}")
	public String deleteZahlung(@PathVariable("id") long id) {
		zahlungenService.deleteZahlung(id);
		return null;
	}

}
