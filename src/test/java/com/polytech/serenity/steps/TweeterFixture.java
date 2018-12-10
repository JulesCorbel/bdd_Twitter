package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class TweeterFixture {
	@Steps
	UserSteps user;
	
	@Quand("^il souhaite envoyer un tweet$")
	public void il_souhaite_envoyer_un_tweet() throws Exception {
	    user.send_tweet();
	}

	@Quand("^il saisit le message \"([^\"]*)\"$")
	public void il_saisit_le_message(String message) throws Exception {
	    user.type_tweet(message);
	}

	@Alors("^son tweet est envoyé$")
	public void son_tweet_est_envoyé() throws Exception {
	    user.check_tweet_sent();
	}

	@Quand("^il choisit le Tweet le plus récent$")
	public void il_choisit_le_Tweet_le_plus_recent() throws Exception {
	    user.select_most_recent_tweet();
	}

	@Quand("^il veut le supprimer$")
	public void il_veut_le_supprimer() throws Exception {
	    user.delete_tweet();
	    user.confirm_deletion();
	}

	@Alors("^le Tweet est supprimé$")
	public void le_Tweet_est_supprimé() throws Exception {
	    user.check_deleted_tweet();
	}
}
