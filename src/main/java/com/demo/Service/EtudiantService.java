package com.demo.Service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.model.Etudiant;
import com.demo.repository.EtudiantRepository;



@Service
public class EtudiantService implements IEtudiantService {
	
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public Page<Etudiant> findPaginated(int page, int size) {
		Pageable pag=PageRequest.of(page, size) ;
		Page<Etudiant> pageResultat = etudiantRepository.findAll(pag);
		return (Page<Etudiant>) pageResultat.toList();
	}
	
}
