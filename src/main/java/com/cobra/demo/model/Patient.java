package com.cobra.demo.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient")
public class Patient implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 4858964922277461999L;
	/**
	 * 
	 */
	
	@Id
	    private String id;
	    private String name;
	    private String sexe;
	    private String ville ;
	    private String job;
	    private int age;
	    
		public Patient(String id, String name, String sexe, String ville, String job,int age) {
			
			this.id=id;
			this.name=name;
			this.sexe=sexe;
			this.ville=ville;
			this.job=job;
			this.age=age;
		}
		
		
		
		public Patient(String name, String sexe, String ville, String job, int age) {
			super();
			this.name = name;
			this.sexe = sexe;
			this.ville = ville;
			this.job = job;
			this.age = age;
		}



		public Patient() {
			super();
			
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}



		
		}

