/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typeseriesmanagerapp;

public class Main {
    public static void main(String[] args) {
        // Initialize manager with an array capacity of 10
        SeriesManager manager = new SeriesManager(10);

        // Populate array via constructors
        manager.addSeries(new DramaSeries("Breaking Bad", 5, 9.5, false));
        manager.addSeries(new DramaSeries("Chernobyl", 1, 9.4, true));
        manager.addSeries(new ComedySeries("The Office", 9, 8.9, "Mockumentary"));
        manager.addSeries(new ComedySeries("Brooklyn 99", 8, 8.4, "Sitcom"));

        System.out.println("INITIAL DATA:");
        manager.printCatalogReport();

        // Demonstrate Updating
        System.out.println("Action: Updating 'The Office' rating to 9.2...");
        manager.updateSeriesRating("The Office", 9.2);

        // Demonstrate Deleting
        System.out.println("Action: Deleting 'Chernobyl'...");
        manager.deleteSeries("Chernobyl");

        System.out.println("\nUPDATED DATA:");
        // Generate final report
        manager.printCatalogReport();
    }
}

