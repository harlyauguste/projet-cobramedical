package com.cobra.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cobra.demo.model.Patient;


@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

public Patient findByName(String name);
//public List<Patient> findByAge(int age);



}