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
@Table(name = "SpesaInvestimento")
public class SpesaInvestimento {
	
	// Attributi
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idspesainvestimento;

	@Column(name = "SpesaInvestimento")
	@NotBlank(message="Il campo non può essere vuoto")
	private String spesaInvestimento;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idsottocategoria")
	private SottoCategoria osottocategoria;

	// Get e Set
	public int getIdspesainvestimento() {
		return idspesainvestimento;
	}
	public void setIdspesainvestimento(int idspesainvestimento) {
		this.idspesainvestimento = idspesainvestimento;
	}
	public String getSpesaInvestimento() {
		return spesaInvestimento;
	}
	public void setSpesaInvestimento(String spesaInvestimento) {
		this.spesaInvestimento = spesaInvestimento;
	}
	public SottoCategoria getOsottocategoria() {
		return osottocategoria;
	}
	public void setOsottocategoria(SottoCategoria osottocategoria) {
		this.osottocategoria = osottocategoria;
	}

	// Costruttori
	public SpesaInvestimento() {
		this.inizializza();
	}
	private void inizializza() {
		this.idspesainvestimento = 0;
		this.spesaInvestimento = null;
		this.osottocategoria = null;
	}
}