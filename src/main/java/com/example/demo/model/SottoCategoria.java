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
@Table(name = "SottoCategoria")
public class SottoCategoria {
	// Costanti
	public static final String PROPERTY_idSottocategoria = "idsottocategoria";
	public static final String PROPERTY_idArea = "idarea";
	public static final String PROPERTY_codice = "codice";
	public static final String PROPERTY_sottoCategoria = "sottoCategoria";
	public static final String PROPERTY_budget = "budget";
	public static final String PROPERTY_budgetSpeso = "budgetSpeso";
	// Attributi

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idsottocategoria;

	@ManyToOne
	@NotNull(message="Il campo non può essere vuoto")
	@JoinColumn(name = "idarea")
	private Area oarea;

	@Column(name = "Codice")
	@NotBlank(message="Il campo non può essere vuoto")
	private String codice;

	@Column(name = "SottoCategoria")
	@NotBlank(message="Il campo non può essere vuoto")
	private String sottoCategoria;

	@Column(name = "Budget")
	@NotBlank(message="Il campo non può essere vuoto")
	private String budget;

	@Column(name = "BudgetSpeso")
	@NotBlank(message="Il campo non può essere vuoto")
	private String budgetSpeso;

	// Get e Set
	public int getIdsottocategoria() {
		return idsottocategoria;
	}
	public void setIdsottocategoria(int idsottocategoria) {
		this.idsottocategoria = idsottocategoria;
	}
	public Area getOarea() {
		return oarea;
	}
	public void setOarea(Area oarea) {
		this.oarea = oarea;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getSottoCategoria() {
		return this.sottoCategoria;
	}
	public void setSottoCategoria(String sottoCategoria) {
		this.sottoCategoria = sottoCategoria;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getBudgetSpeso() {
		return budgetSpeso;
	}
	public void setBudgetSpeso(String budgetSpeso) {
		this.budgetSpeso = budgetSpeso;
	}

	// Costruttori
	public SottoCategoria() {
		this.inizializza();
	}
	
	private void inizializza() {
		this.idsottocategoria = 0;
		this.oarea = null;
		this.codice = null;
		this.sottoCategoria = null;
		this.budget = null;
		this.budgetSpeso = null;
	}
}