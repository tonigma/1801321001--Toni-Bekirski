package com.fmi.library.model;

import java.util.Set;

/**
 * 
 */
public class Library {


    /**
     * Default constructor
     */
    public Library() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String city;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Set<BookShelf> shelfs;

    /**
     * 
     */
    private Set<Librarian> librarians;

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
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city=city;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public Set<BookShelf> getShelfs() {
        return shelfs;
    }

    /**
     * @param shelfs
     */
    public void setShelfs(Set<BookShelf> shelfs) {
       this.shelfs=shelfs;
    }

    /**
     * @return
     */
    public Set<Librarian> getLibrarians() {
        return librarians;
    }

    /**
     * @param librarians
     */
    public void setLibrarians(Set<Librarian> librarians) {
        this.librarians=librarians;
    }
    
}