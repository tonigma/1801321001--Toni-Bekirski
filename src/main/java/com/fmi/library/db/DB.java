package com.fmi.library.db;

import java.util.ArrayList;
import java.util.List;

import com.fmi.library.model.Book;
import com.fmi.library.model.Librarian;
import com.fmi.library.model.User;

public class DB {
	private List<User> userDB;
	private List<Book> books;

	public DB() {
		userDB = new ArrayList<User>();
		Librarian user = new Librarian();
		user.setUsername("Toni");
		user.setPassword("pass");
		userDB.add(user);

		books = new ArrayList<Book>();
		Book book = new Book();
		book.setIsbn("test123");
		book.setTitle("testtest");
		books.add(book);
	}

	public String login(String username, String password) {

		boolean userExists = userDB.stream()
				.anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
		return userExists ? "Влязохте в системата" : "Грешни данни";
	}

	public Book searchBook(String isbn, String title) {

		return books.stream().filter(book -> book.getIsbn().equals(isbn) && book.getTitle().equals(title)).findFirst()
				.orElse(null);
	}

	public String createBook(String isbn, String title) {
		Book book = new Book();
		book.setIsbn(isbn);
		book.setTitle(title);
		books.add(book);
		return "Успешно създаване";
	}

}
