package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class ChangerDesignFixture {
	
	@Steps
	UserSteps user;
	
	@Soit("^un utilisateur sur son profil$")
	public void un_utilisateur_sur_son_profil() throws Exception {
		user.is_on_homepage();
		user.sign_in("testetmaintenance@gmail.com", "3qPeWm2289xuJ5B");
		user.is_on_profile_page();
	}

	@Quand("^il souhaite changer la couleur du thème de son profil$")
	public void il_souhaite_changer_la_couleur_du_thème_de_son_profil() throws Exception {
	    user.change_profile_color();
	}

	
	@Quand("^il choisit la couleur \"([^\"]*)\"$")
	public void il_choisit_la_couleur(String color) throws Exception {
	    user.choose_color(color);
	}

	@Alors("^la couleur de son profil est changé$")
	public void la_couleur_de_son_profil_est_changé() throws Exception {
	    user.check_profile_color_changed();
	}

	@Soit("^un utilisateur sur la page d'accueil$")
	public void un_utilisateur_sur_la_page_d_accueil() throws Exception {
		user.is_on_homepage();
		user.sign_in("testetmaintenance@gmail.com", "3qPeWm2289xuJ5B");
	}

	@Quand("^il veut passer en mode nuit$")
	public void il_veut_passer_en_mode_nuit() throws Exception {
		user.toggle_menu();
	    user.activate_nightmode();
	}

	@Alors("^le mode nuit est activé sur son Twitter$")
	public void le_mode_nuit_est_activé_sur_son_Twitter() throws Exception {
	    user.check_nightmode_activated();
	}
}
