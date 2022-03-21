package de.telekom.sea7.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name = "iban")
public class EntityIBAN {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String iban;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "bic_id")
	private EntityBIC entityBIC;
	
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


	public EntityBIC getEntityBIC() {
		return entityBIC;
	}


	public void setEntityBIC(EntityBIC entityBIC) {
		this.entityBIC = entityBIC;
	}

}
