package com.fmi.library.ui;

import org.apache.commons.lang.StringUtils;

import com.fmi.library.db.DB;

public class BookCreationForm {
	private String isbn;
	private String title;
	private String message;
	
	public void create() {
		boolean isAnyFieldFilled = StringUtils.isNotBlank(isbn) && StringUtils.isNotBlank(title);
		if (isAnyFieldFilled) {
			message = new DB().createBook(isbn, title);

		} else {
			message = "Попълнете всички полета";
		}
		
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}
	
}
