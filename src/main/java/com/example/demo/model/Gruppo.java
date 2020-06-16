package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Gruppo")
public class Gruppo {
 // Costanti
 public static final String PROPERTY_idGruppo = "idgruppo";
 public static final String PROPERTY_codice = "codice";
 public static final String PROPERTY_nome = "nome";
 // Attributi
 
 @Column(name = "id")
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idgruppo;
 
//@ManyToOne
// @NotNull(message="il campo non può essere nullo")
// private Venditore ovenditore;
 
 @Column(name = "Codice")
 @NotBlank(message="Il campo non può essere vuoto")
 private String codice;
 
 @Column(name = "Nome")
 @NotBlank(message="Il campo non può essere vuoto")
 private String nome;

 // Get e Set
// public Venditore getOvenditore() {
//  return ovenditore;
// }
 public String getNome() {
  return nome;
 }
 public void setNome(String nome) {
  this.nome = nome;
 }
 public int getIdgruppo() {
  return idgruppo;
 }
 public void setIdgruppo(int idgruppo) {
  this.idgruppo = idgruppo;
 }
// public void setOvenditore(Venditore ovenditore) {
//  this.ovenditore = ovenditore;
// }
 public String getCodice() {
  return codice;
 }
 public void setCodice(String codice) {
  this.codice = codice;
 }

 // Costruttori
 public Gruppo() {
  this.inizializza();
 }

 private void inizializza() {
  this.idgruppo = 0;
  this.codice = null;
  this.nome = "";
//  this.setOvenditore(null);
 }
}