package com.cobra.demo.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "rendezvous")
public class Rendezvous {
@Id	
private String id;
Date dateRdvz;
String nomMedecin;
String nomPatient;

public Rendezvous() {
	super();
	
}
public Rendezvous(String id, Date dateRdvz, String nomMedecin, String nomPatient) {
	super();
	this.id = id;
	this.dateRdvz = dateRdvz;
	this.nomMedecin = nomMedecin;
	this.nomPatient = nomPatient;
}
public Rendezvous(Date daterdv, String nomMedecin, String nomPatient) {
	super();
	this.dateRdvz = daterdv;
	this.nomMedecin = nomMedecin;
	this.nomPatient = nomPatient;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Date getDateRdvz() {
	return dateRdvz;
}
public void setDaterdv(Date dateRdvz) {
	this.dateRdvz = dateRdvz;
}
public String getNomMedecin() {
	return nomMedecin;
}
public void setNomMedecin(String nomMedecin) {
	this.nomMedecin = nomMedecin;
}
public String getNomPatient() {
	return nomPatient;
}
public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
}









}
