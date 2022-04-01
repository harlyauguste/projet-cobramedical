package com.cobra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobra.demo.Repository.PatientRepository;
import com.cobra.demo.model.Patient;


@Service
public class patientService {
	@Autowired
	private PatientRepository patientRepository;
	
	//Create operation
	public Patient create(String id, String name,String sexe, String ville, String job, int age) {
		 
		return patientRepository.save(new Patient (id, name, sexe, ville,job,age));
	}
	//public Rendezvous createrdv(String id, Date daterdv, String nomMedecin, String nomPatient) {
		 
		//return rendezvousRepository.save(new Rendezvous (id, daterdv,  nomMedecin,nomPatient));
	//}
	//Retrieve operation
	public List<Patient> getAll(){
		return patientRepository.findAll();
	}
	public Patient getByName(String name) {
		return patientRepository.findByName(name);
	}
	
	//Update operation
	public Patient update(String name,String sexe, String ville, String job, int age) {
		Patient p = patientRepository.findByName(name);
		p.setSexe(sexe);
		p.setVille(ville);
		p.setJob(job);
		p.setAge(age);
		return patientRepository.save(p);
	}
	//Delete operation
	public void deleteAll() {
		patientRepository.deleteAll();
	}
	public void delete(String id) {
		Patient p = patientRepository.findById(id).get();
		patientRepository.delete(p);
	}
	
	public Patient get(String id) {
		return patientRepository.findById(id).get();
	}
	
}
