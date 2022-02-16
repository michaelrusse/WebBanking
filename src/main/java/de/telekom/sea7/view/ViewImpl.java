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
	Zahlungen zahlung;

	@GetMapping("/zahlung.json")
	@ResponseBody
	public String getJson() {
		float betrag = zahlung.getZahlung().getBetrag();
		String empfaenger = zahlung.getZahlung().getEmpfaenger();
		String iban = zahlung.getZahlung().getIban();
		String bic = zahlung.getZahlung().getBic();
		String verwendungszweck = zahlung.getZahlung().getVerwendungszweck();
		LocalDateTime datum = zahlung.getZahlung().getDatum();

		String Json = "{" + "\"Betrag\"" + ":" + "\"" + betrag + "\"" + "," + "\"Empfaenger\"" + ":" + "\"" + empfaenger
				+ "\"" + "," + "\"Iban\"" + ":" + "\"" + iban + "\"" + "," + "\"BIC\"" + ":" + "\"" + bic + "\"" + ","
				+ "\"Verwendungszweck\"" + ":" + "\"" + verwendungszweck + "\"" + "," + "\"Datum\"" + ":" + "\"" + datum
				+ "\"" + "}";

		return Json;
	}

}
