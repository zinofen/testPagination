package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.Etudiant;
import com.demo.repository.EtudiantRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	/*
	 * @Autowired//injection des dépendences avec @Autowired private
	 * EtudiantRepository etudiantRepository;
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//on insère qlqs données ici:
				
		/*
		 * etudiantRepository.save(new Etudiant(null,"zineb","rabat"));
		 * etudiantRepository.save(new Etudiant(null,"salma","casa"));
		 * etudiantRepository.save(new Etudiant(null,"oumaima","sale")); //si on veut
		 * ajouter la liste des etudiants: //pour chaque etudiant e on veut afficher ses
		 * informations
		 * 
		 * etudiantRepository.findAll().forEach(e->{
		 * System.out.println(e.getNom());//p.getNom() c'est pour afficher le nom de
		 * l'etudiant
		 * 
		 * });
		 */
		}
	
}

