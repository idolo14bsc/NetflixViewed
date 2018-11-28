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
public class Libro {
    int id;
    Date editionDate;
    String title,editorial,authors[],isbn;
    boolean readed;
    int timeReaded;

    public Libro() {
    }

    public Libro(int id, Date editionDate, String title, String editorial, String[] authors, String isbn, boolean readed, int timeReaded) {
        this.id = id;
        this.editionDate = editionDate;
        this.title = title;
        this.editorial = editorial;
        this.authors = authors;
        this.isbn = isbn;
        this.readed = readed;
        this.timeReaded = timeReaded;
    }
    
    
    
    
    
}
