package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.Kunde;
import de.telekom.sea7.model.Kunden;
import de.telekom.sea7.services.KundenService;


@RestController
public class ControllerKunden {
	
	@Autowired
	private KundenService kundenService;
	
	@GetMapping("/kunden/")
	public Kunden getKunden() {
		return kundenService.getKunden();
				
	}
	
	@GetMapping("/kunde/{kundenummer}")
	public Kunde getKunde(@PathVariable("kundenummer") int kundenummer) {
		return kundenService.getKunden().getKunde(kundenummer);
	}
	
	@PostMapping("/kunde/")
	public String addKunden(@RequestBody Kunde kunde) {
		Kunden kunden;
		kunden = kundenService.getKunden();
		kunden.add(kunde);
		return "Neuer Kunde angelegt";
		
		
		
	}

}
