package com.fmi.library.book.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.fmi.library.ui.BookCreationForm;
import com.fmi.library.ui.HomeScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookCreationTestSteps {
	private HomeScreen homeScreen;
	private BookCreationForm creationForm;
	
	@Given("^Потребителя се намира на началната страница$")
	public void потребителя_се_намира_на_началната_страница() throws Throwable {
		homeScreen= new HomeScreen();
	}

	@Given("^Натиска навигационния бутон за създаване на книга$")
	public void натиска_навигационния_бутон_за_създаване_на_книга() throws Throwable {
		creationForm =homeScreen.openBookCreationForm();
	}

	@Given("^Отваря се формата за създаване на книга$")
	public void отваря_се_формата_за_създаване_на_книга() throws Throwable {
		assertNotNull(creationForm);
	}

	@When("^Натискане на бутона за създаване на книга$")
	public void натискане_на_бутона_за_създаване_на_книга() throws Throwable {
		creationForm.create();
	}

	@Then("^Изскача съобщение \"([^\"]*)\"$")
	public void изскача_съобщение(String message) throws Throwable {
	    assertEquals(message, creationForm.getMessage());
	}

	@When("^Въвеждане на полето title : \"([^\"]*)\"$")
	public void въвеждане_на_полето_title(String title) throws Throwable {
		creationForm.setTitle(title);
	}

	@When("^Въвеждане на полето isbn : \"([^\"]*)\"$")
	public void въвеждане_на_полето_isbn(String isbn) throws Throwable {
		creationForm.setIsbn(isbn);
	}
}
