package com.cobra.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cobra.demo.model.Patient;
import com.cobra.demo.model.Rendezvous;
import com.cobra.demo.service.RendezvousService;
import com.cobra.demo.service.patientService;


@Controller
@RequestMapping
public class PageController {
	
	@Autowired
	private patientService pService;
	
	@Autowired
	private RendezvousService rendezvousService;
	
	@RequestMapping("/")
	public String Home(Model m) {
		
		Patient patient = new Patient();
		
		m.addAttribute("patient", patient);
		
		return "/Pages/Accueil";
	
		
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)


	public String create(@RequestParam String id, @RequestParam String name,@RequestParam String sexe,@RequestParam String ville,@RequestParam String job, @RequestParam int age ) {
		
		Patient p = pService.create( id, name, sexe,ville,job,age );
		return "redirect:/";	
		
	}
	
	@RequestMapping("/get")
	public String getPatient(Model m, @RequestParam String id) {
		
		Patient p= pService.get(id);
		m.addAttribute("patient", p);
		return "pages/nouveauPatient";
		
	}

	
	@RequestMapping(value = "/getAllPatients" )
	
	public String getAll(Model m) {
		List<Patient> listPatients = pService.getAll();
		m.addAttribute("listPatients", listPatients);
		return "Pages/ListePatients";
		}
	
	@RequestMapping(value="/Patient")
    public String Patient(Model m) {
	
	Patient patient = new Patient();
	m.addAttribute("Patient", patient);
	return "Pages/gestionpatient";
	// on accède à l'interface du patient
	}
	
	@RequestMapping(value = "/Patient/updatePatient" )
	public String update(Model m) {
		Patient patient = new Patient();
		m.addAttribute("patient", patient);
		return "Pages/updatePatients";
		}
	
	@RequestMapping(value = "/Patient/nouveauPatient" )
	public String nouveauPatient(Model m) {
		Patient patient = new Patient();
		m.addAttribute("patient", patient);
		return "Pages/FormulairePatient";
		// Ici le patient s'enregistre
	}
	
	@RequestMapping(value = "/Patient/nouveauRendezvous" )
	public String nouveauRendezvous(Model m) {
		Rendezvous rendezvous = new Rendezvous();
		m.addAttribute("rendezvous", rendezvous);
		
		return "Pages/FormRendezvous";
	}
	@RequestMapping(value = "/createrdv", method = RequestMethod.POST)


	public String createrdv(@RequestParam String id, @RequestParam Date dateRdvz,@RequestParam String nomMedecin,@RequestParam String nomPatient) {
		
		Rendezvous r = rendezvousService.createrdv( id, dateRdvz,  nomMedecin,nomPatient );
		return "redirect:/";	
		
	}
	
	
	@RequestMapping(value = "/Patient/updateRendezvous" )
	public String update2(Model m) {
		Rendezvous rendezvous = new Rendezvous();
		m.addAttribute("rendezvous", rendezvous);
		return "Pages/updateRendezvous";
		}

	
@RequestMapping(value = "/getAllRendezvous" )
	
	public String getAll2(Model m) {
		List<Rendezvous> listRendezvous = rendezvousService.getAll();
		m.addAttribute("listRendezvous", listRendezvous);
		return "pages/listeRendezvous";
		}

@RequestMapping(value = "/getRendezvous", method = RequestMethod.POST)
public String getRendezvous(Model m, @RequestParam String id) {
	
	Rendezvous r= rendezvousService.get(id);
	//Person p = new Person();
	m.addAttribute("rendezvous",r );
	return "Pages/updateRendezvous";
	
}

}
