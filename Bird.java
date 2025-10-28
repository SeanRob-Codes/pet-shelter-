/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

import java.util.Random;

// Bird.java
// Sean Robinson
// Lab 07: Bird
// Extends Pet with bird-specific traits.

public class Bird extends Pet {
    private String color;
    private double chirpingVolume;
    private boolean flightless;

    public Bird() {
        super("BIRD");  // ✅ Calls Pet constructor correctly

        Random rand = new Random();

        // Pet attributes
        setAge(rand.nextInt(84));                   // 0–83 years
        setHeight(2 + rand.nextDouble() * 48);      // 2–50 inches
        setWeight(0.01 + rand.nextDouble() * 3.49); // 0.01–3.5 pounds

        // Bird attributes
        String[] colors = {"BROWN", "TAN", "BEIGE", "WHITE", "GRAY", "BLACK", "MULTICOLOR"};
        color = colors[rand.nextInt(colors.length)];

        chirpingVolume = 65 + rand.nextDouble() * 60; // 65–125 decibels
        flightless = rand.nextBoolean();
    }

    // Getters
    public String getColor() { return color; }
    public double getChirpingVolume() { return chirpingVolume; }
    public boolean isFlightless() { return flightless; }

    // Setters
    public void setColor(String color) { this.color = color; }
    public void setChirpingVolume(double chirpingVolume) { this.chirpingVolume = chirpingVolume; }
    public void setFlightless(boolean flightless) { this.flightless = flightless; }

    // Display info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Chirping Volume: " + chirpingVolume);
        System.out.println("Flightless: " + flightless);
    }
}