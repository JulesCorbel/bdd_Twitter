package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class EditerProfilFixture {
	
	@Steps
	UserSteps user;
	
	@Quand("^il veut éditer son profil$")
	public void il_veut_éditer_son_profil() throws Exception {
	    user.edit_profile();
	}

	@Quand("^il choisit comme nouveau nom d'utilisateur \"([^\"]*)\"$")
	public void il_choisit_comme_nouveau_nom_d_utilisateur(String username) throws Exception {
	    user.choose_username(username);
	    user.validate_changes();
	}

	@Alors("^son nom d'utilisateur est changé$")
	public void son_nom_d_utilisateur_est_changé() throws Exception {
	    user.check_username();
	}

	@Quand("^il écrit \"([^\"]*)\"$")
	public void il_ecrit(String biography) throws Exception {
	    user.update_biography(biography);
	    user.validate_changes();
	}

	@Alors("^sa biographie est changée$")
	public void sa_biographie_est_changée() throws Exception {
	    user.check_biography();
	}

}
