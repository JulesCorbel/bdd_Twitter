package com.polytech.serenity.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://twitter.com/et_maintenance?lang=fr")
public class ProfilePage extends PageObject{

	private WebElementFacade colorPicker;

	public void sign_in() {
		WebElementFacade signInButton = find(By.id("signin-link"));
		signInButton.click();
	}

	public void type_username(String identifiant) {
		WebElementFacade usernameField = find(By.name("session[username_or_email]"));
		usernameField.type(identifiant);
	}

	public void type_password(String password) {
		WebElementFacade passwordField = find(By.name("session[password]"));
		passwordField.type(password);
	}

	public void validate_sign_in() {
		WebElementFacade signInButton = find(By.className("EdgeButton EdgeButton--primary EdgeButton--medium submit js-submit"));
		signInButton.click();
	}
	
	public void edit() {
		WebElementFacade editProfileButton = find(By.xpath("//button[@data-scribe-element='profile_edit_button']"));
		editProfileButton.click();
	}

	public void change_profile_color() {
		WebElementFacade changeColorButton = find(By.id("js-userColorButton"));
		changeColorButton.click();
	}

	public void choose_color(String color) {
		colorPicker = find(By.xpath("//*[@id='age-container']/div[4]/div/div/div[1]/div/div/div/div[2]/div[6]/div/fieldset/div/div[1]/div/label"));
		colorPicker.click();
	}

	public void validate_changes() {
		WebElementFacade saveButton = find(By.xpath("//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[5]/div/div/button[2]"));
		saveButton.click();
	}

	public boolean is_color_changed() {
		WebElementFacade selectedColor = find(By.className("Icon Icon--smallest Icon--check"));
		return selectedColor == colorPicker;
	}

	public void changeUsername(String newUsername) {
		WebElementFacade usernameField = find(By.id("user_name"));
		usernameField.type(newUsername);
	}

	public String getUsername() {
		WebElementFacade username = find(By.xpath("//*[@id='page-container']/div[4]/div/div/div[1]/div/div/div/div[1]/h1/a"));
		return username.getText();	
	}

	public void update_biography(String biography) {
		WebElementFacade biographyField = find(By.id("user_description"));
		biographyField.type(biography);
	}

	public String getBiography() {
		open();
		return find(By.xpath("//*[@id='page-container']/div[4]/div/div/div[1]/div/div/div/div[1]/p"))
			   .getText();	
	}
}
