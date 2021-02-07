package com.fmi.library.ui;

public class HomeScreen {

	public LoginForm clickOnButton() {
		return new LoginForm();
	}

	public BookSearchForm openBookSearch() {
		return new BookSearchForm();
	}
	
	public BookCreationForm openBookCreationForm() {
		return new BookCreationForm();
	}
}
