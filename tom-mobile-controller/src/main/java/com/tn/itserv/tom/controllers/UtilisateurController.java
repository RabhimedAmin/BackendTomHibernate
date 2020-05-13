package com.tn.itserv.tom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tn.itserv.tom.entities.Utilisateur;
import com.tn.itserv.tom.services.UtilisateurService;

@RestController
@RequestMapping("/auth")
public class UtilisateurController {
	@Autowired
	UtilisateurService us ;
	
@GetMapping(value="/{login}", produces = "application/json")
    public Utilisateur getBook(@PathVariable String login) {
        return us.getUserByLogin(login);
  }

}
