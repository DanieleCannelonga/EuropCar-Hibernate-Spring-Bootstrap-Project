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
@Table(name = "Area")
public class Area {
	// Costanti
	public static final String PROPERTY_idArea = "idarea";
	public static final String PROPERTY_codice = "codice";
	public static final String PROPERTY_area = "area";
	// Attributi

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idarea;

	//@ManyToOne
	// @JoinColumn(name = "idvenditore")
	// @NotNull(message="il campo non può essere nullo")
	// private Venditore ovenditore;

	@Column(name = "Codice")
	@NotBlank(message="Il campo non può essere vuoto")
	private String codice;

	@Column(name = "Area")
	@NotBlank(message="Il campo non può essere vuoto")
	private String area;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idannocontabile")
	private AnnoContabile oannocontabile;

	// Get e Set
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getIdarea() {
		return idarea;
	}
	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public AnnoContabile getOannocontabile() {
		return oannocontabile;
	}
	public void setOannocontabile(AnnoContabile oannocontabile) {
		this.oannocontabile = oannocontabile;
	}
	
	// Costruttori
	public Area() {
		this.inizializza();
	}

	private void inizializza() {
		this.idarea = 0;
		this.codice = null;
		this.area = null;
		this.oannocontabile = null;
		//  this.setOvenditore(null);
	}
}