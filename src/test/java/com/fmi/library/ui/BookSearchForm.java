package com.fmi.library.ui;

import org.apache.commons.lang.StringUtils;

import com.fmi.library.db.DB;
import com.fmi.library.model.Book;

public class BookSearchForm {

	private String isbn;
	private String title;
	private String message;
	private Book searchResult;

	public void search() {
		boolean isAnyFieldFilled = StringUtils.isNotBlank(isbn) || StringUtils.isNotBlank(title);
		if (isAnyFieldFilled) {
			searchResult = new DB().searchBook(isbn, title);

		} else {
			message = "Попълнете някои от критериите";
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

	public Book getSearchResult() {
		return searchResult;
	}

}
