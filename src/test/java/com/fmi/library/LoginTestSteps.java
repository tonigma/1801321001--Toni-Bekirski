package com.fmi.library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.fmi.library.ui.HomeScreen;
import com.fmi.library.ui.LoginForm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTestSteps {

		private HomeScreen homeScreen;
		private LoginForm loginForm;
		
		@Given("^Потребитяле се намира в началния екран$")
		public void потребитяле_се_намира_в_началния_екран() throws Throwable {
			homeScreen= new HomeScreen();
		}

		@Given("^Натиска бутона за вход в системата$")
		public void натиска_бутона_за_вход_в_системата() throws Throwable {
			loginForm= homeScreen.clickOnButton();
		    
		}

		@Given("^Отваря се попъп за вход в системата$")
		public void отваря_се_попъп_за_вход_в_системата() throws Throwable {
		    assertNotNull(loginForm);
		}

		@When("^Въведе  валидно потребителско име$")
		public void въведе_валидно_потребителско_име() throws Throwable {
		    loginForm.addUsername("Toni");
		}

		@When("^Въведе валидна потребителска парола$")
		public void въведе_валидна_потребителска_парола() throws Throwable {
			loginForm.addPassword("pass");
		    
		}

		@When("^Натисне на бутона за вход в системата$")
		public void натисне_на_бутона_за_вход_в_системата() throws Throwable {
		   loginForm.login();
		}

		@Then("^Показва се съобщение \"([^\"]*)\"$")
		public void показва_се_съобщение(String expectedMessage) throws Throwable {
			assertEquals(expectedMessage, loginForm.getMessage());
		    
		}

		@When("^Въведе  невалидно потребителско име$")
		public void въведе_невалидно_потребителско_име() throws Throwable {
			loginForm.addUsername("Tonigma");
		    
		}

		@When("^Въведе невалидна потребителска парола$")
		public void въведе_невалидна_потребителска_парола() throws Throwable {
			loginForm.addPassword("passTonigma");
		   
		}



	}
