package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class ConsulterEmploisTwitterFixture {

	@Steps
	UserSteps user;
	
	@Quand("^il veut consulter les offres d'emploi proposées par Twitter$")
	public void il_veut_consulter_les_offres_d_emploi_proposées_par_Twitter() throws Exception {
	    user.go_on_Twitter_careers();
	}

	@Quand("^il rentre le mot-clé \"([^\"]*)\"$")
	public void il_rentre_le_mot_clé(String keyword) throws Exception {
	    user.type_keyword(keyword);
	}

	@Alors("^il obtient (\\d+) résultats pour sa recherche$")
	public void il_obtient_résultats_pour_sa_recherche(int arg1) throws Exception {
		user.start_research();
	    user.check_number_of_results();
	}

	@Soit("^un utilisateur sur le site de recrutement de Twitter$")
	public void un_utilisateur_sur_le_site_de_recrutement_de_Twitter() throws Exception {
		user.is_on_homepage();
		user.sign_in("testetmaintenance@gmail.com", "3qPeWm2289xuJ5B");
		user.go_on_Twitter_careers();
	}

	@Quand("^il choisit l'équipe \"([^\"]*)\"$")
	public void il_choisit_l_équipe(String team) throws Exception {
	    user.choose_team(team);
	}

	@Alors("^sa recherche ne donne aucun résultat$")
	public void sa_recherche_ne_donne_aucun_résultat() throws Exception {
		user.start_research();
	    user.no_results_found();
	}
}
