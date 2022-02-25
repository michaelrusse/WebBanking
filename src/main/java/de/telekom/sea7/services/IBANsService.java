package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

import de.telekom.sea7.IBANs;

@Service
public class IBANsService {
	
	private IBANs ibans;

	public IBANs getIbans() {
		return ibans;
	}

	public void setIbans(IBANs ibans) {
		this.ibans = ibans;
	} 

}
