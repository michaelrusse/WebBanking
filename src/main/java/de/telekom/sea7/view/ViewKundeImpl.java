package de.telekom.sea7.view;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ViewKundeImpl {

	@Autowired
	de.telekom.sea7.services.KundenService kundenService;

	@GetMapping("json/kunde.json")
	@ResponseBody

	public String getJson(@RequestParam("kundennummer") int kundennummer) {
		String vorname = kundenService.getKunden().getKunde(kundennummer).getVorname();
		String nachname = kundenService.getKunden().getKunde(kundennummer).getNachname();
		String strasse = kundenService.getKunden().getKunde(kundennummer).getStrasse();
		String hausnummer = kundenService.getKunden().getKunde(kundennummer).getHausnummer();
		String plz = kundenService.getKunden().getKunde(kundennummer).getPlz();
		String ort = kundenService.getKunden().getKunde(kundennummer).getOrt();
		String iban = kundenService.getKunden().getKunde(kundennummer).getIban();

		String kjson = "{" + "\"Vorname\"" + ":" + "\"" + vorname + "\"" + "," + "\"Nachname\"" + ":" + "\"" + nachname
				+ "\"" + "," + "\"Strasse\"" + ":" + "\"" + strasse + "\"" + "," + "\"Hausnummer\"" + ":" + "\"" + hausnummer + "\"" + ","
				+ "\"PLZ\"" + ":" + "\"" + plz + "\"" + "," + "\"Ort\"" + ":" + "\"" + ort + "\"" + "," + "\"IBAN\"" + ":" + "\"" + iban
				+ "\"" + "}";
		return kjson;
	}

	/*
	 * @GetMapping("/ViewZahlung.html")
	 * 
	 * @ResponseBody public int getZahlungNummer(@RequestParam("zahlungnummer") int
	 * zahlungsnummer) {
	 * 
	 * /*return zahlungsnummer;
	 * 
	 * }
	 */
}
