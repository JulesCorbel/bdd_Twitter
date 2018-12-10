package com.polytech.serenity.steps.serenity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.polytech.serenity.pages.CareersPage;
import com.polytech.serenity.pages.HomePage;
import com.polytech.serenity.pages.ParametersPage;
import com.polytech.serenity.pages.ProfilePage;

import net.thucydides.core.annotations.Step;

public class UserSteps {

	HomePage homePage;
	ProfilePage profilePage;
	ParametersPage parametersPage;
	private CareersPage careersPage;
	
	private String username;
	private String password;
	private String newUsername;
	private String message;
	private String trend;
	private String location;
	private String anotherUser;
	private String biography;
	
	@Step
    public void is_on_homepage() {
        homePage.open();
    }

	@Step
	public void is_on_profile_page() {
		profilePage.open();
	}
	
	@Step
	public void edit_profile() {
		profilePage.edit();
	}

	@Step
	public void change_profile_color() {
		edit_profile();
		profilePage.change_profile_color();
	}

	@Step
	public void choose_color(String color) {
		profilePage.choose_color(color);
		validate_changes();
	}

	@Step
	public void validate_changes() {
		profilePage.validate_changes();
	}

	@Step
	public void check_profile_color_changed() {
		assertTrue(profilePage.is_color_changed());
	}

	@Step
	public void activate_nightmode() {
		homePage.activate_nightmode();
	}

	@Step
	public void toggle_menu() {
		homePage.toggle_menu();
	}

	@Step
	public void check_nightmode_activated() {
		assertTrue(homePage.is_nightmode_activated());
	}
	
	@Step
	public void sign_in(String username, String password){
		this.username = username;
		this.password = password;
		
		sign_in();
		type_username();
		type_password();
		validate_sign_in();
	}
	
	@Step
	public void sign_in() {
		homePage.sign_in();
	}
	
	@Step
	public void type_username() {
		homePage.type_username(username);
	}
	
	@Step
	public void type_password() {
		homePage.type_password(password);
	}
	
	@Step
	public void validate_sign_in() {
		homePage.validate_sign_in();
	}

	@Step
	public void go_on_parameters_page() {
		parametersPage.open();
	}

	@Step
	public void choose_language(String language) {
		parametersPage.selectLanguage(language);
	}

	@Step
	public void validate_modifications() {
		parametersPage.validate_changes();
		check_password();
	}

	@Step
	private void check_password() {
		parametersPage.check_password(password);
	}

	@Step
	public void check_language() {
		assertTrue(parametersPage.get_language_selected());
	}

	@Step
	public void select_personal_informations() {
		parametersPage.select_personal_information();
	}

	@Step
	public void check_personal_information_checked() {
		assertTrue(parametersPage.check_personal_information_checked());
	}

	@Step
	public void choose_username(String newUsername) {
		this.newUsername = newUsername;
		profilePage.changeUsername(newUsername);
	}

	@Step
	public void check_username() {
		assertEquals(profilePage.getUsername(), newUsername);
	}

	@Step
	public void update_biography(String biography) {
		this.biography = biography;
		profilePage.update_biography(biography);
	}

	@Step
	public void check_biography() {
		assertEquals(profilePage.getBiography(), biography);
	}

	@Step
	public void type_username(String username) {
		homePage.type_username(username);
	}

	@Step
	public void type_password(String password) {
		homePage.type_password(password);
	}

	@Step
	public void check_signed_in_user() {
		assertTrue(homePage.check_signed_in_user());
	}

	@Step
	public void has_incorrect_password() {
		assertTrue(homePage.hasIncorrectPassword());
	}

	@Step
	public void go_on_user_page(String anotherUser) {
		homePage.open("anotheruser", new String[]{anotherUser});
	}

	@Step
	public void follow_profile() {
		homePage.follow_profile();
	}

	@Step
	public void is_profile_followed() {
		assertEquals(homePage.is_profile_followed(), "Abonné");
	}
	
	@Step
	public void mute_profile() {
		homePage.mute_profile();
	}

	@Step
	public void is_profile_muted() {
		assertTrue(homePage.is_profile_muted());
	}

	@Step
	public void open_messages() {
		homePage.openMessages();
	}

	@Step
	public void has_no_message() {
		assertTrue(homePage.has_no_message());
	}

	@Step
	public void start_conversation() {
		homePage.start_conversation();
	}

	@Step
	public void select_user(String username) {
		homePage.select_user(username);
		advance();
	}

	@Step
	private void advance() {
		homePage.advance();
	}

	@Step
	public void type_message(String message) {
		this.message = message;
		homePage.type_message(message);
	}

	@Step
	public void send_message() {
		homePage.send_message();
	}

	@Step
	public void check_message_sent() {
		assertTrue(homePage.is_message_sent(message));
	}

	@Step
	public void send_tweet() {
		homePage.tweet();
	}

	@Step
	public void type_tweet(String message) {
		homePage.type_tweet(message);
	}

	@Step
	public void check_tweet_sent() {
		assertTrue(homePage.tweet_exists());
	}

	@Step
	public void select_most_recent_tweet() {
		homePage.select_most_recent_tweet();
	}

	@Step
	public void delete_tweet() {
		homePage.delete_tweet();
	}
	
	@Step
	public void confirm_deletion(){
		homePage.confirm_deletion();
	}

	@Step
	public void check_deleted_tweet() {
		assertTrue(homePage.is_tweet_deleted());
	}

	@Step
	public void see_trend(String trend) {
		this.trend = trend;
		homePage.open("trend", new String[]{trend});
	}

	@Step
	public void check_trend_page() {
		assertTrue(homePage.is_on_trend_page(trend));
	}

	@Step
	public void customize_trends() {
		homePage.customize_trends();
		homePage.customize();
	}

	@Step
	public void choose_location(String location) {
		this.location = location;
		homePage.choose_location(location);
		homePage.confirm_location();
	}

	@Step
	public void has_customized_trends() {
		assertEquals("Tendances : " + location, homePage.has_customized_trends());
	}

	@Step
	public void search(String username) {
		homePage.search(username);
	}

	@Step
	public void pick(String anotherUser) {
		this.anotherUser = anotherUser;
		homePage.pick(anotherUser);
	}

	@Step
	public void check_page() {
		assertEquals(homePage.getUsername(), anotherUser);
	}

	@Step
	public void has_no_result() {
		assertTrue(homePage.has_no_result());
	}

	@Step
	public void go_on_Twitter_careers() {
		careersPage.open();
	}

	public void type_keyword(String keyword) {
		careersPage.type_keyword(keyword);
	}

	public void start_research() {
		careersPage.search();
	}

	public void check_number_of_results() {
		assertEquals("Showing 33 Results", careersPage.get_number_of_results());
	}

	public void choose_team(String team) {
		careersPage.open_teams_button();
		careersPage.chooseTeam(team);
	}

	public void no_results_found() {
		assertTrue(careersPage.no_results_found());
	}
	
}