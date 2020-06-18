package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Progetto")
public class Progetto {
 // Costanti
 public static final String PROPERTY_idProgetto = "idprogetto";
 public static final String PROPERTY_codice = "codice";
 // Attributi
 
 @Column(name = "id")
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idprogetto;
 
 @Column(name = "Codice")
 @NotBlank(message="Il campo non può essere vuoto")
 private String codice;

 public int getIdprogetto() {
  return idprogetto;
 }
 public void setIdprogetto(int idprogetto) {
  this.idprogetto = idprogetto;
 }
 public String getCodice() {
  return codice;
 }
 public void setCodice(String codice) {
  this.codice = codice;
 }

 // Costruttori
 public Progetto() {
  this.inizializza();
 }

 private void inizializza() {
  this.idprogetto = 0;
  this.codice = null;
 }
}