package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class SeConnecterFixture {

	@Steps
	UserSteps user;
	
	@Soit("^un utilisateur non connecté sur la page d'accueil$")
	public void un_utilisateur_non_connecté_sur_la_page_d_accueil() throws Exception {
	    user.is_on_homepage();
	}
	
	@Quand("^l'utilisateur veut se connecter$")
	public void l_utilisateur_veut_se_connecter() throws Exception {
	    user.sign_in();
	}

	@Quand("^il saisit son identifiant \"([^\"]*)\"$")
	public void il_saisit_son_identifiant(String identifiant) throws Exception {
		user.type_username(identifiant);
	}

	@Quand("^il saisit le mot de passe \"([^\"]*)\"$")
	public void il_saisit_le_mot_de_passe(String password) throws Exception {
	    user.type_password(password);
	}

	@Alors("^il est connecté à son compte$")
	public void il_est_connecté_à_son_compte() throws Exception {
		user.validate_sign_in();
		user.check_signed_in_user();
	}

	@Alors("^il échoue à se connecter$")
	public void il_échoue_à_se_connecter() throws Exception {
	   user.has_incorrect_password();
	}
}
