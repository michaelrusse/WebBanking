package de.telekom.sea7.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "iban")
public class EntityIBAN {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String iban;
	private int bic_id;
	
	public EntityIBAN() {
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getBic_id() {
		return bic_id;
	}

	public void setBic_id(int bic_id) {
		this.bic_id = bic_id;
	}

}
