package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "AreaGeo")
public class AreaGeo {
 // Costanti
 public static final String PROPERTY_idArea = "idareageo";
 public static final String PROPERTY_codice = "codice";
 public static final String PROPERTY_area = "area";
 // Attributi
 
 @Column(name = "id")
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idareageo;
 
//@ManyToOne
// @JoinColumn(name = "idvenditore")
// @NotNull(message="il campo non può essere nullo")
// private Venditore ovenditore;
 
 @Column(name = "Codice")
 @NotBlank(message="Il campo non può essere vuoto")
 private String codice;
 
 @Column(name = "AreaGeo")
 @NotBlank(message="Il campo non può essere vuoto")
 private String areaGeo;

 public String getAreaGeo() {
  return areaGeo;
 }
 public void setAreaGeo(String areaGeo) {
  this.areaGeo = areaGeo;
 }
 public int getIdareageo() {
  return idareageo;
 }
 public void setIdareageo(int idareageo) {
  this.idareageo = idareageo;
 }
 public String getCodice() {
  return codice;
 }
 public void setCodice(String codice) {
  this.codice = codice;
 }

 // Costruttori
 public AreaGeo() {
  this.inizializza();
 }

 private void inizializza() {
  this.idareageo = 0;
  this.codice = null;
  this.areaGeo = null;
//  this.setOvenditore(null);
 }
}