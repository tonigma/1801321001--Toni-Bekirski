package com.fmi.library.model;

/**
 * 
 */
public class Book {

	/**
	 * Default constructor
	 */
	public Book() {
	}

	/**
	 * 
	 */
	private String isbn;

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private BookShelf bookShelf;

	/**
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return
	 */
	public BookShelf getBookShelf() {
		return bookShelf;
	}

	/**
	 * @param bookShelf
	 */
	public void setBookShelf(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

}