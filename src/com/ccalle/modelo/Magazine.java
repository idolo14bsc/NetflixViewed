/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.modelo;

import java.util.Date;

/**
 *
 * @author LAB4-PC7
 */
public class Magazine {
    private int id;
    private Date editionDate;
    private String title;
    private String editorial;
    private String[] authors;

    public Magazine() {
    }

    public Magazine(int id, Date editionDate, String title, String editorial, String[] authors) {
        this.id = id;
        this.editionDate = editionDate;
        this.title = title;
        this.editorial = editorial;
        this.authors = authors;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the editionDate
     */
    public Date getEditionDate() {
        return editionDate;
    }

    /**
     * @param editionDate the editionDate to set
     */
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    
    
    
}
