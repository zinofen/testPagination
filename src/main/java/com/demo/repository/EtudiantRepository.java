package com.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Etudiant;



public interface EtudiantRepository extends PagingAndSortingRepository<Etudiant,Long>{
	

	
}
