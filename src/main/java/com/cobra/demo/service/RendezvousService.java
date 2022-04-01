package com.cobra.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobra.demo.Repository.Rendezvousrepository;
import com.cobra.demo.model.Rendezvous;



@Service
public class RendezvousService {
	
	@Autowired
	private Rendezvousrepository rendezvousRepository;
	
	//Create operation
	public Rendezvous createrdv(String id, Date daterdv, String nomMedecin, String nomPatient) {
		 
		return rendezvousRepository.save(new Rendezvous (id, daterdv,  nomMedecin,nomPatient));
	}
	
	public List<Rendezvous> getAll(){
		return rendezvousRepository.findAll();
	}
	public Rendezvous getByNomPatient(String nomPatient) {
		return rendezvousRepository.findByNomPatient(nomPatient);
	}
	//Update operation
	public Rendezvous update(Date daterdv, String nomMedecin, String nomPatient) {
		Rendezvous r = rendezvousRepository.findByNomPatient(nomPatient);
		r.setDaterdv(daterdv);
		r.setNomMedecin(nomMedecin);
	
		
		return rendezvousRepository.save(r);
	}
	//Delete operation
	public void deleteAll() {
		rendezvousRepository.deleteAll();
	}
	public void delete(String id) {
		Rendezvous r = rendezvousRepository.findById(id).get();
		rendezvousRepository.delete(r);
	}
	
	public Rendezvous get(String id) {
		return rendezvousRepository.findById(id).get();
	}
}