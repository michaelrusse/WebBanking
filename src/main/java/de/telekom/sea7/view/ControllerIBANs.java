package de.telekom.sea7.view;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.IBAN;
import de.telekom.sea7.IBANs;
import de.telekom.sea7.services.IBANsService;

@RestController
public class ControllerIBANs {
	
	@Autowired
	private IBANsService ibansService;
	
	@GetMapping("/ibans/") 
	public IBANs getIBANs()	{
		return ibansService.getIbans();
	}
	
	@GetMapping("/iban/{ibanid}")
	public IBAN getIban(@PathVariable("ibanid") int ibanid) throws SQLException {
		return ibansService.getIbans().get(ibanid);
	}
	
	@PostMapping("/iban/")
	public String addIban(@RequestBody IBAN iban) throws SQLException {
		IBANs ibans;
		ibans = ibansService.getIbans();
		ibans.add(iban);
		return "Neue IBAN angelegt";
	}
	
	@PutMapping("/iban/{ibanid}")
	public IBAN updateIban(@RequestBody IBAN iban,@PathVariable("ibanid") int ibanid) throws SQLException {
		IBANs ibans;
		ibans = ibansService.getIbans();
		ibans.delete(ibanid);
		ibans.add(iban);
		return null;
	}
	
	@DeleteMapping("/iban/{ibanid}")
	public IBAN deleteIban(@PathVariable("ibanid") int ibanid)throws SQLException {
		IBANs ibans;
		ibans = ibansService.getIbans();
		ibans.delete(ibanid);	
		return null;
		
	}
		
	

}
