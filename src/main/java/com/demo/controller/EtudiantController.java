package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.IEtudiantService;
import com.demo.model.Etudiant;






@RestController
//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class EtudiantController {
	
	@Autowired
	private IEtudiantService iEtudiantService;
	
	@GetMapping(path = "/etudiant")
	public Page<Etudiant> getPaginated(@RequestParam(name="page")int page,
			@RequestParam(name="size")int size){
		return this.iEtudiantService.findPaginated(page, size);
	}
	
	
	/*
	 * @GetMapping("/list") public Page<Etudiant>
	 * afficherPage(@RequestParam(defaultValue = "0") int page){ return
	 * etudiantRepository.findAll(new QPageRequest(page, 4)); }
	 */
		
	

}
