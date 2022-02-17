package de.telekom.sea7.view;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.telekom.sea7.model.Zahlungen;

@Controller
public class ViewImpl {

	@Autowired
	Zahlungen zahlungen;

	@GetMapping("json/zahlung.json")
	@ResponseBody
	public String getJson() {
		float betrag = zahlungen.getZahlung(1).getBetrag();
		String empfaenger = zahlungen.getZahlung(1).getEmpfaenger();
		String iban = zahlungen.getZahlung(1).getIban();
		String bic = zahlungen.getZahlung(1).getBic();
		String verwendungszweck = zahlungen.getZahlung(1).getVerwendungszweck();
		LocalDateTime datum = zahlungen.getZahlung(1).getDatum();

		String Json = "{" + "\"Betrag\"" + ":" + "\"" + betrag + "\"" + "," + "\"Empfaenger\"" + ":" + "\"" + empfaenger
				+ "\"" + "," + "\"Iban\"" + ":" + "\"" + iban + "\"" + "," + "\"BIC\"" + ":" + "\"" + bic + "\"" + ","
				+ "\"Verwendungszweck\"" + ":" + "\"" + verwendungszweck + "\"" + "," + "\"Datum\"" + ":" + "\"" + datum
				+ "\"" + "}";

		return Json;
	}

}
