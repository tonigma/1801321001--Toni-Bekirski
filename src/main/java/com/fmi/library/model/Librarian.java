package com.fmi.library.model;

/**
 * 
 */
public class Librarian extends User {

	 /**
     * Default constructor
     */
    public Librarian() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

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
        this.id=id;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName=lastName;
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
       this.library=library;
    }
}