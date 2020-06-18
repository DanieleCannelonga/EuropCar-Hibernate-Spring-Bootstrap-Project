package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "AnnoContabile")
public class AnnoContabile {
	
	// Attributi
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idannocontabile;

	@Column(name = "Descrizione")
	@NotBlank(message="Il campo non può essere vuoto")
	private String descrizione;

	@Column(name = "DataInizio")
	@NotBlank(message="Il campo non può essere vuoto")
	private String dataInizio;

	@Column(name = "DataFine")
	@NotBlank(message="Il campo non può essere vuoto")
	private String dataFine;

	// Get e Set
	public int getIdannocontabile() {
		return idannocontabile;
	}
	public void setIdannocontabile(int idannocontabile) {
		this.idannocontabile = idannocontabile;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}
	public String getDataFine() {
		return dataFine;
	}
	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	// Costruttori
	public AnnoContabile() {
		this.inizializza();
	}

	private void inizializza() {
		this.idannocontabile = 0;
		this.descrizione = null;
		this.dataInizio = null;
		this.dataFine = null;
	}
}