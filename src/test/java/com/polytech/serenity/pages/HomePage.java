package com.polytech.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("https://twitter.com")
@NamedUrls({ @NamedUrl(name = "trend", url = "https://twitter.com/hashtag/{1}?src=trend"),
			 @NamedUrl(name = "anotheruser", url = "https://twitter.com/{1}")
})
public class HomePage extends PageObject {

	public void sign_in() {
		WebElementFacade signInButton = find(By.xpath("//*[@id='doc']/div/div[1]/div[1]/div[2]/div[2]/div/a[2]"));
		signInButton.click();
	}

	public void type_username(String identifiant) {
		WebElementFacade usernameField = find(
				By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input"));
		usernameField.type(identifiant);
	}

	public void type_password(String password) {
		WebElementFacade passwordField = find(
				By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input"));
		passwordField.type(password);
	}

	public void validate_sign_in() {
		WebElementFacade signInButton = find(By.xpath("//*[@id='page-container']/div/div[1]/form/div[2]/button"));
		signInButton.click();
	}

	public void activate_nightmode() {
		WebElementFacade nightMode = find(By.xpath("//li[@class='current-user nightmode-toggle']/a"));
		nightMode.click();
	}

	public boolean is_nightmode_activated() {
		WebElementFacade nightModeIcon = find(
				By.className("DashUserDropdown-linkIcon Icon Icon--medium js-nightmode-icon Icon--crescentFilled"));
		return nightModeIcon != null;
	}

	public void toggle_menu() {
		WebElementFacade menu = find(By.id("user-dropdown-toggle"));
		menu.click();
	}

	public boolean check_signed_in_user() {
		WebElementFacade body = find(By.xpath(
				"//body[@class='logged-in user-style-et_maintenance ms-windows enhanced-mini-profile no-nav-banners supports-drag-and-drop profile-field-editing']"));
		return body != null;
	}

	public boolean hasIncorrectPassword() {
		WebElementFacade incorrectPassword = find(By.xpath(
				"//span[@text='The username and password you entered did not match our records. Please double-check and try again.']"));
		return incorrectPassword != null;
	}

	public void openMessages() {
		WebElementFacade messagesButton = find(By.xpath("//a[@href='#']"));
		messagesButton.click();
	}

	public boolean has_no_message() {
		WebElementFacade noMessageField = find(By.xpath("//h2[@class='DMEmptyState-header']"));
		return noMessageField != null;
	}

	public void start_conversation() {
		WebElementFacade messagesButton = find(By.xpath("//button[@value='Commencez une conversation']"));
		messagesButton.click();
	}

	public void select_user(String username) {
		WebElementFacade userNameField = find(
				By.xpath("//*[@id='dm_dialog-dialog']/div[3]/div[1]/div/div[2]/div[2]/div/ul[1]/li/textarea"));
		userNameField.type(username);
	}

	public void advance() {
		WebElementFacade nextButton = find(By.xpath("//button[@value='Suivant']"));
		nextButton.click();
	}

	public void type_message(String message) {
		WebElementFacade messageField = find(By.xpath("//*[@id='tweet-box-dm-conversation']/div"));
		messageField.type(message);
	}

	public void send_message() {
		WebElementFacade sendButton = find(By
				.xpath("//*[@id='dm_dialog-dialog']/div[3]/div[2]/div/div[1]/div[2]/div[3]/div[3]/form/div[3]/button"));
		sendButton.click();
	}

	public boolean is_message_sent(String message) {
		WebElementFacade messageSent = find(By.xpath("//p[@text='" + message + "']"));
		return messageSent != null;
	}

	public void tweet() {
		WebElementFacade tweeterButton = find(By.id("global-new-tweet-button"));
		tweeterButton.click();
	}

	public void type_tweet(String message) {
		WebElementFacade tweetField = find(
				By.xpath("//*[@id='Tweetstorm-tweet-box-0']/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]"));
		tweetField.type(message);
	}

	public boolean tweet_exists() {
		WebElementFacade tweet = find(
				By.xpath("//p[@class='TweetTextSize TweetTextSize--normal js-tweet-text tweet-text'"));
		return tweet != null;
	}

	public void select_most_recent_tweet() {
		WebElementFacade mostRecentTweet = find(By.xpath("//*[@id='stream-items-id']/li/div/div[2]/div[1]/div/div/button"));
		mostRecentTweet.click();
	}

	public void delete_tweet() {
		WebElementFacade deleteTweetButton = find(By.className("js-actionDelete")).then();
		deleteTweetButton.click();
	}

	public void confirm_deletion() {
		WebElementFacade confirmButton = find(By.xpath("//*[@id='delete-tweet-dialog-dialog']/div[2]/div[4]/button[2]")).then();
		confirmButton.click();
	}

	public boolean is_tweet_deleted() {
		WebElementFacade deletedElement = find(By.xpath("//span[@text='Votre Tweet a été supprimé.']"));
		return deletedElement != null;
	}

	public boolean is_on_trend_page(String trend) {
		WebElementFacade title = find(By.xpath("//h1[@value='"+ trend + "']"));
		return title != null;
	}

	public void customize_trends() {
		WebElementFacade customizeTrendsButton = find(By.xpath("//a[@data-modal='change-trends']"));
		customizeTrendsButton.click();
	}

	public void customize() {
		WebElementFacade customizeButton = find(By.xpath("//*[@id='trends_dialog-dialog']/div[2]/div[2]/div[1]/p[2]/button[1]"));
		customizeButton.click();
	}

	public void choose_location(String location) {
		WebElementFacade locationButton = find(By.xpath("//a[@data-name='"+ location +"']"));
		locationButton.click();
	}
	
	public void confirm_location() {
		WebElementFacade confirmButton = find(By.className("EdgeButton EdgeButton--primary done"));
		confirmButton.click();
	}
	
	public String has_customized_trends() {
		WebElementFacade trendsTitle = find(By.className("trend-location js"));
		return trendsTitle.getValue();
	}

	public void follow_profile() {
		WebElementFacade followButton = find(By.xpath("//*[@id='page-container']/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[7]/div/div/span[2]/button[1]"));
		followButton.click();
	}

	public String is_profile_followed() {
		WebElementFacade followedButton = find(By.xpath("//*[@id='page-container']/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[7]/div/div/span[2]/button[2]/span[1]"));
		return followedButton.getText();
	}
	
	public void mute_profile() {
		WebElementFacade muteButton = find(By.xpath("//*[@id='page-container']/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[7]/div/div/span[1]/button[2]"));
		muteButton.click();
	}

	public boolean is_profile_muted() {
		WebElementFacade messagePopUp = find(By.id("message-drawer"));
		return messagePopUp.isVisible();
	}
	
	public String getUsername() {
		WebElementFacade username = find(By.className("ProfileHeaderCard-nameLink u-textInheritColor js-nav"));
		return username.getValue();
	}

	public void search(String username) {
		WebElementFacade searchField = find(By.id("search-query"));
		searchField.type(username);
	}

	public void pick(String anotherUser) {
		WebElementFacade user = find(By.xpath("//li[@data_user_screename='"+ anotherUser +"']"));
		user.click();
	}

	public boolean has_no_result() {
		WebElementFacade noResultsBlock = find(By.className("SearchEmptyTimeline-emptyTitle"));
		return noResultsBlock != null;
	}
}
