package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class GererLesMessagesFixture {
	
	@Steps
	UserSteps user;
	
	@Quand("^il va consulter ses messages$")
	public void il_va_consulter_ses_messages() throws Exception {
	    user.open_messages();
	}

	@Alors("^il n'a actuellement aucun message$")
	public void il_n_a_actuellement_aucun_message() throws Exception {
	    user.has_no_message();
	}

	@Soit("^un utilisateur dans ses messages$")
	public void un_utilisateur_dans_ses_messages() throws Exception {
		user.is_on_homepage();
		user.sign_in("testetmaintenance@gmail.com", "3qPeWm2289xuJ5B");
		user.open_messages();
	}

	@Quand("^il souhaite commencer une nouvelle conversation$")
	public void il_souhaite_commencer_une_nouvelle_conversation() throws Exception {
	    user.start_conversation();
	}
	
	@Quand("^il veut parler à l'utilisateur \"([^\"]*)\"$")
	public void il_veut_parler_a_l_utilisateur(String username) throws Exception {
	    user.select_user(username);
	}

	@Quand("^il envoie \"([^\"]*)\"$")
	public void il_envoie(String message) throws Exception {
	    user.type_message(message);
	    user.send_message();
	}

	@Alors("^son message est envoyé à l'utilisateur")
	public void son_message_est_envoyé_à_l_utilisateur(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    user.check_message_sent();
	}
}
