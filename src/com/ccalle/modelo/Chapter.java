/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.modelo;

/**
 *
 * @author LAB4-PC7
 */
public class Chapter  {
    private int id;
    private int duration;
    private int timeViewed;
    private String title;
    private short year;
    private boolean viewed;
    private int sessionNumber;

    public Chapter() {
    }

    public Chapter(int id, int duration, int timeViewed, String title, short year, boolean viewed, int sessionNumber) {
        this.id = id;
        this.duration = duration;
        this.timeViewed = timeViewed;
        this.title = title;
        this.year = year;
        this.viewed = viewed;
        this.sessionNumber = sessionNumber;
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
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the timeViewed
     */
    public int getTimeViewed() {
        return timeViewed;
    }

    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
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
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the sessionNumber
     */
    public int getSessionNumber() {
        return sessionNumber;
    }

    /**
     * @param sessionNumber the sessionNumber to set
     */
    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
    
    
    
    
    
}
