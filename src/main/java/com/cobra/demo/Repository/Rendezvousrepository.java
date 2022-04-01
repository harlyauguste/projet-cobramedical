package com.cobra.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cobra.demo.model.Rendezvous;


@Repository
public interface Rendezvousrepository extends MongoRepository<Rendezvous, String> {
	public Rendezvous findByNomPatient(String nomPatient);
	




}