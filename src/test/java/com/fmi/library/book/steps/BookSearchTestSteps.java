package com.fmi.library.book.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.fmi.library.ui.BookSearchForm;
import com.fmi.library.ui.HomeScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookSearchTestSteps {

	private HomeScreen homeScreen;
	private BookSearchForm bookSearchForm;

	@Given("^Потребителя се намира в началния екран$")
	public void потребителя_се_намира_в_началния_екран() throws Throwable {
		homeScreen = new HomeScreen();
	}

	@Given("^Натиска навигационния бутон за търсене на книга$")
	public void натиска_навигационния_бутон_за_търсене_на_книга() throws Throwable {
		bookSearchForm = homeScreen.openBookSearch();
	}

	@Given("^Отваря се страницата за търсене на книга$")
	public void отваря_се_страницата_за_търсене_на_книга() throws Throwable {
		assertNotNull(bookSearchForm);
	}

	@When("^Натискане на бутона за търсене$")
	public void натискане_на_бутона_за_търсене() throws Throwable {
		bookSearchForm.search();
	}

	@Then("^Връща се съобщение \"([^\"]*)\"$")
	public void връща_се_съобщение(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, bookSearchForm.getMessage());
	}

	@When("^Въвеждане на isbn : \"([^\"]*)\"$")
	public void въвеждане_на_isbn(String isbn) throws Throwable {
		bookSearchForm.setIsbn(isbn);
	}

	@When("^Въвеждане на title : \"([^\"]*)\"$")
	public void въвеждане_на_title(String title) throws Throwable {
		bookSearchForm.setTitle(title);
	}

	@Then("^Връщаме резултат по критерия$")
	public void връщаме_резултат_по_критерия() throws Throwable {
		assertNotNull(bookSearchForm.getSearchResult());
	}
	
	@Then("^Връщаме празен резултат$")
	public void връщаме_празен_резултат() throws Throwable {
		assertNull(bookSearchForm.getSearchResult());
	}

}
