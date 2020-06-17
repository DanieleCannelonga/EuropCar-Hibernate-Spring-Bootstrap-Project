package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "AliquotaIva")
public class AliquotaIva {
 // Costanti
 public static final String PROPERTY_idArea = "idaliquotaIva";
 public static final String PROPERTY_codice = "codice";
 public static final String PROPERTY_aliquotaIva = "aliquotaIva";
 // Attributi
 
 @Column(name = "id")
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idaliquotaIva;
 
//@ManyToOne
// @NotNull(message="il campo non può essere nullo")
 
 @Column(name = "Codice")
 @NotBlank(message="Il campo non può essere vuoto")
 private String codice;
 
 @Column(name = "AliquotaIva")
 @NotBlank(message="Il campo non può essere vuoto")
 private Integer aliquotaIva;

 // Get e Set
 // public Venditore getOvenditore() {
 //  return ovenditore;
 // }
 // public void setOvenditore(Venditore ovenditore) {
 //  this.ovenditore = ovenditore;
 // }
 public String getCodice() {
  return codice;
 }
 public int getIdaliquotaIva() {
	return idaliquotaIva;
 }
 public void setIdaliquotaIva(int idaliquotaIva) {
	this.idaliquotaIva = idaliquotaIva;
 }
 public Integer getAliquotaIva() {
	return aliquotaIva;
 }
 public void setAliquotaIva(Integer aliquotaIva) {
	this.aliquotaIva = aliquotaIva;
 }
 public void setCodice(String codice) {
	this.codice = codice;
 }

 // Costruttori
 public AliquotaIva() {
  this.inizializza();
 }

 private void inizializza() {
  this.idaliquotaIva = 0;
  this.codice = null;
  this.aliquotaIva = null;
//  this.setOvenditore(null);
 }
}