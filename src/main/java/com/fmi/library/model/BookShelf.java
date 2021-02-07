package com.fmi.library.model;

import java.util.Set;

/**
 * 
 */
public class BookShelf {

	/**
	 * Default constructor
	 */
	public BookShelf() {
	}

	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private LiteratureType literatureType;

	/**
	 * 
	 */
	private Set<Book> books;

	/**
	 * 
	 */
	private Library library;

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public LiteratureType getLiteratureType() {
		return literatureType;
	}

	/**
	 * @param literatureType
	 */
	public void setLiteratureType(LiteratureType literatureType) {
		this.literatureType = literatureType;
	}

	/**
	 * @return
	 */
	public Library getLibrary() {
		return library;
	}

	/**
	 * @param library
	 */
	public void setLibrary(Library library) {
		this.library = library;
	}

	/**
	 * @return
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}