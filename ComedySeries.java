/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typeseriesmanagerapp;

// Inheritance: Extends Series
public class ComedySeries extends Series {
    private String comedyStyle;

    public ComedySeries(String title, int seasons, double rating, String comedyStyle) {
        super(title, seasons, rating);
        this.comedyStyle = comedyStyle;
    }

    @Override
    public String getSeriesDetails() {
        return String.format("[Comedy] %-19s | Seasons: %d | Rating: %.1f | Style: %s", 
                getTitle(), getSeasons(), getRating(), comedyStyle);
    }
}
