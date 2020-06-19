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
@Table(name = "OrdineAcquistoDettaglio")
public class OrdineAcquistoDettaglio {
	// Costanti
	public static final String PROPERTY_idOdineacquisto = "idordineacquistodettaglio";
	public static final String PROPERTY_codice = "importo";
	public static final String PROPERTY_quantita = "quantita";
	public static final String PROPERTY_idordineacquisto = "idordineacquisto";
	public static final String PROPERTY_idspesainvestimento = "idspesainvestimento";
	
	// Attributi
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idordineacquistodettaglio;

	@Column(name = "Importo")
	@NotNull(message="Il campo non può essere vuoto")
	private float importo;

	@Column(name = "Quantita")
	@NotBlank(message="Il campo non può essere vuoto")
	private Integer quantita;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idordineacquisto")
	private OrdineAcquisto oordineAcquisto;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idspesainvestimento")
	private SpesaInvestimento ospesaInvestimento;

	// Get e Set
	public int getIdordineacquistodettaglio() {
		return idordineacquistodettaglio;
	}
	public void setIdordineacquistodettaglio(int idordineacquistodettaglio) {
		this.idordineacquistodettaglio = idordineacquistodettaglio;
	}
	public float getImporto() {
		return importo;
	}
	public void setImporto(float importo) {
		this.importo = importo;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public OrdineAcquisto getOordineAcquisto() {
		return oordineAcquisto;
	}
	public void setOordineAcquisto(OrdineAcquisto oordineAcquisto) {
		this.oordineAcquisto = oordineAcquisto;
	}
	public SpesaInvestimento getOspesaInvestimento() {
		return ospesaInvestimento;
	}
	public void setOspesaInvestimento(SpesaInvestimento ospesaInvestimento) {
		this.ospesaInvestimento = ospesaInvestimento;
	}

	// Costruttori
	public OrdineAcquistoDettaglio() {
		this.inizializza();
	}

	private void inizializza() {
		this.idordineacquistodettaglio = 0;
		this.importo = 0;
		this.quantita = 0;
		this.oordineAcquisto = null;
		this.ospesaInvestimento = null;
	}
}