package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class ActionAutreProfilFixture {

	@Steps
	UserSteps user;
	
	@Quand("^il souhaite aller sur la page Twitter de \"([^\"]*)\"$")
	public void il_souhaite_aller_sur_la_page_Twitter_de(String anotherUser) throws Exception {
	    user.go_on_user_page(anotherUser);
	}

	@Quand("^il veut s'abonner à cet utilisateur$")
	public void il_veut_s_abonner_à_cet_utilisateur() throws Exception {
	    user.follow_profile();
	}

	@Alors("^il y est maintenant abonné$")
	public void il_y_est_maintenant_abonné() throws Exception {
	    user.is_profile_followed();
	}

	@Quand("^il souhaite masquer le profil de cet utilisateur$")
	public void il_souhaite_masquer_le_profil_de_cet_utilisateur() throws Exception {
	    user.mute_profile();
	}

	@Alors("^il ne recevra plus de notifications de la part de cet utilisateur$")
	public void il_ne_recevra_plus_de_notifications_de_la_part_de_cet_utilisateur() throws Exception {
	    user.is_profile_muted();
	}
}
