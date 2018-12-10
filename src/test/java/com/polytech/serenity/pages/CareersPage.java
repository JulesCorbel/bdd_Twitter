package com.polytech.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://careers.twitter.com/")
public class CareersPage extends PageObject{

	public void type_keyword(String keyword) {
		WebElementFacade keywordField = find(By.className("sticky-search"));
		keywordField.type(keyword);
	}

	public void search() {
		WebElementFacade searchButton = find(By.xpath("//*[@id='stickySearchForm']/div[4]/button"));
		searchButton.click();
	}

	public String get_number_of_results() {
		WebElementFacade numberOfResults = find(By.className("job-search-total")).then();
		return numberOfResults.getText();
	}
	
	public void open_teams_button() {
		WebElementFacade teamsButton = find(By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div/div[1]/form/div[2]/div/div"));
		teamsButton.click();
	}

	public void chooseTeam(String team) {
		WebElementFacade teamRadioButton = find(By.xpath("//li[@data-val='careers-twitter:team/"+ team +"']"));
		teamRadioButton.click();
	}

	public boolean no_results_found() {
		WebElementFacade noResultsFoundBlock = find(By.className("copy-container-inner job-search-no-results-text"));
		return noResultsFoundBlock != null;
	}

	

}
