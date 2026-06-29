/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typeseriesmanagerapp;

// Inheritance: Extends Series
public class DramaSeries extends Series {
    private boolean basedOnTrueStory;

    // Constructor calling superclass
    public DramaSeries(String title, int seasons, double rating, boolean basedOnTrueStory) {
        super(title, seasons, rating);
        this.basedOnTrueStory = basedOnTrueStory;
    }

    @Override
    public String getSeriesDetails() {
        String trueStory = basedOnTrueStory ? "Yes" : "No";
        return String.format("[Drama] %-20s | Seasons: %d | Rating: %.1f | True Story: %s", 
                getTitle(), getSeasons(), getRating(), trueStory);
    }
}
