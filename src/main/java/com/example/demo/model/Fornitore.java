package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Fornitore")
public class Fornitore {
	// Costanti
	public static final String PROPERTY_idFornitore = "idfornitore";
	public static final String PROPERTY_ragioneSociale = "ragioneSociale";
	public static final String PROPERTY_indirizzo = "indirizzo";
	public static final String PROPERTY_citta = "citta";
	public static final String PROPERTY_cap = "cap";
	public static final String PROPERTY_provincia = "provincia";
	public static final String PROPERTY_partitaIva = "partitaIva";
	// Attributi

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idfornitore;

	@Column(name = "RagioneSociale")
	@NotBlank(message="Il campo non può essere vuoto")
	private String ragioneSociale;

	@Column(name = "Indirizzo")
	@NotBlank(message="Il campo non può essere vuoto")
	private String indirizzo;

	@Column(name = "Citta")
	@NotBlank(message="Il campo non può essere vuoto")
	private String citta;

	@Column(name = "Cap")
	@NotBlank(message="Il campo non può essere vuoto")
	private String cap;

	@Column(name = "Provincia")
	@NotBlank(message="Il campo non può essere vuoto")
	private String provincia;

	@Column(name = "PartitaIva")
	@NotBlank(message="Il campo non può essere vuoto")
	private String partitaIva;

	//Get & Set

	public int getIdfornitore() {
		return idfornitore;
	}
	public void setIdfornitore(int idfornitore) {
		this.idfornitore = idfornitore;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	// Costruttori
	public Fornitore() {
		this.inizializza();
	}

	private void inizializza() {
		this.idfornitore = 0;
		this.ragioneSociale = "";
		this.indirizzo = "";
		this.citta = "";
		this.cap = "";
		this.provincia = "";
		this.partitaIva = "";
		//  this.setOvenditore(null);
	}
}