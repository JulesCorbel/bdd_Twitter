package com.polytech.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://twitter.com/settings/account")
public class ParametersPage extends PageObject{

	private String language;
	private WebElementFacade checkboxPersonalInformation;

	public void selectLanguage(String language) {
		this.language = language;
		WebElementFacade languageOption = find(By.xpath("//option[@value=" + language + "]"));
		languageOption.click();
	}

	public void validate_changes() {
		WebElementFacade saveButton = find(By.id("settings_save"));
		saveButton.click();
	}

	public void check_password(String password) {
		WebElementFacade passwordField = find(By.id("auth_password"));
		passwordField.type(password);
	}

	public boolean get_language_selected() {
		return find(By.xpath("//option[@selected='true']")).getValue().equals(language);
	}

	public void select_personal_information() {
		checkboxPersonalInformation = find(By.id("user_no_username_only_password_reset"));
		checkboxPersonalInformation.click();
	}

	public boolean check_personal_information_checked() {
		return false;
		
	}

}
