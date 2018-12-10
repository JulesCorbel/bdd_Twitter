package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class GererSesTendancesFixture {
	
	@Steps
	UserSteps user;
	
	@Quand("^il veut consulter les actualités sur la tendance \"([^\"]*)\"$")
	public void il_veut_consulter_les_actualités_sur_la_tendance(String trend) throws Exception {
	    user.see_trend(trend);
	}

	@Alors("^il arrive sur la page correspondant à cette tendance$")
	public void il_arrive_sur_la_page_correspondant_à_cette_tendance() throws Exception {
	    user.check_trend_page();
	}

	@Quand("^il veut personnaliser ses tendances$")
	public void il_veut_personnaliser_ses_tendances() throws Exception {
	    user.customize_trends();
	}

	@Quand("^il rentre la localisation \"([^\"]*)\"$")
	public void il_rentre_la_localisation(String location) throws Exception {
	    user.choose_location(location);
	}

	@Alors("^Twitter lui propose les tendances correspondantes à cette localisation$")
	public void twitter_lui_propose_les_tendances_correspondantes_à_cette_localisation() throws Exception {
	    user.has_customized_trends();
	}
}
