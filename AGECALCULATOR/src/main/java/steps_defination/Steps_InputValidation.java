package steps_defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_InputValidation {


	@When("user leaves username field empty")
	public void user_leaves_username_field_empty() {

		WebElement entername = Steps_background.driver.findElement(By.id("inputName"));
		entername.click();
		entername.clear();
		entername.sendKeys(" ");

	}

	@When("user leaves date of birth fiels empty")
	public void user_leaves_date_of_birth_fiels_empty() {

		WebElement enterbirthday = Steps_background.driver.findElement(By.id("inputBirthday"));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(" ");
	}

	@When("the user enters an invalid date format {string} in the birthdate field")
	public void the_user_enters_an_invalid_date_format_in_the_birthdate_field(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement((By.id("inputBirthday")));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}

	@When("user select future birthdate {string} in date of birth textbox")
	public void user_select_future_birthdate_in_date_of_birth_textbox(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement((By.id("inputBirthday")));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}
	
	@When("user enters a username with a very long string {string}")
	public void user_enters_a_username_with_a_very_long_string(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement((By.id("inputName")));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}

	@Then("Verify that {string} error message should be displayed")
	public void verify_that_error_message_should_be_displayed1(String string) {
		WebElement errorMessage = Steps_background.driver.findElement(By.id("help_birthday"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}

	@Then("verify that {string} error message should be displayed")
	public void verify_that_error_message_should_be_displayed(String string) {
		WebElement errorMessage = Steps_background.driver.findElement(By.id("help_birthday"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}
	
/*	 @Then("Verify that {string} text should be displayed")
	public void verify_that_text_should_be_displayed(String string) {
		WebElement errorMessage = Steps_background.driver.findElement(By.id("help_birthday"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}  */
}
