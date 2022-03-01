package de.telekom.sea7.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.telekom.sea7.entity.EntityZahlungen;
import de.telekom.sea7.repository.ZahlungenRepository;

@Service
public class ZahlungenService {

	@Autowired
	private ZahlungenRepository repository;
	
	public EntityZahlungen addZahlung(EntityZahlungen zahlung) {
		 EntityZahlungen zahlung2 = repository.save(zahlung);
		return zahlung2;
	}

	public Iterable<EntityZahlungen>  getZahlungen() {
		Iterable<EntityZahlungen> zahlungen = repository.findAll();
		return zahlungen;
	}


	public  Optional<EntityZahlungen> getZahlung(long id) {
		 Optional<EntityZahlungen> zahlung = repository.findById(id);
		 return zahlung;
		}
	
	public String deleteZahlung(long id) {
		repository.deleteById(id);
		 return "Datensatz gelöscht";
	}

}
