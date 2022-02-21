package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.telekom.sea7.services.ZahlungenService;

@Controller
public class ViewThymeleaf {

	@Autowired
	private ZahlungenService zahlungenService;

	@GetMapping("/")
	public String home(Model model,

			@RequestParam(value = "name",

					required = false,

					defaultValue = "World") String name

	) {

		model.addAttribute("name", name);
		model.addAttribute("zahlungen", zahlungenService.getZahlungen());

		return "home";

	}

}
