package steps_defination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_calculateage {

	@When("user select the {string} in date of birth textbox")
	public void user_select_the_in_date_of_birth_textbox(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement((By.id("inputBirthday")));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}

	@Given("user select today's birthdate {string} in date of birth textbox")
	public void user_select_today_s_birthdate_in_date_of_birth_textbox(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement((By.id("inputBirthday")));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}

	@Then("Verify that {string} text should be displayed")
	public void verify_that_text_should_be_displayed(String string) {
		String actualString = Steps_background.driver.findElement(By.id("resultDiv")).getText();
		Assert.assertFalse(string.contains(actualString));
	}

	@Then("Verify that {string} error text should be displayed")
	public void verify_that_error_text_should_be_displayed(String string) {
		WebElement errorMessage = Steps_background.driver.findElement(By.id("help_birthday"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}

	@After
	public void user_close_browser() {
		Steps_background.driver.quit();
	}

}
