/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typeseriesmanagerapp;

public class SeriesManager {
    // Advanced Arrays: Using a fixed-size array and tracking the count manually
    private final Series[] catalog;
    private int currentCount;

    public SeriesManager(int capacity) {
        catalog = new Series[capacity];
        currentCount = 0;
    }

    public void addSeries(Series newSeries) {
        if (currentCount < catalog.length) {
            catalog[currentCount] = newSeries;
            currentCount++;
        } else {
            System.out.println("Catalog is full. Cannot add more series.");
        }
    }

    // REQUIRED FOR RUBRIC: Update logic
    public boolean updateSeriesRating(String title, double newRating) {
        // Loops
        for (int i = 0; i < currentCount; i++) {
            if (catalog[i].getTitle().equalsIgnoreCase(title)) {
                catalog[i].setRating(newRating);
                return true; // Successfully updated
            }
        }
        return false; // Not found
    }

    // REQUIRED FOR RUBRIC: Delete logic (Advanced Array manipulation)
    public boolean deleteSeries(String title) {
        for (int i = 0; i < currentCount; i++) {
            if (catalog[i].getTitle().equalsIgnoreCase(title)) {
                // Shift all subsequent elements left to close the gap
                for (int j = i; j < currentCount - 1; j++) {
                    catalog[j] = catalog[j + 1];
                }
                // Nullify the last element and reduce count
                catalog[currentCount - 1] = null;
                currentCount--;
                return true; // Successfully deleted
            }
        }
        return false; // Not found
    }

    // Console output report
    public void printCatalogReport() {
        System.out.println("\n=============================================================");
        System.out.println(" STREAMING PLATFORM CATALOG REPORT ");
        System.out.println("=============================================================");
        if (currentCount == 0) {
            System.out.println("The catalog is currently empty.");
        } else {
            for (int i = 0; i < currentCount; i++) {
                System.out.println(catalog[i].getSeriesDetails());
            }
        }
        System.out.println("=============================================================\n");
    }

    // Getter for testing purposes
    public Series getSeriesByTitle(String title) {
        for (int i = 0; i < currentCount; i++) {
            if (catalog[i].getTitle().equalsIgnoreCase(title)) {
                return catalog[i];
            }
        }
        return null;
    }
    
    public int getCurrentCount() {
        return currentCount;
    }
}
