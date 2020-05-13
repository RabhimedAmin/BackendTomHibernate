package com.tn.itserv.tom.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tn.itserv.tom.entities.Utilisateur;
import com.tn.itserv.tom.reposiotry.UtilisateurRepository;
import com.tn.itserv.tom.services.UtilisateurService;
@Service
public class UtilisateurServiceImpl  implements UtilisateurService{
	@Autowired
	UtilisateurRepository ur;
	public Utilisateur getUserByLogin(String login) {
		
		for(Utilisateur u :ur.findAll()) {
			if (u.getLogin().equals(login))
		return u;
		}
		return null;
	}

}
