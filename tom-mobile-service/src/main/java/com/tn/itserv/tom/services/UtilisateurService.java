package com.tn.itserv.tom.services;

import com.tn.itserv.tom.entities.Utilisateur;

public interface UtilisateurService {
	
	public Utilisateur getUserByLogin(String login) ;
}
