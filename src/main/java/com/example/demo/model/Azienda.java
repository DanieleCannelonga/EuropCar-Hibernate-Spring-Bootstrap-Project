package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Azienda")
public class Azienda {
	// Costanti
	public static final String PROPERTY_idArea = "idazienda";
	public static final String PROPERTY_codice = "contractID";
	public static final String PROPERTY_indirizzo = "indirizzo";
	public static final String PROPERTY_ragioneSociale = "ragioneSociale";
	public static final String PROPERTY_idgruppo = "idgruppo";
	// Attributi

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idazienda;

	@Column(name = "ContractID")
	@NotBlank(message="Il campo non può essere vuoto")
	private String contractID;

	@Column(name = "Indirizzo")
	@NotBlank(message="Il campo non può essere vuoto")
	private String indirizzo;

	@Column(name = "RagioneSociale")
	@NotBlank(message="Il campo non può essere vuoto")
	private String ragioneSociale;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idgruppo")
	private Gruppo ogruppo;

	//Get & Set
	public int getIdazienda() {
		return idazienda;
	}
	public void setIdazienda(int idazienda) {
		this.idazienda = idazienda;
	}
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public Gruppo getOgruppo() {
		return ogruppo;
	}
	public void setOgruppo(Gruppo ogruppo) {
		this.ogruppo = ogruppo;
	}

	// Costruttori
	public Azienda() {
		this.inizializza();
	}

	private void inizializza() {
		this.idazienda = 0;
		this.contractID = null;
		this.indirizzo = null;
		this.ragioneSociale = null;
		this.ogruppo = null;
	}
}