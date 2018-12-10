package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class ChangerParametresFixture {
	@Steps
	UserSteps user;
	
	@Quand("^il veut changer ses paramètres$")
	public void il_veut_changer_ses_paramètres() throws Exception {
	    user.go_on_parameters_page();
	}

	@Quand("^il choisit \"([^\"]*)\" comme langue de son Twitter$")
	public void il_choisit_comme_langue_de_son_Twitter(String language) throws Exception {
	    user.choose_language(language);
	    user.validate_modifications();
	}

	@Alors("^son Twitter passe en anglais$")
	public void son_Twitter_passe_en_anglais() throws Exception {
	    user.check_language();
	}

	@Quand("^il souhaite exiger des informations personnelles pour réinitialiser son mot de passe$")
	public void il_souhaite_exiger_des_informations_personnelles_pour_réinitialiser_son_mot_de_passe() throws Exception {
	    user.select_personal_informations();
	    user.validate_modifications();
	}

	@Alors("^cette fonctionnalité est ajoutée à son compte$")
	public void cette_fonctionnalité_est_ajoutée_à_son_compte() throws Exception {
	    user.check_personal_information_checked();
	}
}
