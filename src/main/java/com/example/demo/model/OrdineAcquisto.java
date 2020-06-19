package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "OrdineAcquisto")
public class OrdineAcquisto {
	// Costanti
	public static final String PROPERTY_idOdineacquisto = "idordineacquisto";
	public static final String PROPERTY_codice = "importo";
	public static final String PROPERTY_ordineAcquisto = "ordineAcquisto";
	public static final String PROPERTY_data = "data";
	public static final String PROPERTY_idfornitore = "idfornitore";
	// Attributi

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idordineacquisto;

	@Column(name = "Importo")
	@NotNull(message="Il campo non può essere vuoto")
	private float importo;

	@Column(name = "OrdineAcquisto")
	@NotBlank(message="Il campo non può essere vuoto")
	private String ordineAcquisto;

	@Column(name = "Data")
	@NotBlank(message="Il campo non può essere vuoto")
	private String data;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idfornitore")
	private Fornitore ofornitore;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "oordineAcquisto", orphanRemoval = true)
    @Fetch(FetchMode.SUBSELECT)
    @NotNull(message = "Il campo non può essere vuoto")
    private List<OrdineAcquistoDettaglio> dettagli = new ArrayList<OrdineAcquistoDettaglio>();

	// Get e Set
	public int getIdordineacquisto() {
		return idordineacquisto;
	}
	public void setIdordineacquisto(int idordineacquisto) {
		this.idordineacquisto = idordineacquisto;
	}
	public float getImporto() {
		return importo;
	}
	public void setImporto(float importo) {
		this.importo = importo;
	}
	public String getOrdineAcquisto() {
		return ordineAcquisto;
	}
	public void setOrdineAcquisto(String ordineAcquisto) {
		this.ordineAcquisto = ordineAcquisto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Fornitore getOfornitore() {
		return ofornitore;
	}
	public void setOfornitore(Fornitore ofornitore) {
		this.ofornitore = ofornitore;
	}

	// Costruttori
	public OrdineAcquisto() {
		this.inizializza();
	}

	private void inizializza() {
		this.idordineacquisto = 0;
		this.importo = 0;
		this.ordineAcquisto = null;
		this.data = null;
		this.ofornitore = null;
	}
}