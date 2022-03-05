package com.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.demo.model.Etudiant;


@Service
public interface IEtudiantService {
	Page<Etudiant> findPaginated(int pageNo,int pageSize);
}
