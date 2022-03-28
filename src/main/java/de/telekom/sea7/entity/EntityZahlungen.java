package de.telekom.sea7.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "zahlungen")

public class EntityZahlungen {
	
	/**
	 * @ID spezifiziert den Primary Key der Entity.
	 * @GeneratedValue:Sorgt für die Spezifikation von Generierungsstrategien für
	 *                       die Werte von Primärschlüsseln. Die
	 *                       GeneratedValue-Anmerkung kann in Verbindung mit der
	 *                       Id-Anmerkung auf eine Primärschlüsseleigenschaft oder
	 *                       ein Feld einer Entität oder einer zugeordneten
	 *                       Superklasse angewendet werden. Die Verwendung der
	 *                       GeneratedValue-Annotation muss nur für einfache
	 *                       Primärschlüssel unterstützt werden.
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float betrag;
	private String empfaenger;
	private String verwendungszweck;
	private LocalDateTime datum;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "iban_id")
	private EntityIBAN entityIBAN;
	

	public EntityZahlungen() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getBetrag() {
		return betrag;
	}

	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}

	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	public EntityIBAN getEntityIBAN() {
		return entityIBAN;
	}

	public void setEntityIBAN(EntityIBAN entityIBAN) {
		this.entityIBAN = entityIBAN;
	}

	
}