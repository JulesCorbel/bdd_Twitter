package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class RechercheUtilisateurFixture {

	@Steps
	UserSteps user;
	
	@Quand("^il recherche \"([^\"]*)\"$")
	public void il_recherche(String username) throws Exception {
	    user.search(username);
	}

	@Quand("^il choisit l'utilisateur \"([^\"]*)\"$")
	public void il_choisit_l_utilisateur(String anotherUser) throws Exception {
	    user.pick(anotherUser);
	}

	@Alors("^il arrive sur le profil de cet utilisateur$")
	public void il_arrive_sur_le_profil_de_cet_utilisateur() throws Exception {
	    user.check_page();
	}

	@Alors("^il n'obtient aucun résultat$")
	public void il_n_obtient_aucun_résultat() throws Exception {
	    user.has_no_result();
	}

}
